package p2023_07_25;


// stringTokenizer
// : 특정 문자열에서 구분기호(#)를 이용해서 데이터를 파싱한 다음에 문자열(토큰)을 구해오는 경우에 사용한다.
// 토큰(token) : 이순신, 을지문덕, 강감찬, 광개토대왕
import java.util.*;

class StringTest04 {

  public static void main(String[] args) {
    StringTokenizer str = 
		new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#");
    
	//파싱된 문자열이 모두 몇 개인지 되는지 알려줌
    int cnt = str.countTokens();  
    System.out.println("파싱할 문자열의 총갯수-> " + cnt);

//	System.out.println(str.nextToken());		//이순신
//	System.out.println(str.nextToken());		//을지문덕 다음 토큰을 인식해서 다음 문자가 출력된다.
//	System.out.println(str.nextToken());		//강감찬
//	System.out.println(str.nextToken());		//광개토대왕
//	System.out.println(str.nextToken());		//NoSuchElementException 오류 발생 (예외발생)
    
    
    while(str.hasMoreTokens()){ //토큰이 있으면
    	System.out.println(str.hasMoreTokens());
      System.out.print(str.nextToken());//차례대로 파싱된 문자열을 얻어온다.
      // 토큰은 분리된 문자열 조각
	}

  }  // main() end 

}      