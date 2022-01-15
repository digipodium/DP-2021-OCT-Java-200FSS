import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CRUD {

    public void insertData(Connection con, int id, String brand, int ram, int storage, String camera){
        try {
            Statement stmt = con.createStatement();
            String insertQuery =
                    String.format("insert into smartphones values (%d, '%s', %d, %d, '%s') ", id, brand, ram, storage, camera);
            stmt.executeUpdate(insertQuery);
            System.out.println("Data inserted!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error in Data insertion!!");
        }

    }

}
