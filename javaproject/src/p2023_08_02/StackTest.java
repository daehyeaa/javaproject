package p2023_08_02;

import java.util.*;

public class StackTest {
    public static void main( String[] args ) {
    // Stack 객체 생성
	Stack s = new Stack();
	System.out.println( s.empty() );	// true
		
	// Stack에 값을 넣음
	s.push( "gemini" );
	 Date d = new Date();
	s.push( d );
	s.push( new Integer( 10 ));
	s.push( "johnharu" );

	// Stack의 값을 출력
	System.out.println( s.empty() );	// false
	System.out.println( s.peek() );// johnharu
	System.out.println( s.pop() );//johnharu
	System.out.println( s.pop() );//10
	System.out.println( s.pop() );//Wed Aug 02 10
	System.out.println( s.pop() );// gemini
	System.out.println( s.empty() );// true
    }	
}

