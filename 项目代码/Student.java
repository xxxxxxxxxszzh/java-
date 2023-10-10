public class Student {
    private int id;
    private String name;
    private String gender;
    private Course selectedCourse;

    public Student(int id, String name, String gender, Course selectedCourse) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.selectedCourse = selectedCourse;
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

    public Course getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(Course selectedCourse) {
        this.selectedCourse = selectedCourse;
    }
}
