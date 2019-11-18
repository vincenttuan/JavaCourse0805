package day17_thread;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Snow {
    static BufferedImage img;
    static int imgW;
    static int imgH;
    static {
        try {
            img = ImageIO.read(new File("src/day17_thread/snow.png").toURL());
            imgW = img.getWidth();
            imgH = img.getHeight();    
        } catch (Exception e) {
        }
    }
    
    public static ImageIcon getImage(int dx, int dy) {
        ImageFilter cropFilter = new CropImageFilter(imgW / 8 * dx, imgH / 4 * dy, imgW / 8, imgH / 4);
        //创建好切图
        Image imgs = Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(img.getSource(), cropFilter));
        return new ImageIcon(imgs);
    }
}
