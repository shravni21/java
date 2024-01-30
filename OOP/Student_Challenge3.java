package OOP;
// Check again to resolve the error

class Subject {
    private String sub_id;
    private String name;
    private int max_marks;
    private int marks;

    public Subject(String sub_id) {
        this.sub_id = sub_id;
    }

    public Subject(String sub_id, String name) {
        this.sub_id = sub_id;
        this.name = name;
    }

    public Subject(String sub_id, String name, int max_marks, int marks) {
        this.sub_id = sub_id;
        this.name = name;
        setMaxmarks(max_marks);
        setMarks(marks);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setMaxmarks(int max_marks) {
        this.max_marks = max_marks;
    }

    public int getMaxmarks() {
        return max_marks;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String roll_no;
    private String name;
    private String department;
    private String[] subjects;

    public Student(String roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public Student(String roll_no, String name, String department, String... subjects) {
        this.roll_no = roll_no;
        this.name = name;
        setDepartment(department);
        setSubjects(subjects);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSubjects(String... subjects) {
        this.subjects = new String[subjects.length];
        for (int i = 0; i < subjects.length; i++) {
            this.subjects[i] = subjects[i];
        }
    }

    public String getDepartment() {
        return department;
    }

    public String[] getSubjects() {
        return subjects;
    }

}

public class Student_Challenge3 {

    public static void main(String[] args) {
        Student s = new Student("I09", "Shravni", "Information Technology", "Physics", "Chemistry", "Mathematics",
                "English", "Sanskrit");

        System.out.println("Your Department is: " + s.getDepartment());

    }
}
