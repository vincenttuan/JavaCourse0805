package day24_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FilesWalk {

    public static void main(String[] args) throws Exception {
        System.out.println(Paths.get(System.getProperty("user.home")));
        Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
        files.forEach(fName -> {
            try {
                Path aPath = fName.toAbsolutePath(); 
                System.out.print(fName + ":");
                System.out.println(Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
            } catch (IOException ex) {
            }
        });
    }
}
