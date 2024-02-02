package Multithreading;

// Order maynot be same in multi threading.
// Example of race condition

class WhiteBoard {
    String text;
    int no_of_students = 0, cnt = 0;
    boolean flag;

    public void Attendance() {
        no_of_students++;
    }

    synchronized public void Write(String s) {
        System.out.println("Teacher is writing: " + s);
        while (cnt != 0)
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        text = s;
        cnt = no_of_students;
        notifyAll();
    }

    synchronized public String Read() {
        System.out.println("Student is reading: " + text);
        while (cnt == 0)
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        String t = text;
        cnt--;
        if (cnt == 0)
            notify();
        return t;

    }

}

class Teacher extends Thread {
    WhiteBoard wb;
    String notes[] = { "Java is platform independent.", "C++ is also oop language.", "Be ready",
            "Exam is scheduled on monday.", "Be present.", "end" };

    public Teacher(WhiteBoard w) {
        wb = w;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {
            wb.Write(notes[i]);
        }
    }

}

class Student extends Thread {
    String name;
    WhiteBoard wb;

    public Student(String s, WhiteBoard w) {
        name = s;
        wb = w;
    }

    public void run() {
        String text;
        wb.Attendance();
        do {
            text = wb.Read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        } while (!text.equals("end"));
    }
}

public class Teacher_student_problem_producer_consumer {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student("1. Shravni", wb);
        Student s2 = new Student("2. Pratiksha", wb);
        Student s3 = new Student("3. Sneha", wb);
        Student s4 = new Student("4. Gauri", wb);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}
