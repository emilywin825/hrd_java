package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.BookDTO;
import oracle.jdbc.proxy.annotation.Pre;
import static common.JdbcTemplate.*;


public class BookDAO {
	
	public boolean bookInsert(BookDTO dto) {
		Connection conn=getConnecton();
		PreparedStatement pstmt=null;
		boolean b=false;
		
		String sql="insert into BOOKSHOP2 values(?,?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getIsbn());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getAuthor());
			pstmt.setString(4, dto.getCompany());
			pstmt.setInt(5, dto.getPrice());
			int n=pstmt.executeUpdate();
			
			if(n>0) {
				System.out.println("도서 추가 성공");
				conn.commit();
				b=true;
			}else {
				System.out.println("도서 추가 실패");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn); close(pstmt);
		}
		return b;
	}
//-----------------------------------------------------
	public ArrayList<BookDTO> getBookList() {
		Connection conn=getConnecton();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BookDTO dto=null;
		
		ArrayList<BookDTO> list=null;
		
		String sql="select * from BOOKSHOP2";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				if(list==null) list=new ArrayList<>();
				dto=new BookDTO();
				dto.setIsbn(rs.getString("isbn"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
				dto.setCompany(rs.getString("company"));
				dto.setPrice(rs.getInt("price"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn); close(pstmt); close(rs);
		}
		return list;
	}
}
