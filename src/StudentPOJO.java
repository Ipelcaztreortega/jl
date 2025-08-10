public class StudentPOJO {
    private String id;
    private String name;
    private String birthName;
    private String classList;

    // Creating a constructor
    public StudentPOJO(String id, String name, String birthName, String classList) {
        this.id = id;
        this.name = name;
        this.birthName = birthName;
        this.classList = classList;
    };

    // Method which prints out all attribute, using the toString method, which lets us print out the current state of our object
    // Adds @, an annotation. A type of metadata, which helps describe information about out code
    // This @Override is one of the most common annotations, tells compiler this is a special type of method
    @Override
    public String toString() {
        return "StudentPOJO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthName='" + birthName + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    };

    // getters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthName() {
        return birthName;
    }

    public String getClassList() {
        return classList;
    }


    // setters


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthName(String birthName) {
        this.birthName = birthName;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
