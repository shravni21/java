package Java_io_streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_output_stream {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        // ------ method1 ---------
        bos.write('s');
        bos.write('h');
        bos.write('r');
        bos.write('a');
        bos.write('v');
        bos.write('n');
        bos.write('i');

        // byte b[] = bos.toByteArray();
        // for (byte x : b) {
        // System.out.println((char) x);
        // }

        // ------ method2 ----------
        bos.writeTo(new FileOutputStream("C:/Users/HP/java/Text.txt"));

        bos.close();
    }
}
