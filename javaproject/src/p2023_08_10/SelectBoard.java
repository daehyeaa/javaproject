package p2023_08_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

//create table board(
//		no number primary key,
//		writer varchar2(20) not null,
//	    passwd varchar2(20) not null,
//		subject varchar2(100) not null,
//		content varchar2(1000) not null,
//		reg_date timestamp );

public class SelectBoard {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		ResultSet rs = null;
		ResultSet rs2 = null;
		int count = 0; // 총데이터 갯수
		String writer = "", passwd= "", subject= "", content= "";
		int no = 0;
		String sql;
		
		// 글작성 시간을 연,월,일 시분초로 출력 하세요
		SimpleDateFormat sd = new SimpleDateFormat("YYYY - MM - dd - E요일 HH:mm:ss");
		Timestamp ts = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			String sql01 = "SELECT COUNT(*) num FROM board";
			pstmt = con.prepareStatement(sql01);
			rs2 = pstmt.executeQuery(); // select SQL문 실행 
			
			//boolean next() : 데이터를 1개씩 가져오는 역할
			if(rs2.next()) {
				//count = rs2.getInt(1); 이걸로도 된다.
				count = rs2.getInt("num");
			}
			System.out.println("총 데이터 갯수:"+ count);
			
			
			
			sql = "SELECT * FROM board";
			pstmt = con.prepareStatement(sql); // prepareStatement로 먼저 만들어줘야한다. 
			rs = pstmt.executeQuery(); // 그다음에 excuteQuery 실행 가능 
			
			System.out.printf("번호\t 작성자명\t 비밀번호\t제목\t\t\t\t내용\t\t\t\t 날짜 \n");
			System.out
			.printf("--------------------------------------------------------------------------------------------------------------------------\n");
			
			while(rs.next()) {				
				no = rs.getInt("no");
				writer = rs.getString("writer");
				passwd =rs.getString("passwd");
				subject =rs.getString("subject");
				content = rs.getString("content");
				ts = rs.getTimestamp("reg_date");
				
				System.out.print(no+"\t"+writer+"\t"+passwd+"\t");
				System.out.print(subject+"\t\t"+content+"\t\t"+ts+"\n");
				
//				System.out.printf(" %d \t %s \t %s \t %s \t %s \t %s \n", no, writer, passwd,
//						subject,content,sd.format(ts));
			}
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
					rs2.close();
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
