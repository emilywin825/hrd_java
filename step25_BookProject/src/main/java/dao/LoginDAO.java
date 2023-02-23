package dao;

import static common.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.LoginDTO;

public class LoginDAO {

	public boolean getLoginUser(String userid, String userpwd) {
		Connection conn=getConnecton();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		LoginDTO dto=null;
		boolean b=false;
		
		String sql="select * from bookmember where USERID=? and USERPWD=? ";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, userpwd);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new LoginDTO();
				dto.setUserid(rs.getString("userid"));
				dto.setUserpwd(rs.getString("userpwd"));
				b=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn);
			close(pstmt);
			close(rs);
		}
		return b;
	}
	
}
