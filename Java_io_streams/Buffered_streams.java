package Java_io_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Buffered_streams {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/HP/java/Text.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        // int x;
        // while ((x = bis.read()) != -1) {
        // System.out.print((char) x);
        // }
        // System.out.println();
        // System.out.println("File: " + fis.markSupported());
        // System.out.println("Buffered: " + bis.markSupported());

        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.mark(4);
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.reset();
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
    }
}
