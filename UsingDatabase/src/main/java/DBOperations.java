import java.sql.Connection;

public class DBOperations {
    public static void main(String[] args) {

        Connection conn = ConnectingDB.openConnection();

        CRUD crud = new CRUD();

//        crud.insertData(conn, 5, "Apple", 12, 512, "32 MP");

//            crud.readData(conn);

        crud.updateData(conn, 5, "Asus");
    }
}
