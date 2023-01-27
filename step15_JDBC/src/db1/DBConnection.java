package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* DB연결 과정
 * 1. 드라이버로드(ojdbc로드)
 * 2. 연결 객체 생성 //db쪽에 가서 로그인
 * 3. sql 문장 실행
 * 4. 결과(ResultSet, 정수) 리턴
 * 5. 객체 닫기
 */

public class DBConnection {
	Connection conn = null;// 2. 연결 객체 생성
//connection 객체에 요청(commit 처리 해달라 등)

	public DBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// Class.forName 역할 1.드라이버로드-->ojdbc6를 사용할 수 있게됨
			// oracle.jdbc.driver패키지에 jdbc6에 들어있음, OracleDriver클래스
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
			// database Development->database Connections->연결할 db 마우스
			// 오른쪽->Properties->Driver properties
			// JDBC 드라이버에서 데이터 베이스와 연결된 커넥션을 가져오기 위해 DriverManager 클래스의 getConnection() 메소드
			// 사용
			// 객체 생성되는 순간 드라이버(oracle.jdbc.driver.OracleDriver)검색 후 검색된 드라이버를 이용해 Connection
			// 객체를 생성한 후 이를 반환
			conn.setAutoCommit(false); // AutoCommit 오류메시지 방지
//			if (conn != null)
//				System.out.println("연결 성공~");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//Statement, PreparedStatement 둘 다 알아두긴 해야하지만 주로 PreparedStatement사용.
//Statement : SQL구문 실행하는 역할, 스스로는 sql구문 이해 못함->전달 역할, SQL 관리 o + 연결 정보 x
//PreparedSTatement : z, 인자(=매개변수)와 관련된 작업이 특화, 가독성 높음, 코드량 증가(매개변수를 set해줘야 해서),텍스트 SQL 호출
// https://sas-study.tistory.com/160
// -----------------------------------------------------------------------------------PreparedStatement
//	public void addressInsert(String name, String phone, String addr) {
//		PreparedStatement pstmt = null;
//		String sql = "insert into addressbook(num,name,phone,addr)" + "values (num_seq.nextval, ?,?,?)"; 
// 														//PreparedStatement일 때 데이터 추가 시 ? 사용
//		try {
//			pstmt = conn.prepareStatement(sql);
//			// sql문장을 db에서 동작하는 pstmt 객체로 포장해주는 과정
//			// conn과 pstmt 객체를 연결하는 초기화 작업
//			// setString : ?에 값 채움, 각 필드의 자료형에 맞는 set자료형 형식 사용
//			pstmt.setString(1, name);// 첫번째 물음표에 해당하는 값(첫번째 물음표 부터 시작)
//			pstmt.setString(2, phone);
//			pstmt.setString(3, addr);
//			int n = pstmt.executeUpdate(); // select 문을 제외한 모드 쿼리문들은 executeUpdate() 사용, 바뀐 행의 수를 리턴
//			if (n > 0) {
//				conn.commit(); // 연결 객체에 대해서 처리
//				System.out.println(n + "건의 데이터가 추가되었습니다.");
//			}
//		} catch (SQLException e) {// 문제 발생하면 rollback
//			try {// rollback하다가 문제 발생할 수도 있으니까 try/catch
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
//-----------------------------------------------------------------------------------Statement	
//	public void addressInsert(String name, String phone, String addr) {
//		Statement stmt = null;
//
//		String sql = "insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'" + name + "','" + phone
//				+ "','" + addr + "')";
//
//		try {
//			stmt = conn.createStatement();
//			int n = stmt.executeUpdate(sql);
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 추가되었습니다.");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 추가 실패");
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			try {
//				if (stmt != null)
//					stmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

//----------------------------------------------------------------------------------Statement
	public void addressList() { // 전체 목록 조회
		Statement stmt = null;// java.sql 선택
		ResultSet rs = null;
		// ResultSet : Statement / PreparedStatement 객체로 select 문을 사용하여 얻어온 레코드 값을 테이블 형태로 가진 객체
		String sql = "select * from addressbook";
		try {
			stmt = conn.createStatement(); // PreparedStatement 방식과 다르게
			rs = stmt.executeQuery(sql); // select 문은 executeQuery() 사용
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
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//---------------------------------------------------------------------------PreparedStatement
//	public void addressList() {
//		PreparedStatement pstmt = null;//3. PreparedStatement 객체 생성
//		ResultSet rs = null; //ResultSet 객체는 Statement / PreparedStatement 객체로 select문을 사용해 얻어온 값을 저장
//		String sql = "select * from addressbook";//4. sql문 작성
//		try {
//			pstmt = conn.prepareStatement(sql);//sql문 전달 -->prepareStatement 객체 return
//			rs = pstmt.executeQuery();// db에 전달 //5. 결과 리턴
//			// PrepareStatement 사용 후 결과를 내려면 executeQuery()나 executeUpdate() 사용해야함
//			while (rs.next()) { // addressbook.sql에
//								// rs.getInt("컬럼명") == rs.getInt(순번);
//				System.out.println(rs.getInt("num") + "\t"); // ==rs.getInt(1);
//				System.out.println(rs.getString("name")); // ==rs.getInt(2);
//				System.out.println(rs.getString("phone")); // ==rs.getInt(3);
//				System.out.println(rs.getString("addr")); // ==rs.getInt(4);
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			// 5. 연결 객체 해제
//				try {	if (rs != null) rs.close();
//	                 	if(pstmt!=null) pstmt.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
//	}
//--------------------------------------------------------------------------PrepaerdStatement
//	public void addressUpdate(int num, String phone, String addr) {
//		PreparedStatement pstmt = null;
//		String sql = "update addressbook set phone=?, addr=? where num=?";
//		try {
//			pstmt = conn.prepareStatement(sql); //db에 접근할 때 sql문장 전달
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setInt(3, num);
//			int n = pstmt.executeUpdate();
//			if (n > 0) {
//				conn.commit();
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			System.out.println("데이터 수정 실패");
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null) pstmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}

//-------------------------------------------------------------------------------------------------Statement					
//	public void addressUpdate(int num, String phone, String addr) {
//		Statement stmt=null;
//		
//		String sql="update addressbook set phone="+phone+", addr="+addr+" where num=3";
//		
//		try {
//			stmt=conn.createStatement();
//			int n=stmt.executeUpdate(sql); //객체 내부에 sql 문장 가지고 들어감
//			
//			if(n>0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 수정되었습니다.");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		}finally {
//			try {
//			if (stmt != null) stmt.close();
//		} catch (SQLException e2) {
//			e2.printStackTrace();
//		}
//	}
//	}
//--------------------------------------------------------------------------PrepaerdStatement
//	public void addressDelete(int num) {
//		PreparedStatement pstmt = null;
//		try {
//			String sql = "delete from addressbook where num=?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num);
//			int n = pstmt.executeUpdate();
//			if (n > 0) {
//				conn.commit();
//				System.out.println(n + "건의 데이터가 삭제되었습니다.");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 삭제에 실패");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			try {
//				if (pstmt != null) pstmt.close();
//			} catch (SQLException e2) {
//				e2.printStackTrace();
//			}
//		}
//	}
//	--------------------------------------Statement
	public void addressDelete(int num) {
		Statement stmt = null;

		try {
			String sql = "delete from addressbook where num=" + num;
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n > 0) {
				conn.commit();
				System.out.println(n + "건의 데이터가 삭제되었습니다");
			}

		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 삭제에 실패하였습니다");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		} finally {
			try {
				if (stmt != null) stmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}

	}
}
