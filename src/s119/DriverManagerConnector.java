package s119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerConnector {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1"; //sinonimo di localhost è 127.0.0.1; il numero della porta è 1521
    private static final String USER = "me";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected as " + conn.getSchema());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
