package day26_db;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.stream.Stream;

public class CRUD {

    static Connection conn;

    static {
        String url = "jdbc:derby://localhost:1527/MyDB";
        String user = "app";
        String password = "app";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws Exception {

        batchInsert2();

    }

    public static void insert(int age, String name) {
        String sql = "Insert into student(age, name) Values(?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, age);
            pstmt.setString(2, name);
            if (pstmt.executeUpdate() > 0) {
                System.out.println("Insert OK");
            } else {
                System.out.println("Insert Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(int id, int age, String name) {
        String sql = "Update student Set age=?, name=? Where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, age);
            pstmt.setString(2, name);
            pstmt.setInt(3, id);
            if (pstmt.executeUpdate() > 0) {
                System.out.println("Update OK");
            } else {
                System.out.println("Update Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "Delete From student Where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, id);
            if (pstmt.executeUpdate() > 0) {
                System.out.println("Delete OK");
            } else {
                System.out.println("Delete Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void batchInsert() {

        String sql = "Insert into student(age, name) Values(?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.clearBatch();
            for (int i = 1; i <= 100; i++) {
                pstmt.setInt(1, i);
                pstmt.setString(2, "Jack" + i);
                pstmt.addBatch();
            }
            int[] values = pstmt.executeBatch();
            System.out.println(values.length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void batchInsert2() throws Exception{
        String fileName = "src/day26_db/last-names.txt";
        String sql = "Insert into student(age, name) Values(?, ?)";
        Stream<String> stream = Files.lines(Paths.get(fileName));
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.clearBatch();
        stream.forEach(n -> {
            try {
                pstmt.setInt(1, new Random().nextInt(100));
                pstmt.setString(2, n);
                pstmt.addBatch();
            } catch (Exception e) {
            }
        });
        int[] values = pstmt.executeBatch();
        System.out.println(values.length);

    }

}
