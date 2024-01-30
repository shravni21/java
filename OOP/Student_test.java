package OOP;
//properties: roll_no, name, course, marks;

import java.util.Scanner;

//methods: total, average, grade

class Student {
    public int roll_no;
    public int maths, physics, chemistry;
    public String name, course;

    public int total_marks() {
        return maths + physics + chemistry;
    }

    public double average() {
        return (double) (maths + physics + chemistry) / 3;

    }

    public char grade() {
        double marks = (double) (physics + chemistry + maths) / 3;
        if (marks >= 90)
            return 'A';
        else if (marks >= 80 && marks < 90)
            return 'B';
        else if (marks >= 60 && marks < 80)
            return 'C';
        else
            return 'F';
    }
}

public class Student_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.println("Enter your name: ");
        st.name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        st.roll_no = sc.nextInt();
        System.out.println("Enter your marks manually: ");
        System.out.println("Physics ");
        st.physics = sc.nextInt();
        System.out.println("Chemistry ");
        st.chemistry = sc.nextInt();
        System.out.println("Mathematics ");
        st.maths = sc.nextInt();
        System.out.println("Your total marks out of 300: " + st.total_marks());
        System.out.println("Average marks: " + st.average());
        System.out.println("You scored: \"" + st.grade() + "\"grade");

    }
}
