package ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Con_test_online {
	public static void insertUser(Connection conn, String name, String city) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("insert into user(name, city) values(?,?)");
//		PreparedStatement pstmt = conn.prepareStatement("truncate table user;");
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.execute();
		pstmt.close();
	}
}
