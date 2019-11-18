package day23_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.zip.ZipInputStream;

public class ReadZipFile {
    public static void main(String[] args) {
        File file = new File("src/day23_io/res/salary.zip");
        try(FileInputStream fis = new FileInputStream(file);
            ZipInputStream zis = new ZipInputStream(fis);
            InputStreamReader isr = new InputStreamReader(zis, "UTF-8");) {
            zis.getNextEntry();
            int data = 0;
            while((data = isr.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
