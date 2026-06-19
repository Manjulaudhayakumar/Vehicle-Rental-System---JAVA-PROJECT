package Vehicle;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String URL = "jdbc:mysql://localhost:3306/vehicle_rental";
    static String USER = "root";
    static String PASSWORD = "12345678";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            return con;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}