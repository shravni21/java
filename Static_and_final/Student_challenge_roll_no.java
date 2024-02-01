
// The roll numbers of students should be automatically generated.

import java.text.DecimalFormat;
import java.util.Date;

class Student {
    private String roll_number, name, department;
    private static Integer cnt = 001;

    private String generateRollNo() {
        Date d = new Date();
        DecimalFormat df = new DecimalFormat("000");
        String register = (d.getYear() + 1900) + "BIT" + df.format(cnt);
        cnt++;
        return register;

    }

    public Student(String name, String department) {
        roll_number = generateRollNo();
        this.name = name;
        this.department = department;
    }

    public void print_details() {
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

}

public class Student_challenge_roll_no {
    public static void main(String[] args) {
        Student s = new Student("Shravni", "Information Technology");
        s.print_details();
        Student s1 = new Student("Saie", "Computer Science");
        s1.print_details();
    }
}
