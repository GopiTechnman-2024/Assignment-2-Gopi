import java.util.Objects;

class TechStack {
    private int techStackId;
    private String name;
    private String description;

    // Constructor

    public TechStack(int techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    // Getter and Setter methods

    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechStack techStack = (TechStack) o;
        return techStackId == techStack.techStackId &&
               Objects.equals(name, techStack.name) &&
               Objects.equals(description, techStack.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(techStackId, name, description);
    }

    @Override
    public String toString() {
        return "TechStack{" +
                "techStackId=" + techStackId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
