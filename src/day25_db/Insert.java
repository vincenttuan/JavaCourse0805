package day25_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/MyDB";
        String user = "app";
        String password = "app";
        String sql = "SELECT id, age, name FROM Student";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);) {
            if(conn.isClosed()) {
                return;
            }
            System.out.println("已連線");
            
            rs.moveToInsertRow();
            rs.updateInt("age", 25);
            rs.updateString("name", "Tom");
            
            rs.insertRow();
            
            System.out.println("新增成功");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
