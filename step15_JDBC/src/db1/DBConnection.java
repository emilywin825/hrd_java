package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* DB연결 과정
 * 1. 드라이버로드(ojdbc로드)
 * 2. 연결 객체 생성 //db쪽에 가서 로그인
 * 3. sql 문장 실행
 * 4. 결과(ResultSet, 정수) 리턴
 * 5. 객체 닫기
 */


public class DBConnection {
	Connection conn=null;
	public DBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//클래스 이름을 불러옴  1.드라이버로드
			//oracle.jdbc.driver패키지-->jdbc6에 들어있음, OracleDriver클래스
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
			//database Development->database Connections->연결할 db 마우스 오른쪽->Properties->Driver properties
			if(conn!=null) System.out.println("연결 성공~");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addressList() {
		
	}
	
}
