package day23_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteBMIData {

    public static void main(String[] args) throws Exception {
        File file = new File("src/day23_io/res/BMI.csv");
        
        // 讀取
        String s = read(file);
        
        // 分析
        String[] rows = s.split(",");
        double h = Double.parseDouble(rows[0]);
        double w = Double.parseDouble(rows[1]);
        double bmi = w / Math.pow(h / 100, 2);
        
        // 寫入
        FileWriter fw = new FileWriter(file, false);
        fw.write(String.format("%.1f,%.1f,%.2f", h, w, bmi));
        fw.close();

        // 讀取
        read(file);

    }
    
    // 讀取
    public static String read(File file) throws Exception {
        FileReader fr = new FileReader(file);
        String s = "";
        int data = 0;
        while ((data = fr.read()) != -1) {
            s += (char) data;
        }
        System.out.println(s);
        return s;
    }
}
