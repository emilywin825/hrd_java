package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static db2.JdbcTemplate.getConnection;
import static db2.JdbcTemplate.close;
import static db2.JdbcTemplate.commit;
import static db2.JdbcTemplate.rollback;

//dao : data access object
public class EmpDao {

	public void addressList() throws SQLException {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// if(conn!=null) System.out.println("연결 성공!");

		try {
			String sql = "select * from addressbook order by num desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// if(conn!=null) System.out.println("결과 조회 성공!");
			while (rs.next()) { // addressbook.sql에
				// rs.getInt("컬럼명") == rs.getInt(순번);
				System.out.print(rs.getInt("num") + "\t"); // ==rs.getInt(1);
				System.out.print(rs.getString("name") + "\t"); // ==rs.getInt(2);
				System.out.print(rs.getString("phone") + "\t"); // ==rs.getInt(3);
				System.out.print(rs.getString("addr") + "\n"); // ==rs.getInt(4);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs); close(pstmt); close(conn);
		}
	}

	public void addressInsert(String name, String phone, String addr) throws SQLException {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into addressbook values(num_seq.nextval,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 추가되었습니다.");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 추가에 실패하였습니다.");
		}

	}

	public boolean addressSearch(String name) throws SQLException {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean ck = false;

		String sql = "select * from addressbook where name=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ck = true; // 데이터가 있는 상태
				// 물음표에 값 대입
				System.out.print(rs.getInt("num") + "\t"); // ==rs.getInt(1);
				System.out.print(rs.getString("name") + "\t"); // ==rs.getInt(2);
				System.out.print(rs.getString("phone") + "\t"); // ==rs.getInt(3);
				System.out.print(rs.getString("addr") + "\n"); // ==rs.getInt(4);
			}
		} catch (SQLException e) {
		} finally { close(conn); close(rs); close(pstmt); }
		return ck;
	}

	public void addressUpdate(String name, String phone, String addr) throws SQLException {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		String sql = "update addressbook set phone=?,addr=? where name=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setString(3, name);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 추가되었습니다.");
			}

		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 수정에 실패");
		} finally {
			close(conn); close(pstmt);
		}
	}

	public void addressDelete(String name) throws SQLException {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "delete from addressbook where name=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println("삭제 성공");
			}
		} catch (SQLException e) {
			rollback(conn); System.out.println("데이터 삭제에 실패");
		}finally {
			close(conn); close(pstmt);
		}
	}
}
