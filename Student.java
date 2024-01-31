import java.util.List;
import java.util.Objects;

public class Student {
    private int studentId;
    private String name;
    private String email;
    private String contactNumber;

    // Constructor

    public Student(int studentId, String name, String email, String contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getter and Setter methods

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
               Objects.equals(name, student.name) &&
               Objects.equals(email, student.email) &&
               Objects.equals(contactNumber, student.contactNumber);
    }

    

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, email, contactNumber);
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    public double calculateOverallPercentage(ResultData resultData) {
        List<Result> results = resultData.getResultsByStudent(this);

        if (results.isEmpty()) {
            return 0.0;  // Avoid division by zero
        }

        double totalScore = results.stream()
                .mapToDouble(Result::getScore)
                .sum();

        double totalPossibleScore = results.size() * maximumScorePerResult();  // Adjust this based on your scoring system

        if (totalPossibleScore == 0) {
            return 0.0;  // Avoid division by zero
        }

        return (totalScore / totalPossibleScore) * 100;
    }

    private double maximumScorePerResult() {
        // You need to define how much a single result contributes to the total score
        // Adjust this based on your scoring system
        return 10.0;  // Example: Each result has a maximum score of 10
    }

}