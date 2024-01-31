import java.util.List;
import java.util.Objects;

public class Assignment {
    private int assignmentId;
    private String title;
    private String description;
    private String dueDate;
    private List<Question> questions;

    // Constructor

    public Assignment(int assignmentId, String title, String description, String dueDate, List<Question> questions) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.questions = questions;
    }

    // Getter and Setter methods

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

       // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return assignmentId == that.assignmentId &&
               Objects.equals(title, that.title) &&
               Objects.equals(description, that.description) &&
               Objects.equals(dueDate, that.dueDate) &&
               Objects.equals(questions, that.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, title, description, dueDate, questions);
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", questions=" + questions +
                '}';
    }
}