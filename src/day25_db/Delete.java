package day25_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.xml.validation.Schema;

public class Delete {

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MyDB", "app", "app");
        Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        ResultSet result = stmt.executeQuery("SELECT * FROM Student Where id = 1");

        if(result.last()) {
            result.deleteRow();
            System.out.println("刪除成功");
        } else {
            System.out.println("無資料可刪除");
        }
        
        result.close();
    }
}
