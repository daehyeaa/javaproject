package p2023_08_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

	public static void main(String[] args) {
		Connection con = null;	// Connection 객체명 선언
		PreparedStatement pstmt = null;	// PreparedStatement 객체명 선언
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			Class.forName(driver); // driver loading
			con = DriverManager.getConnection(url, "scott", "tiger"); // db 연결
			
			System.out.println("작성자명을 입력하세요.");
			String writer = br.readLine();
			
			System.out.println("비밀번호를 입력하세요.");
			String passwd = br.readLine();
			
			System.out.println("제목을 입력하세요.");
			String subject = br.readLine();
			
			System.out.println("내용을 입력하세요.");
			String content = br.readLine();
			
			String sql = "insert into board ";
					   sql+= " values(board_seq.nextval, ?, ?, ?, ?, sysdate)";
			
			pstmt = con.prepareStatement(sql);  // sql문을 preparedstatement 넣어주는 메소드
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			
			// 잘 실행되면 값 1이 주어질것이다.
			int result = pstmt.executeUpdate(); // insert SQL문 실행
			if(result == 1) {
				System.out.println("글작성 성공");
			}else {
				System.out.println("글작성 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();	// 자원 해체
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
