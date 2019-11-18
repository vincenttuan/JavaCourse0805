package day23_io;

import java.io.File;

public class CreateDirAndFile {
    public static void main(String[] args) throws Exception {
        File folder = new File("src/day23_io/res");
        System.out.println(folder.mkdir());
        File file = new File(folder + File.separator + "BMI.csv");
        System.out.println(file.createNewFile());
    }
}
