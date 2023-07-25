package p2023_07_25;

public class StringBufferTest {
public static void main( String[] args ) {

StringBuffer sb1 = new StringBuffer("gemini");
System.out.println( "sb1.length() : " + sb1.length() );
System.out.println( "sb1.capacity() : " + sb1.capacity()); // byte 힙메모리 저장된 공간
// 기본은 16크기 이고 + 6 sb1.length 6 16+6 = 22 가 된다.
sb1.append( " A string buffer implements"+ 
				"a mutable sequence of characters");
// append (첨가) 문자열을 붙힌다.
System.out.println( "sb1.length() : " + sb1.length() );
System.out.println(sb1);
System.out.println( "sb1.capacity() : " + sb1.capacity());

StringBuffer sb2 = new StringBuffer();
System.out.println( "sb2.length() : " + sb2.length() );
System.out.println( "sb2.capacity() : " + sb2.capacity());
    }
}
