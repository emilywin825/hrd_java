package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {
	public static Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1.
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
			conn.setAutoCommit(false);
//			if (conn != null) System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (stmt != null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean isConnection(Connection conn) {
		boolean valid = true;

		try {
			if (conn == null || conn.isClosed())
				valid = false;
		} catch (SQLException e) {
			valid = false;
		}
		return valid;
	}

	public static void close(Connection conn) {
		if (isConnection(conn))
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public static void commit(Connection conn) {
		if (isConnection(conn))
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public static void rollback(Connection conn) {
		if (isConnection(conn))
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
