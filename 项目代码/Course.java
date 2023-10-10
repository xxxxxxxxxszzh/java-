public class Course {
    private int id;
    private String courseName;
    private String location;
    private String time;
    private Teacher teacher;

    public Course(int id, String courseName, String location, String time, Teacher teacher) {
        this.id = id;
        this.courseName = courseName;
        this.location = location;
        this.time = time;
        this.teacher = teacher;
    }

    // getters, setters...
    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
