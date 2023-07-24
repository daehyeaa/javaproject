package p2023_07_24;

// trim() : 문자열 좌,우의 공백을 없애주는 역할
// equals() 문자열 값을 비교하는 역할 boolean 형으로 리턴해주는 메소드
public class TrimTest {

    public static void main( String[] args ) {
    	// 공백도  메모리상의 공간을 차지함
	String str1 = new String( "gemini   " );
	String str2 = new String( "   gemini " );

	System.out.println( str1.equals( str2 ));	//false
	System.out.println( str1.trim().equals( str2.trim()));	// true
    }
}
		