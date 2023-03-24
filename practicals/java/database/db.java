import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class db {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://bhuoahjwctxzhvgsrlmw-mysql.services.clever-cloud.com/"; //jdbc:mysql://localhost:3306/mydatabase"
            String db = "bhuoahjwctxzhvgsrlmw";
            String user = "uav1lkeoowfeajs9";
            String pass = "LQYP6q5feHi2kvSyNgkr";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url + db, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()) {
                System.out.println(rs+"id: " + rs.getInt(1) + ", name: " + rs.getString(2));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}