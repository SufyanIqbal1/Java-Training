import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/asda?autoReconnect=true&useSSL=false", "root", "root");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ASDA");
			while(rs.next()) {
				System.out.println(rs.getString(1) + ": " + (rs.getDouble(2) * rs.getInt(3)));
			}
		} catch(ClassNotFoundException e) {
			System.out.println("Driver not found.");
		} catch(SQLException e){
			System.out.println("SQL Exception: ");
			e.printStackTrace();
		}
	}

}
