package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbtest {
	Connection conn = null;

	public dbtest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void dttbList() { // db 조회,PreparedStatement 사용
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//String sql = "Select * from dttb where name=?";
		String sql = "Select * from dttb";
		try {
			pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, name);
			rs = pstmt.executeQuery();// db 조회(select,show) : executeQuery , 그 외 : executeUpdate();
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public void dttbInsert(String name,String phone,String addr) {//데이터 추가
//		PreparedStatement pstmt=null;
//		String sql="insert into dttb values(dt_seq.nextval,?,?,?)";
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			pstmt.setString(2, phone);
//			pstmt.setString(3, addr);
//			int n=pstmt.executeUpdate();
//			if(n>0) {
//				conn.commit(); System.out.println(n+"건의 데이터가 추가되었습니다");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 추가에 실패하였습니다.");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null) pstmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
//	public void dttbUpdate(int num, String name, String phone, String addr) {//데이터 수정
//		PreparedStatement pstmt=null;
//		
//		String sql="update dttb set name=?, phone=?, addr=? where num=?";
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, name);
//			pstmt.setString(2, phone);
//			pstmt.setString(3, addr);
//			pstmt.setInt(4, num);
//			int n=pstmt.executeUpdate();
//			if(n>0) {
//				conn.commit();
//				System.out.println(n+"건의 데이터가 수정되었습니다.");
//			}
//			
//		} catch (SQLException e) {
//			try {
//				conn.rollback(); System.out.println("데이터 수정 실패");
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		}
//	}
	public void dttbDelete(int num) {
		PreparedStatement pstmt=null;
		
		try {
			String sql="delete from dttb where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			int n=pstmt.executeUpdate();
			if(n>0) {
				conn.commit(); System.out.println(num+"번째 데이터 삭제");
			}
		} catch (SQLException e) {
			try {
				conn.rollback(); System.out.println("데이터 삭제 실패");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
