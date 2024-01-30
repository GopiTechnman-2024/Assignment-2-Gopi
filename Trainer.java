import java.util.List;
import java.util.Objects;

public class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private String contactNumber;
    private List<TechStack> techStacks;

    // Constructor

    public Trainer(int trainerId, String name, String email, String contactNumber, List<TechStack> techStacks) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStacks = techStacks;
    }

    // Getter and Setter methods

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
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

    public List<TechStack> getTechStacks() {
        return techStacks;
    }

    public void setTechStacks(List<TechStack> techStacks) {
        this.techStacks = techStacks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return trainerId == trainer.trainerId &&
               Objects.equals(name, trainer.name) &&
               Objects.equals(email, trainer.email) &&
               Objects.equals(contactNumber, trainer.contactNumber) &&
               Objects.equals(techStacks, trainer.techStacks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId, name, email, contactNumber, techStacks);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", techStacks=" + techStacks +
                '}';
    }
}