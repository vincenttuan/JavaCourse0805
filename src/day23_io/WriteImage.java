package day23_io;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WriteImage {

    public static void main(String[] args) throws Exception {
        byte[] image = read();
        File file = File.createTempFile("car", ".jpg", new File("src/day23_io/res"));
        try(FileOutputStream fos = new FileOutputStream(file)) {
            //fos.write(image);
            fos.write(GaussianBlurUtil.blur(image));
        } catch (Exception e) {
        }
    }
    
    
    public static byte [] read() {
        byte[] image = null;
        File file = new File("src/day23_io/res/car.jpg");
        try (FileInputStream fis = new FileInputStream(file);) {
            int bytes = fis.available();
            image = new byte[bytes];
            fis.read(image);
        } catch (Exception e) {
        }
        return image;
    }
}
