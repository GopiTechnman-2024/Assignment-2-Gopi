import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ResultData {
    private List<Result> results;

    // Constructor

    public ResultData(List<Result> results) {
        this.results = results;
    }

    // Method to add a result

    public void addResult(Result result) {
        results.add(result);
    }

    public List<Result> getResultsByStudent(Student student) {
        List<Result> resultsByStudent = new ArrayList<>();
    
        for (Result result : results) {
            if (result.getStudent() == student) {
                resultsByStudent.add(result);
            }
        }
    
        return resultsByStudent;
    }
    

        
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultData that = (ResultData) o;
        return Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }
    @Override
public String toString() {
    StringBuilder resultString = new StringBuilder("All Results:\n");

    for (Result result : results) {
        Student student = result.getStudent();
        double percentage = student.calculateOverallPercentage(this);
        resultString.append("Student: ").append(student.getName()).append(", Percentage: ").append(percentage).append("\n");
    }

    return resultString.toString();
}
// New method to print unique student information
    public String printUniqueStudentInfo() {
        StringBuilder resultString = new StringBuilder("Unique Student Information:\n");
        Set<Student> uniqueStudents = new HashSet<>();

        for (Result result : results) {
            Student student = result.getStudent();

            if (uniqueStudents.add(student)) {
                double percentage = student.calculateOverallPercentage(this);
                resultString.append("Student: ").append(student.getName()).append(", Percentage: ").append(percentage).append("\n");
            }
        }

        return resultString.toString();
    }

    

    // New method to find the highest-performing student
    public Student findHighestPerformingStudent() {
        return results.stream()
                .filter(result -> result.getStudent() != null)
                .max(Comparator.comparingDouble(result -> {
                    Student student = result.getStudent();
                    return student.calculateOverallPercentage(this);
                }))
                .map(Result::getStudent)
                .orElse(null);
    }
    

    public Student findSecondHighestPerformingStudent() {
        List<Student> distinctStudents = results.stream()
                .map(Result::getStudent)
                .distinct()
                .collect(Collectors.toList());

        if (distinctStudents.size() < 2) {
            return null;
        }

        distinctStudents.sort(Comparator.comparingDouble(student -> ((Student) student).calculateOverallPercentage(this)).reversed());

        return distinctStudents.get(1);
    }

     // New method to find the overall ranking of students by scores
     public List<Student> findOverallRanking() {
        return results.stream()
                .filter(result -> result.getStudent() != null)
                .map(Result::getStudent)
                .distinct()
                .sorted(Comparator.comparingDouble(student -> calculateTotalScoreForStudent((Student) student)).reversed())
                .collect(Collectors.toList());
    }

    // Helper method to calculate the total score for a student
    private double calculateTotalScoreForStudent(Student student) {
        return results.stream()
                .filter(result -> result.getStudent() != null && result.getStudent().equals(student))
                .mapToDouble(Result::getScore)
                .sum();
    }

    public List<Student> getStudentsNeedImprovement() {
        return results.stream()
                .map(Result::getStudent)
                .distinct()
                .filter(student -> student.calculateOverallPercentage(this) < 60)
                .collect(Collectors.toList());
    }

    public List<Result> getResultsByStudentName(String studentName) {
        return results.stream()
                .filter(result -> result.getStudent().getName().equals(studentName))
                .collect(Collectors.toList());
    }

    // New method to get all results for a specific student with scores
    public List<Result> getResultsForStudent(String studentName) {
        Student student = findStudentByName(studentName);
        if (student == null) {
            // Student not found
            return null;
        }

        return results.stream()
                .filter(result -> result.getStudent().equals(student))
                .collect(Collectors.toList());
    }

    private Student findStudentByName(String studentName) {
        return results.stream()
                .map(Result::getStudent)
                .filter(student -> student.getName().equals(studentName))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAllStudents() {
        return results.stream()
                .map(Result::getStudent)
                .distinct()
                .toList();
    }
}

    
  
