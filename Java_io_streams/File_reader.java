package Java_io_streams;

import java.io.FileReader;
import java.io.IOException;

public class File_reader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("./Text.txt")) {
            // byte b[] = new byte[fr.available()];
            // fr.read(b);
            // String s = new String(b);
            // System.out.println(s);

            // --------by byte by byte-------
            // int x;
            // do {
            // x = fr.read();
            // if (x != -1)
            // System.out.print((char) x);
            // } while (x != -1);

            // --------by byte by byte-------
            int x;

            while ((x = fr.read()) != -1) {
                System.out.print((char) x);
            }

        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
