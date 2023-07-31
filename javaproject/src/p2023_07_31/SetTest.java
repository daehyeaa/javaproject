package p2023_07_31;

// HashSet과 Date 클래스가 있는 패키지를 임포트
import java.util.*;

public class SetTest {
    public static void main( String[] args ) {
    
        // HashSet 클래스의 객체 생성
		Set hs = new HashSet();			// 업캐스팅
//      HashSet hs = new HashSet();
        
		
		// boolean add(Object e)
        // hs 객체에 데이터 객체 보관
        hs.add( "gemini" );
        hs.add( "johnharu" );
//		Date d=new Date();
//      hs.add( d );
	    hs.add( new Date() ); 

        // hs 객체가 보관하고 있는 데이터 객체 출력
        System.out.println( "hs의 내용 : " + hs );	//순차적인 자료구조가 아닌다 우연히 값이 순차적으로 나온것뿐이다.
        
        // "johnharau" 데이터 객체를 hs 객체에서 제거
        hs.remove( "johnharu" );					//remove 삭제 메소드
        System.out.println( "hs의 내용 : " + hs );	// hs의 내용 : [gemini, Mon Jul 31 15:07:21 KST 2023]
        
        // hs 객체에 있는 데이터 개체의 갯수를 출력
        System.out.println("hs의 데이터 갯수" + hs.size());	// 2
    }
}            