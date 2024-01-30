import java.util.List;

public class Question {
    private int questionId;
    private List<Answer> answers;
    private String answerKey;
    private int score;
    private int techStackId;
    private int assignmentId;

    // Constructor

public Question(int questionId, List<Answer> answers, String answerKey, int score, int techStackId, int assignmentId) {
    this.questionId = questionId;
    this.answers = answers;
    this.answerKey = answerKey;
    this.score = score;
    this.techStackId = techStackId;
    this.assignmentId = assignmentId;
}

// Getter and Setter methods

public int getQuestionId() {
    return questionId;
}

public void setQuestionId(int questionId) {
    this.questionId = questionId;
}

public List<Answer> getAnswers() {
    return answers;
}

public void setAnswers(List<Answer> answers) {
    this.answers = answers;
}

public String getAnswerKey() {
    return answerKey;
}

public void setAnswerKey(String answerKey) {
    this.answerKey = answerKey;
}

public int getScore() {
    return score;
}

public void setScore(int score) {
    this.score = score;
}

public int getTechStackId() {
    return techStackId;
}

public void setTechStackId(int techStackId) {
    this.techStackId = techStackId;
}

public int getAssignmentId() {
    return assignmentId;
}

public void setAssignmentId(int assignmentId) {
    this.assignmentId = assignmentId;
}

@Override
public String toString() {
    return "Question{" +
            "questionId=" + questionId +
            ", answers=" + answers +
            ", answerKey='" + answerKey + '\'' +
            ", score=" + score +
            ", techStackId=" + techStackId +
            ", assignment=" + assignment +
            '}';
}


}