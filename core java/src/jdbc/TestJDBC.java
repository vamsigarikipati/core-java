package jdbc;

import java.security.interfaces.RSAKey;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vamsi", "password");

			Statement stmt = conn.createStatement();
			StringBuffer sb = new StringBuffer();
			PreparedStatement pstmt = conn
					.prepareStatement("select FIRST_NAME, LAST_NAME from student where student_id=?");
			// execute takes DDL (Data Definition Language) or DML (Data
			// Manipulation Language)

			stmt.execute("select FIRST_NAME, LAST_NAME from student where student_id=10");
			ResultSet rs = stmt.getResultSet();

			iterateResultSet(rs, sb);
			
			pstmt.setString(1, "10");
			ResultSet prs = pstmt.executeQuery();

			iterateResultSet(prs, sb);

			System.out.println(sb);

			// CallableStatement cstmt = conn.prepareCall("call procedure1()");
			// cstmt.

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void iterateResultSet(ResultSet anyresultsetname, StringBuffer sb) throws SQLException {
		while (anyresultsetname.next()) {
			System.out
					.println(anyresultsetname.getString(1) + " " + anyresultsetname.getString(2));
		}

		sb.append("dsfsdf");
	}

}
