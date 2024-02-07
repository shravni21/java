package Java_io_streams;

import java.io.*;

class Students implements Serializable {
    private int roll_no;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Students() {

    }

    public Students(int rn, String name, float avg, String dept) {
        roll_no = rn;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        Data = 500;
        t = 500;

    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll " + roll_no +
                "\nName " + name +
                "\nAverage " + avg +
                "\nDept " + dept +
                "\nData " + Data +
                "\nTransient " + t + "\n";
    }
}

public class Object_streams_and_serialisation {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Users/HP/java/student2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(10, "John", 89.9f, "CSE");

        oos.writeObject(s);

        fos.close();
        oos.close();

    }

    // public static void main(String[] args) throws Exception {
    // FileInputStream fis = new FileInputStream("C:\\MyJava\\Student3.txt");
    // ObjectInputStream ois = new ObjectInputStream(fis);

    // Student s = (Student) ois.readObject();

    // System.out.println(s);

    // fis.close();
    // ois.close();

    // }
}
