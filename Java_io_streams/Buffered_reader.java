package Java_io_streams;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffered_reader {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:/Users/HP/java/Text.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println((char) br.read());
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        br.mark(4);
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        br.reset();
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        System.out.println(br.readLine());
    }
}
