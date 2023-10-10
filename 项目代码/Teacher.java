public class Teacher {
    private int id;
    private String name;
    private String gender;
    private Course course;

    public Teacher(int id, String name, String gender, Course course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
    }

    // getters, setters...
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
