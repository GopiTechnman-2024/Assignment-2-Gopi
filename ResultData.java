import java.util.List;
import java.util.Objects;

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

    // Method to get results by student

    // public List<Result> getResultsByStudent(Student student) {
    //     // Implement logic to filter results by student
    //     // ...
    //     return List<Result>;
    // }

    // equals and hashCode methods

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
}