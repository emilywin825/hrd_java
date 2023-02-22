package com.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.exam.entity.EmpEntity;

import static common.JdbcTemplate.*;

public class EmpDao {

	public int insertEmp(EmpEntity emp) {
		int n=0;
		
		Connection conn=getConnecton();
		PreparedStatement pstmt=null;
		String sql="insert into emp values(seq_eno.nextval,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, emp.getEname());
			pstmt.setString(2, emp.getPhone());
			pstmt.setString(3, emp.getDept());
			
			n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("사원 추가 성공");
				conn.commit();
			}
			else {
				System.out.println("사원 추가 실패");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn);
			close(pstmt);
		}
		return n;
	}

	public ArrayList<EmpEntity> listEmp() {
		//db에 접근해서 데이터를 가져옴
		ArrayList<EmpEntity> list=null;
		PreparedStatement pstmt=null;
		Connection conn=getConnecton();
		ResultSet rs=null;
		EmpEntity emp=null;
		
		String sql="select * from emp";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				if (list == null)
					list = new ArrayList<>(); /* 최초에 한번만 초기화 */
				emp=new EmpEntity();
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setPhone(rs.getString("phone"));
				emp.setDept(rs.getString("dept"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(conn);
			close(rs);
		}
		return list;
	}
	
	public int updateEmp(String ename,String phone,String dept) {
		Connection conn=getConnecton();
		PreparedStatement pstmt=null;
		int n=0;
		String sql="update emp set phone=?,dept=? where ename=?";
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, phone);
			pstmt.setString(2, dept);
			pstmt.setString(3, ename);
			
			n=pstmt.executeUpdate();
			
			if(n>0) {
				System.out.println("사원 정보 수정 완료");
				conn.commit();
			}else {
				System.out.println("사원 정보 수정 실패");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(conn);
		}
		return n;
	}
}
