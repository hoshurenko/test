package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class nio02 {
    public static void main(String[] args) {
        try {
            List<String> list = Files.readAllLines(Paths.get(
                    "/home/reone/IdeaProjects/next-project/src/main/java/nio/fileOne.txt"));
            for (String line : list) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
