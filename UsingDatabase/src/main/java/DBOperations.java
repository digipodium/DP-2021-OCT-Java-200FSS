import java.sql.Connection;

public class DBOperations {
    public static void main(String[] args) {

        Connection conn = ConnectingDB.openConnection();

        CRUD crud = new CRUD();

        crud.insertData(conn, 4, "Apple", 8, 128, "16 MP");


        
    }
}
