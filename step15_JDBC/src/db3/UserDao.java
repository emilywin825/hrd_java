package db3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static db3.JdbcTemplate.*;

public class UserDao {
//------------------------------------------------------------------------------------------------------------------Preparedstatement		
	public List<UserEntity> userList()  { //리스트에 담음
		List<UserEntity> list=new ArrayList<>();//중요,여기서는 ArrayList로 초기화 했지만 null로 초기화 하는 경우도 있음
		PreparedStatement pstmt=null;
		Connection conn=getConnection(); //이 패키지에 getConnection()없으니 import 문으로 넣어줌
		ResultSet rs=null;
		UserEntity entity=null;//중요
		
		String sql="select * from userinfo";
		try {
			pstmt=conn.prepareStatement(sql);//객체 초기화
			rs=pstmt.executeQuery();
			
			while(rs.next()) {//꺼내온 데이터를 userEntity객체에 담고 이 객체를 리스트에 담음 
				entity=new UserEntity(); //여기서 객체를 초기화 하는걸 권장 위에서 객체를 선언하면 null값이 들어오는 경우 기존 데이터가 들어가 있는 경우가 있음
				entity.setNum(rs.getInt("num"));//각각의 데이터를 userEntity 객체에 담음
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd")); 
				entity.setName(rs.getString("name")); 
				entity.setScore(rs.getDouble("score"));
				list.add(entity); //리스트에 entity를 담음
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs); close(pstmt); close(conn);
		}
		return list;//리스트는 참조자료형이니까 이름만 넘기면 모든 데이터를 넘기는 효과를 볼 수 있음 -> 객체지향	
	}	
	
	public UserEntity selectUser(String id) {
	PreparedStatement pstmt=null;
	Connection conn=getConnection();
	ResultSet rs=null;
	UserEntity entity=null;	
	String sql="select * from userinfo where id=?";
	try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			entity=new UserEntity();
			entity.setNum(rs.getInt("num"));//각각의 데이터를 userEntity 객체에 담음
			entity.setId(rs.getString("id"));
			entity.setPasswd(rs.getString("passwd")); 
			entity.setName(rs.getString("name")); 
			entity.setScore(rs.getDouble("score"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		close(pstmt); close(conn); close(rs);
	}
	return entity;
}
	
	public int insertUser(UserEntity userEntity) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int n=0;
		String sql="insert into userinfo values (stu_seq.nextval,?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userEntity.getId());
			pstmt.setString(2, userEntity.getPasswd());
			pstmt.setString(3, userEntity.getName());
			pstmt.setDouble(4, userEntity.getScore());
			n=pstmt.executeUpdate();
			if(n>0) {
				conn.commit(); System.out.println("데이터 추가 완료");
			}else conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt); close(conn); 
		}
		return n;
	}
	
	
	
	
	
	
//--------------------------------------------------------------------------------------------------------------------------statement			
//	public List<UserEntity> userList()  { //리스트에 담음
//		List<UserEntity> list=new ArrayList<>();//중요,여기서는 ArrayList로 초기화 했지만 null로 초기화 하는 경우도 있음
//		Statement stmt=null;
//		Connection conn=getConnection();  //이 패키지에 getConnection()없으니 import 문으로 넣어줌
//		ResultSet rs=null;
//		UserEntity entity=null;//중요
//		
//		String sql="select * from userinfo";
//		try {
//			stmt=conn.createStatement();//객체 초기화
//			rs=stmt.executeQuery(sql);
//			
//			while(rs.next()) {//꺼내온 데이터를 userEntity객체에 담고 이 객체를 리스트에 담음 
//				entity=new UserEntity(); //여기서 객체를 초기화 하는걸 권장 위에서 객체를 선언하면 null값이 들어오는 경우 기존 데이터가 들어가 있는 경우가 있음
//				entity.setNum(rs.getInt("num"));//각각의 데이터를 userEntity 객체에 담음
//				entity.setId(rs.getString("id"));
//				entity.setPasswd(rs.getString("passwd")); 
//				entity.setName(rs.getString("name")); 
//				entity.setScore(rs.getDouble("score"));
//				list.add(entity); //리스트에 entity를 담음
//			}		
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			close(rs); close(stmt); close(conn);
//		}
//		return list;//리스트는 참조자료형이니까 이름만 넘기면 모든 데이터를 넘기는 효과를 볼 수 있음 -> 객체지향	
//	}

//	public UserEntity selectUser(String id) {
//		Statement stmt=null;
//		Connection conn=getConnection();
//		ResultSet rs=null;
//		UserEntity entity=null;
//		String sql="select * from userinfo where id='"+id+"'";
//		try {
//			stmt=conn.createStatement();
//			rs=stmt.executeQuery(sql);
//			while(rs.next()) {
//				entity=new UserEntity();//위에서 초기화 하는 경우 id가 없는데 0 null null null 0.0 이런식으로 출력됨
//				entity.setNum(rs.getInt("num"));
//				entity.setId(rs.getString("id"));
//				entity.setPasswd(rs.getString("passwd"));
//				entity.setName(rs.getString("name"));
//				entity.setScore(rs.getDouble("score"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			close(rs); close(stmt); close(conn);
//		}
//		return entity;
//	}

//	public int insertUser(UserEntity userEntity) {//객체 자체를 받음
//		Statement stmt=null;
//		Connection conn=getConnection();
//		int n = 0;
//		String sql="insert into userinfo values(stu_seq.nextval,'"+userEntity.getId()+"','"+userEntity.getPasswd()+"','"
//		+userEntity.getName()+"','"+userEntity.getScore()+"')"; //object.outputStream() 사용해서 하면 객체 자체 넣어도 됨(어떻게 하지..?)
//		try {
//			stmt=conn.createStatement();
//			n=stmt.executeUpdate(sql);
//			if(n>0) conn.commit();
//			else conn.rollback();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			close(stmt); close(conn);
//		}
//		return n;
//	}
}
