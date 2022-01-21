import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CRUD {

    public void insertData(Connection con, String brand, int ram, String storage, String model){
        try {
            Statement stmt = con.createStatement();
            String insertQuery =
                    String.format("insert into laptop (brand, model, ram, storage) values ('%s', '%s', %d, '%s') ", brand, model, ram, storage);
            stmt.executeUpdate(insertQuery);
            System.out.println("Data inserted!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error in Data insertion!!");
        }

    }

    public void readData(Connection con){
        try{
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from smartphones");

            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("brand"));
            }

            con.close();

        }catch( Exception e){
            e.printStackTrace();
            System.out.println("Error in reading Data");
        }
    }

    public void updateData(Connection con, int id, String brand){
        try {
            Statement stmt = con.createStatement();
            String insertQuery =
                    String.format("update smartphones set brand = '%s' where id = %d ", brand, id);
            stmt.executeUpdate(insertQuery);
            System.out.println("Data updated!!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error in Data updation!!");
        }

    }

}