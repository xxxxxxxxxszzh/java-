# 实验报告二：学生选课模拟系统
### 詹振华  2022310531

---

## 一、实验目的
- 学会定义类中的属性以及方法。
- 掌握面向对象的类设计方法（属性、方法）。
- 掌握通过构造方法实例化对象。

---

## 二、实验要求
- 编写教师、学生、课程实体类和测试主类。
- 在测试主类中，模拟教师开设课程，学生选课，退课，以及打印学生课表信息。

---

## 三、实验过程
1. 设计了三个基础实体类：`Teacher`、`Student`和`Course`。
2. 在每个类中定义了相应的属性和方法。
3. 在`Test`主类中，进行了模拟操作，如教师开设课程、学生选课等。
4. 使用静态方法打印学生的课表信息。

---

## 四、流程图
1. 开始。
2. 创建教师和课程实例。
3. 学生选择课程。
4. 打印学生的课程信息。
5. 结束。

---

## 五、解题思路与详解
### 1. 定义系统角色类
首先要设计基础的实体。为确保代码的扩展性，我们设计了一个`People`类，该类包含所有人员（如教师和学生）的通用属性。

### 2. 逻辑关系挖掘
由题意得，学生选择了课程，课程又由教师教授。这建立了一个逻辑链：学生 -> 课程 -> 教师。这表明我们在`Student`类中可以有一个`Course`对象，并在`Course`类中有一个`Teacher`对象。

### 3. 属性与方法
在定义这些实体类时，需要为每个类添加特定的属性和方法。`People`类应该有基本的属性，如`id`、`name`和`sex`。`Teacher`和`Student`类都可以从`People`类继承这些属性。

### 4. 覆盖toString方法
为了便于打印和调试，在每个类中覆盖`toString`方法，使其返回有关对象的有意义的字符串。

### 5. 主页设计
需要一个中心点从中管理和访问所有功能。`IndexTest`类作为应用程序的入口点，它会显示一个GUI窗口，其中包含按钮来访问其他功能。

### 6. 功能模块

有四个主要功能模块：选课 (`ChoiceSubject`)、退课 (`QuitSubjects`)、打印课表 (`PrintSubjects`) 和添加课程 (`AppendSubjects`)。每个模块都有一个独特的GUI界面和与之相关的操作。

### 7. 登录与注册

`LoginTest`类处理登录和注册。学生可以注册新账户，而管理员使用预设的账户登录。登录后，系统将重定向用户到适当的界面。

### 8. 文件操作

为了实现数据的持久性，使用`FileOperations`类来读取和写入文件。这确保了数据在程序关闭后仍然存在，并在下次打开程序时可用。

---


## 六、变量和类详解

### 1. People类
**变量**:
- `id`
- `name`
- `sex`

**方法**:
- 构造函数
- `getters`
- `setters`
- `toString`

### 2. Teacher类 (继承自 People)
**变量**:
- 特定于教师的任何其他属性

**方法**:
- 构造函数
- 与教学有关的方法

### 3. Student类 (继承自 People)
**变量**:
- `selectedCourse` (表示学生选择的课程)

**方法**:
- `selectCourse`
- `dropCourse`
- 与学生有关的其他方法

### 4. Course类
**变量**:
- `courseName`
- `location`
- `time`
- `teacher` (表示教授该课程的老师)

**方法**:
- 构造函数
- 获取关于课程的信息的方法

### 5. FileOperations类
**方法**:
- `readFile`
- `writeFile` 用于读取和写入数据

### 6. 其他GUI相关类
具体的实现细节取决于需求和设计，但基本上，每个GUI类都会有与其表示的功能相关的组件和事件处理程序。

---

## 七、系统运行结果

学生编号：1001
课程名称：Java编程
上课地点：教学楼A201
上课时间：周三 3-5节
授课教师：张三

---

## 八、感想

​       通过此次实验，我更加深入地了解了面向对象编程的概念和实践。从定义类的属性和方法，到通过构造方法实例化对象，再到模拟实际的业务流程，我得到了宝贵的实践经验。此外，我也认识到在设计系统前进行充分的需求分析和设计是非常重要的，它可以确保我们的系统满足用户的需求并且有良好的扩展性。



## 附录：项目代码

```java
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
```
