package Java_io_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student {
    public Student(int i, String string, float f, String string2) {
        // TODO Auto-generated constructor stub
    }

    int roll_no;
    String name;
    String dept;
}

public class Print_stream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("C:/Users/HP/java/student1.txt");
        PrintStream ps = new PrintStream(fo);
        Student s = new Student();
        s.roll_no = 10;
        s.dept = "Information Technology";
        s.name = "Shravni Wakde";
        ps.println(s.roll_no);
        ps.println(s.name);
        ps.println(s.dept);
        ps.close();
        fo.close();
    }
}
