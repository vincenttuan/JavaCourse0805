package day16_exception_lab;

import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class TWII {
    private static String urlstring = "http://192.168.2.19/Java/BWIBBU_d.csv";
    public static void main(String[] args) throws Exception {
        //String data = new Scanner(new URL(urlstring).openStream(), "big5").useDelimiter("\\Z").next();
        String data = new Scanner(new FileInputStream("src/day16_exception_lab/BWIBBU_d.csv"), "big5").useDelimiter("\\Z").next();
        //System.out.println(data);
        
        String[] array = data.split("\n");
        // Java 8 
        // 證券代號 證券名稱 殖利率(%) 股利年度 本益比  股價淨值比 財報年/季

        Arrays.stream(array)
                .filter(e -> e.split(",").length == 8 && !e.contains("證券代號"))
                .filter(e -> !e.contains("\"-\""))
                .map(e -> e.replaceAll("\"", ""))
                .filter(e -> Double.parseDouble(e.split(",")[2]) > 7)
                .filter(e -> Double.parseDouble(e.split(",")[4]) < 5)
                .filter(e -> Double.parseDouble(e.split(",")[5]) < 1)
                .forEach(e -> System.out.println(e.trim()));
        
    }
}
