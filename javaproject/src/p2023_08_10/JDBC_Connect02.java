package p2023_08_10;

import java.sql.*;

public class JDBC_Connect02{

  public static void main(String[] args)  {

/** ORACLE JDBC Driver Test *****************************************/
//	String driver = "oracle.jdbc.driver.OracleDriver"; 
//	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
/*******************************************************************/

/** My-SQL JDBC Driver *********************************************/
	String driver ="com.mysql.cj.jdbc.Driver";	// 8.x 버전은 
	//String driver ="com.mysql.jdbc.Driver";	// 5.x 버전은
	String url = "jdbc:mysql://localhost/jsptest";
	//String url = "jdbc:mysql://172.30.1.33:3306/jsptest"; 남의 db 접속

/*******************************************************************/

    Connection con = null;

    try{

      Class.forName(driver);

/**   ORACLE에서 Connection 객체 ***********************************/
//    con = DriverManager.getConnection(url, "scott", "tiger" );
/*******************************************************************/

/**   My-SQL에서 Connection 객체 ***********************************/
	  con = DriverManager.getConnection(url, "jspid", "jsppass" );
/*******************************************************************/

		System.out.println("데이터베이스 연결 성공~!!");

    } catch(Exception e){
		System.out.println("데이터베이스 연결 실패~!!");
		e.printStackTrace();
    } finally{
		try{
			if( con != null )         con.close();
		} catch(Exception e){
			System.out.println( e.getMessage( ));  
        }
   }
 }
}  
