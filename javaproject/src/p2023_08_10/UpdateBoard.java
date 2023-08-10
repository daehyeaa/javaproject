package p2023_08_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBoard {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int cnt = 0;
		int no = 0;
		String writer, passwd, subject, content, reg_date;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			System.out.println("수정할 번호는 뭔가요?");
			no = Integer.parseInt(br.readLine());			
			System.out.println("수정할 작성자은 뭔가요?");
			writer = br.readLine();
			System.out.println("수정할 제목는 뭔가요?");
			subject = br.readLine();
			System.out.println("수정할 내용는 뭔가요?");
			content = br.readLine();
			
			
			String sql = "UPDATE board SET writer =? ,subject = ?, content = ?, reg_date = sysdate";
					   sql += " WHERE no = ?";
					   
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, subject);
			pstmt.setString(3, content);
			pstmt.setInt(4, no);
			
			int result = pstmt.executeUpdate(); // int형으로 반환
			if(result == 1) {
				System.out.println("업데이트성공");
			}else {
				System.out.println("업데이트 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println("실패");
			}
		}
		
	}

}
