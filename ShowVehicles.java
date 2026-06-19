package Vehicle;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowVehicles {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT * FROM vehicles");

            while(rs.next()) {

                System.out.println(
                        rs.getString("vehicle_id")
                        + " | "
                        + rs.getString("vehicle_type")
                        + " | "
                        + rs.getString("brand")
                        + " | "
                        + rs.getDouble("rent_per_day")
                        + " | "
                        + rs.getBoolean("is_available")
                );
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}