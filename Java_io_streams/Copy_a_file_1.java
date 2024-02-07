package Java_io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_a_file_1 {
    public static void main(String[] args) {
        try (FileInputStream fi = new FileInputStream("./source1.txt");
                FileOutputStream fo = new FileOutputStream("./source2.txt")) {
            int b;
            while ((b = fi.read()) != -1) {
                if (b >= 65 && b <= 90)
                    fo.write(b + 32);
                else
                    fo.write(b);
            }
            fi.close();
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
