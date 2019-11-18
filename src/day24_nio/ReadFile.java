package day24_nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        File file = new File("src/day24_nio/news.txt");
        Path path = file.toPath();
        Files.readAllLines(path).forEach(System.out::println);
    }
            
}
