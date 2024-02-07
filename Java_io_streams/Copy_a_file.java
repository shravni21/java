package Java_io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_a_file {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./source1.txt")) {
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String s = new String(b);
            s = s.toLowerCase();
            // System.out.println(s);
            FileOutputStream fo = new FileOutputStream("./source2.txt");
            fo.write(s.getBytes());
            fo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
