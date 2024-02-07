package Java_io_streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Byte_Input_stream {
    public static void main(String[] args) throws IOException {

        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // ------ method1 ---------
        String s = new String(bis.readAllBytes());
        System.out.println(s);

        // ------ method2 ----------
        int x;
        while ((x = bis.read()) != -1) {
            System.out.println((char) x);
        }
        System.out.println(bis.markSupported());

        bis.close();
    }
}
