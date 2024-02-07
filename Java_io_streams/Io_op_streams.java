package Java_io_streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// IO Streams
public class Io_op_streams {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("./Text.txt");
            String str = "Currently learning Input Output stream.";
            // byte b[] = str.getBytes();
            // for (byte x : b) {
            // fo.write(x);
            // }
            fo.write(str.getBytes());
            // fo.write(b, 6, b.length - 6);
            fo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
