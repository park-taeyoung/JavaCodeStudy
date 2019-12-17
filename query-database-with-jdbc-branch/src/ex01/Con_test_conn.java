package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Con_test_conn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		Con_test_online cto = new Con_test_online();
		cto.insertUser(conn, "name", "city");
		conn.close();
	}
}
