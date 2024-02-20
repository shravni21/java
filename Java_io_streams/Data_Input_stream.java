package Java_io_streams;

import java.io.*;

class Student {

    int rollno;
    String name;
    float avg;
    String dept;

}

public class Data_Input_stream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/java/student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s1 = new Student();
        s1.rollno = 10;
        s1.name = "John";
        s1.dept = "CSE";
        s1.avg = 75.9f;
        dos.writeInt(s1.rollno);
        dos.writeUTF(s1.name);
        dos.writeUTF(s1.dept);
        dos.writeFloat(s1.avg);
        dos.close();
        fos.close();

    }
}
