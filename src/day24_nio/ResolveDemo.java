/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24_nio;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveDemo {

    public static void main(String[] args) {
        Path path1 = Paths.get("/temp/../Company/Finance/");
        Path path2 = Paths.get("Salary.dat");
        Path path3 = path1.resolve(path2);
        System.out.println(path3);
    }
}
