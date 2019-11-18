package day26_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

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
    
    public static void main(String[] args) {
        insert(10, "Jack");
    }
    
    public static void insert(int age, String name) {
        String sql = "Insert into student(age, name) Values(?, ?)";
        try(PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, age);
            pstmt.setString(2, name);
            if(pstmt.executeUpdate() > 0) {
                System.out.println("Insert OK");
            } else {
                System.out.println("Insert Error");
            }
        } catch (Exception e) {
        }
    }
    
    
}
