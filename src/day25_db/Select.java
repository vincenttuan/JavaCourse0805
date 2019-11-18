package day25_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
    public static void main(String[] args) throws Exception {
        //Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/MyDB";
        String user = "app";
        String password = "app";
        String sql = "SELECT id, age, name FROM Student";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql);) {
            if(conn.isClosed()) {
                return;
            }
            System.out.println("已連線");
            while (rs.next()) {
                int id = rs.getInt("id"); // rs.getInt(1)
                int age = rs.getInt("age"); // rs.getInt(2)
                String name = rs.getString("name"); // rs.getString(3)
                System.out.printf("%d\t%d\t%s\n", id, age, name);
            }
            
        } catch (Exception e) {
        }
        
    }
}
