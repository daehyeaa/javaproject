package p2023_07_25;

public class AppendStringBuffer {
    public static void main( String[] args ) {
		
	// StringBuffer 객체 생성
	StringBuffer sb1 = new StringBuffer( "gemini" );
	System.out.println( "sb1 = " + sb1 );

	// StringBuffer sb1에 문자열을 추가해 새로운 객체 생성
	StringBuffer sb2 = sb1.append( " is beautiful" );
	System.out.println( "sb2 = " + sb2 );
	System.out.println( "sb1 = " + sb1 );
	
	StringBuffer sb3 = new StringBuffer("kokoko");
	
	sb1.append(sb3);
	System.out.println(sb1);
	
	if(sb2 == sb3) {
		System.out.println("같은주소111");
	}else {
		System.out.println("같은주소222");
		
	}
	
	// 정수형 데이타 형을 추가
	System.out.println( sb1.append( 1004 ));
	System.out.println( "sb1 = " + sb1 );
	System.out.println( "sb2 = " + sb2 );

	if(sb1 == sb2) {
		System.out.println("같은주소");
	}else {
		System.out.println("다른주소");
	}
	System.out.println(sb1.hashCode());
	System.out.println(sb2.hashCode());
	
	String str = new String(sb1); // StringBuffer를 String으로 변환
	System.out.println(str.toUpperCase());
	// String(StringBuffers buffer) 생성자를 이용하여 string 형의 메소드 upperCase 메소드를 사용한다.
    }
}


