import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Training {
    public static void main(String[] args) {
        // Create students
        List<Student> students = createStudents(10);

        // Create trainers
        List<Trainer> trainers = createTrainers(3);

        // Create tech stacks
        List<TechStack> techStacks = createTechStacks(5);

        // Create assignments with questions
        List<Assignment> assignments = createAssignments(4, 4, techStacks);

        // Create results
        List<Result> results = createResults(students, assignments, trainers);

        // Create ResultData
        ResultData resultData = new ResultData(results);

        // Calculate the highest-performing student
        Student highestPerformingStudent = resultData.findHighestPerformingStudent();
        System.out.println("Highest Performing Student: " + highestPerformingStudent.getName());
        System.out.println("Percentage: " + highestPerformingStudent.calculateOverallPercentage(resultData));

        // Display all results
        System.out.println("All Results: ");
        System.out.println(resultData.printUniqueStudentInfo());

        Student secondhighestPerformingStudent = resultData.findSecondHighestPerformingStudent();
        System.out.println("Second highest student :");
        System.out.println(secondhighestPerformingStudent.getName());
        System.out.println(secondhighestPerformingStudent.calculateOverallPercentage(resultData));



        List<Student> overallRanking = resultData.findOverallRanking();
        
        System.out.println("Overall Ranking by Scores:");
        for (int i = 0; i < overallRanking.size(); i++) {
            System.out.println((i + 1) + ". " + overallRanking.get(i).getName());
        }

        System.out.println("List of studnets who needs improvement:");
       List<Student> ListofstudentsforImprovement= resultData.getStudentsNeedImprovement();
       for (int i = 0; i < ListofstudentsforImprovement.size(); i++) {
        System.out.println((i + 1) + ". " +ListofstudentsforImprovement.get(i).getName());
    }

      // Test case: Get all results for student "student10"
      List<Result> student10Results = resultData.getResultsForStudent("Student10");

      if (student10Results != null) {
          System.out.println("Results for student10:");
          for (Result result : student10Results) {
              System.out.println("Result ID: " + result.getResultId());
              System.out.println("Assignment: " + result.getAssignment().getTitle());
              System.out.println("Score: " + result.getScore());
              System.out.println("Feedback: " + result.getFeedback());
              System.out.println("Submission Date: " + result.getSubmissionDate());
              System.out.println("------------------------------");
          }
      } else {
          System.out.println("Student not found.");
      }

      // Get all students' results and their scores on all individual assignments and questions
      List<Student> allStudents = resultData.getAllStudents();
        
      for (Student student : allStudents) {
          System.out.println("Results for " + student.getName() + ":");
          
          List<Result> studentResults = resultData.getResultsByStudent(student);
          
          for (Result result : studentResults) {
              System.out.println("Assignment: " + result.getAssignment().getTitle());
              System.out.println("Score: " + result.getScore());
              System.out.println("Feedback: " + result.getFeedback());
              
              for (Question question : result.getAssignment().getQuestions()) {
                  System.out.println("  Question: " + question.getQuestionId());
                  System.out.println("    Score: " + result.getScore()); // You may want to retrieve question-specific scores here
              }
              
              System.out.println("------------------------------");
          }
          
          System.out.println();
      }
    }

        
    

    private static List<Student> createStudents(int count) {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            students.add(new Student(i, "Student" + i, "email" + i + "@example.com", "123456789" + i));
        }
        return students;
    }

    private static List<Trainer> createTrainers(int count) {
        List<Trainer> trainers = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            trainers.add(new Trainer(i, "Trainer" + i, "trainer" + i + "@example.com", "987654321" + i, new ArrayList<>()));
        }
        return trainers;
    }

    private static List<TechStack> createTechStacks(int count) {
        List<TechStack> techStacks = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            techStacks.add(new TechStack(i, "TechStack" + i, "Description" + i));
        }
        return techStacks;
    }

    private static List<Assignment> createAssignments(int assignmentCount, int questionsPerAssignment, List<TechStack> techStacks) {
        List<Assignment> assignments = new ArrayList<>();
        for (int i = 1; i <= assignmentCount; i++) {
            Assignment assignment = new Assignment(i, "Assignment" + i, "Description" + i, "2022-02-01", new ArrayList<>());
            for (int j = 1; j <= questionsPerAssignment; j++) {
                List<Answer> answers = createAnswers(4);
                int techStackId = techStacks.get(new Random().nextInt(techStacks.size())).getTechStackId();
                assignment.getQuestions().add(new Question(j, answers, "Key" + j, 10, techStackId, assignment.getAssignmentId()));
            }
            assignments.add(assignment);
        }
        return assignments;
    }

    private static List<Answer> createAnswers(int answerCount) {
        List<Answer> answers = new ArrayList<>();
        for (int i = 1; i <= answerCount; i++) {
            answers.add(new Answer(i, "Answer" + i));
        }
        return answers;
    }

    private static List<Result> createResults(List<Student> students, List<Assignment> assignments, List<Trainer> trainers) {
        List<Result> results = new ArrayList<>();
        int resultId = 1;
        for (Student student : students) {
            for (Assignment assignment : assignments) {
                for (Trainer trainer : trainers) {
                    int score = (int) (Math.random() * 10) + 1; // Random score between 1 and 10
                    results.add(new Result(resultId++, student, assignment, trainer, score, "Feedback", "2022-02-01"));
                }
            }
        }
        return results;
    }
}
