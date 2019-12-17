package ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Con_test_report {

	private static void countAllUser(Connection conn) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("select * from user");
		ResultSet rs = pstmt.executeQuery();
		rs.last();
		System.out.println("total : " + rs.getRow());
	}
}
