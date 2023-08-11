package p2023_08_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBoard {

	public static void main(String[] args) {
		
		String driver ="com.mysql.cj.jdbc.Driver";	// 8.x 버전은 
		String url = "jdbc:mysql://localhost:3306/jsptest";
		
		Connection con = null;
		PreparedStatement pstmt = null;
				 
		String sql;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			System.out.println("삭제할 번호를 입력하세요.");
			int no = Integer.parseInt(br.readLine());
			
			sql = "Delete FROM board where no = ?";
			pstmt = con.prepareStatement(sql);	
			
			 pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패!!");
			}
		}catch(Exception e) {
			System.out.println("실패");
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				System.out.println("최종실패");
			}
		}

	}

}
