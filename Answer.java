import java.util.Objects;

class Answer {
    private int answerId;
    private String text;

    // Constructor

    public Answer(int answerId, String text) {
        this.answerId = answerId;
        this.text = text;
    }

    // Getter and Setter methods

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return answerId == answer.answerId &&
               Objects.equals(text, answer.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, text);
    }

    @Override
public String toString() {
    return "Answer{" +
            "answerId=" + answerId +
            ", text='" + text + '\'' +
            '}';
}

}
