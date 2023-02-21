package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exam.entity.LoginEntity;
import static common.JdbcTemplate.*;


public class LoginDao {

	public LoginEntity getLoginUser(String id, String pwd) {
		Connection conn=getConnecton();
		LoginEntity entity=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from users where id=? and pwd=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs=pstmt.executeQuery();
			//if(rs==null) System.out.println("rs null");
			if(rs.next()) {
				entity=new LoginEntity();
				entity.setId(rs.getString("id"));
				entity.setPwd(rs.getString("pwd"));
				entity.setName(rs.getString("name"));
				entity.setPoint(rs.getDouble("point"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn);
			close(rs);
			close(pstmt);
		}
		return entity;
	}

}
