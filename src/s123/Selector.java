package s123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Selector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USER = "me";
	private static final String PASSWORD = "password";

	public List<String> getCoderNames() throws SQLException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //
				Statement stmt = conn.createStatement()) {
			
			ResultSet rs = stmt.executeQuery(
					"SELECT first_name FROM coders ORDER BY 1");

			List<String> results = new ArrayList<>();
			while (rs.next()) { //chiamata a next, meccanismo interazione
				results.add(rs.getString(1)); //tanti metodi di result get, questo è di tipo standard. prima riga è di indice 1 e devo dirlo io dov'è la colonna
			}
			
			return results;
		}
	}

	public List<Coder> getCoders() throws SQLException {
		try ( // questo blocco nel try con 2 risorse(2statement). Sto creanso una connection passando parametri
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //
			Statement stmt = conn.createStatement()) {
			
			ResultSet rs = stmt.executeQuery("SELECT first_name, last_name, salary FROM coders ORDER BY 1");

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}
			
			return results;
		}
	}

	public List<Coder> getCodersBySalary(double lower) throws SQLException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //
				Statement stmt = conn.createStatement()) {
			String query = "SELECT first_name, last_name, salary FROM coders WHERE salary >= " + lower
					+ " ORDER BY 3 DESC";

			ResultSet rs = stmt.executeQuery(query);

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}
			
			return results;
		}
	}

	public static void main(String[] args) {
		try {
			Selector sample = new Selector();

			System.out.println("Coder names are: " + sample.getCoderNames());
			System.out.println("Coders are: " + sample.getCoders());
			System.out.println("Rich coders are: " + sample.getCodersBySalary(6000));

		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}
}