package day23_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadImage {

    public static void main(String[] args) {
        File file = new File("src/day23_io/res/car.jpg");
        try (FileInputStream fis = new FileInputStream(file);) {
            int bytes = fis.available();
            byte[] image = new byte[bytes];
            fis.read(image);
            System.out.println("照片原始資料:" + image);
            for(byte b : image) {
                System.out.print(b);
            }
        } catch (Exception e) {
        }

    }
}
