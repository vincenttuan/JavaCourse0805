package day12_opendata;

import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Predicate;

public class OpenDataMain {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("C:\\Users\\teacher\\Documents\\NetBeansProjects\\JavaApplication0805\\src\\day12_opendata\\BadRice.json");
        String json = new String(Files.readAllBytes(path));
        BadRice[] badRices = new Gson().fromJson(json, BadRice[].class);
        System.out.println(badRices.length);
        
        Predicate<BadRice> p1 = e -> e.get廠商名稱().contains("公司");
        Predicate<BadRice> p2 = e -> e.get品名().contains("日本");
        
        Arrays.stream(badRices)
                .filter(p1)
                .filter(p2)
                .forEach(System.out::println);
        
        
    }
}
