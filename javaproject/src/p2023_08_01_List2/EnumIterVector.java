package p2023_08_01_List2;

import java.util.*;

public class EnumIterVector {
	
    public static void main( String[] args ) {
    	
	// Vector 객체 생성
	Vector v = new Vector( 1, 1 );
		
	// Vector에 Object 저장
	v.add( 30 );
	v.addElement( new Integer( 10 ));
	v.addElement( "johnharu" );
	v.addElement( "gracedew" );

	// 방법1. vector 자료구조에 저장된 데이터 출력
	System.out.println(v);
	
	// 방법2. 주로쓰는 방식
	for(int i=0; i<v.size(); i++) {
		System.out.print(v.get(i)+"\t");
	}
	System.out.println();
	// 방법3.
	// 나열형(Enumeration)
	// Vector의 Object의 나열형을 리턴
	Enumeration e = v.elements();
		
	// Enumeration을 이용해 Vector의 Object를 출력
	while( e.hasMoreElements() ) {	// 가져올 데이터가 있을때 True 리턴 그래서 반복문 실행됨
	    System.out.print( e.nextElement()+"\t");
	}
	System.out.println();
	// 방법4.
	// 반복자(Iterator) :
	Iterator ie = v.iterator();		
	// Iterator을 이용해 Vector 의 Object를 출력
	while( ie.hasNext() ) {
	    System.out.print( ie.next()+"\t" );
	}	

    } //main end   
}
