package day24_csv;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadCSV {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/day24_csv/1000 Sales Records.csv");
        Files.lines(path).forEach(System.out::println);
    }
}
