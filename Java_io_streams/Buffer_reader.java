package Java_io_streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Buffer_reader {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("C:/Users/HP/java/student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fi));
        Student s = new Student();
        s.roll_no = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println("Roll Number: " + s.roll_no);
        System.out.println("Name: " + s.name);
        System.out.println("Department: " + s.dept);

    }
}
