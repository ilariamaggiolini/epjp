package s119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerConnector {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe"; //sinonimo di localhost è 127.0.0.1; il numero della porta è 1521; xe è il server di Oracle
    private static final String USER = "me";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //Fondamentale avere jdbs di oracle
            
//            String user = conn.getSchema();
//            if (user==null) {
//            	user=conn.getCatalog();
//            }
//            System.out.println("Connected as " +  user);
//			  } catch (SQLException e) {
//            e.printStackTrace();
            
            System.out.println("Connected as " + conn.getSchema());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


