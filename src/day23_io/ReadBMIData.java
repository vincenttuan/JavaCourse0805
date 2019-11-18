package day23_io;

import java.io.File;
import java.io.FileReader;

public class ReadBMIData {
    public static void main(String[] args) throws Exception {
        File file = new File("src/day23_io/res/BMI.csv");
        FileReader fr = new FileReader(file);
        
        int data = 0;
        while((data = fr.read()) != -1) {
            System.out.print((char)data);
        }
        
        fr.close();
    }
}
