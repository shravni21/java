package Java_io_streams;

import java.io.File;
import java.io.IOException;

public class File_Class {
    public static void main(String[] args) throws IOException {
        File f = new File("C:/Users/HP/java");
        f.setWritable(true);
        f.setLastModified(10);
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();
        for (File x : list) {
            System.out.print(x.getName() + " ");
            System.out.println();
            // System.out.println("Path: " + x.getPath());
            System.out.println(x.getCanonicalPath());
        }

    }
}
