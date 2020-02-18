package nio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class nio01 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("/home/reone/IdeaProjects/next-project/src/main/java/nio/fileOne.txt");
        System.out.println("/t File name: " + file.getFileName());
        System.out.println(file.getRoot());
        System.out.println(file.getParent());
        System.out.println();

        for (Path p : file) {
            System.out.println(p);
        }
        System.out.println();
        String s;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "/home/reone/IdeaProjects/next-project/src/main/java/nio/fileOne.txt"));
        s = bufferedReader.readLine();
        while (s != null) {
            System.out.println(s);
            s = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
