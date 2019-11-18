package day24_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeDemo {

    public static void main(String[] args) {
        Path path1 = Paths.get("home");
        Path path2 = Paths.get("home/sally/bar");
        Path path1_to_path2 = path1.relativize(path2);
        Path path2_to_path1 = path2.relativize(path1);
        System.out.println(path1_to_path2);
        System.out.println(path2_to_path1);
    }
}
