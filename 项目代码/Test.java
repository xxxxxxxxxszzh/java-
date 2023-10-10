public class Test {
    public static void main(String[] args) {
        // 创建教师和课程
        Teacher teacher = new Teacher(1, "张三", "男", null);
        Course course = new Course(101, "Java编程", "教学楼A201", "周三 3-5节", teacher);
        teacher.setCourse(course);

        // 学生选课
        Student student = new Student(1001, "李四", "男", null);
        student.setSelectedCourse(course);

        // 打印学生课表信息
        printStudentSchedule(student);
    }

    // 打印学生课表信息的方法
    public static void printStudentSchedule(Student student) {
        Course c = student.getSelectedCourse();
        System.out.println("学生编号：" + student.getId());
        System.out.println("课程名称：" + c.getCourseName());
        System.out.println("上课地点：" + c.getLocation());
        System.out.println("上课时间：" + c.getTime());
        System.out.println("授课教师：" + c.getTeacher().getName());
    }
}
