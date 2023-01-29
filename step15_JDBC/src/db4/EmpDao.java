package db4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.proxy.annotation.Pre;
import oracle.net.aso.e;

import static db4.JdbcTemplate.*; //db3페키지에 있는 JdbcTemplate의 메소드 사용 가능
public class EmpDao {

	public List<EmpEntity> addressList() {
		List<EmpEntity> list=new ArrayList<>();
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		EmpEntity entity=null;
		
		String sql="select * from addressbook";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			//List를 null로 초기화 할 경우
//			if(rs!=null)
//				list=new ArrayList<>(); //while문 안에 넣으면 데이터 하나꺼낼때 마다 list 계속 초기화됨->마지막 데이터만 남아있게 됨
			while(rs.next()) {
				entity=new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
				list.add(entity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt); close(conn); close(rs);
		}
		return list;
	}

	public int addressInsert(EmpEntity entity) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int n=0;
		
		String sql="insert into addressbook values(num_seq.nextval,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setString(2, entity.getPhone());
			pstmt.setString(3, entity.getAddr());
			n=pstmt.executeUpdate();
			if(n>0) commit(conn);
		} catch (SQLException e) {
			rollback(conn);
		}finally {
			close(conn); close(pstmt);
		}
		return n;
	}
	
	public EmpEntity addressSearch(String name) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		EmpEntity entity=null;
		ResultSet rs=null;
		
		String sql="select * from addressbook where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				entity=new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn); close(pstmt); close(rs);
		}
		
		return entity;
	}

	public int addressUpdate(String name,String phone,String addr) {
		Connection conn=getConnection(); PreparedStatement ptstm=null;
		int n=0;
		String sql = "update addressbook set phone=?,addr=? where name=?";
		try {
			ptstm=conn.prepareStatement(sql);
			ptstm.setString(1, phone);
			ptstm.setString(2, addr);
			ptstm.setString(3, name);
			n=ptstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn); close(ptstm);
		}
		return n;
	}

	public int addressDelte(String name) {
		Connection conn=getConnection();
		PreparedStatement ptstm=null;
		int n=0;
		String sql="delete from addressbook where name=?";
		try {
			ptstm=conn.prepareStatement(sql);
			ptstm.setString(1, name);
			n=ptstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn); close(ptstm);
		}
		return n;
	}
}
