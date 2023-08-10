package p2023_08_10;

import java.sql.*;

public class JDBC_Connect01{

  public static void main(String[] args)  {

/** ORACLE JDBC Driver Test ***************************/
//	String driver = "oracle.jdbc.driver.OracleDriver";  
/******************************************************/

/** My-SQL JDBC Driver Test **************************/	
	String driver ="com.mysql.cj.jdbc.Driver";
/*****************************************************/
	// Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
	// 성공은 했는데 보안 기능 때문에 ...?
    try{
      Class.forName(driver);
      System.out.println("JDBC Driver Loading 성공~!!");

    }catch(Exception e){
      System.out.println("JDBC Driver Loading 실패~!!");
	  e.printStackTrace();
    }
 }
}  
