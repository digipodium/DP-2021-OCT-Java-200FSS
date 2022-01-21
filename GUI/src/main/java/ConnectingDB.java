import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectingDB {
    private static String url = "jdbc:mysql://localhost:3306/myfirstdb";
    private static String username = "root";
    private static String password = "root";
    private static Connection conn;

    public static Connection openConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected!!");
            return conn;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in Database Connection!!");
            return null;
        }

    }

}