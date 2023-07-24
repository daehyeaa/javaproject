package p2023_07_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		
		
		
//	변수 : 메모리상에 데이터를 저장하기 위한 기억 공간의 이름
//  변수를 만드는 방법 : 자료형 변수명 = 데이터(값);
		
//  기본 자료형 변수
// 1. 정수형 변수 
		byte b1 = 10;		// -128 ~ 127  (1byte)
		//byte b2 = 130;	// 오버플로우 발생	
		short s = 100;     // -32768 ~ 32767 (2byte)
		int i = 1000;		// -21억 ~ 21억 (4byte)
		long l = 100000L;		 // 데이터값끝에 l or L을 안붙이면 int형으로 형 변환한다.  (8byte)
		
		System.out.println("b1="+b1);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		
// 2. 실수형 변수
		float ft1 = 3.14f; // 데이터값 끝에 f을 안붙이면 double 형으로 인식한다. (4Byte)
		float ft2 = 3.14F;	
		float ft3 = (float)3.14; // double형(3.14) 을 float형으로 강제 형변환	
		
		double d = 42.195;	//(8byte)
		double d2 = 42.195f;
		
		System.out.println("ft1="+ft1);
		System.out.println("ft2="+ft2);
		System.out.println("ft3="+ft3);
		System.out.println("d="+d);
		System.out.println("d2="+d2);
		System.out.printf("%.1f\n",d); // 소수 첫째자리까지 출력
		System.out.printf("%.2f\n",d); // 소수 둘째자리까지 출력
		
// 3.문자형 변수
		char c1 = 'A';	//(2byte)
		//char c11 = 'AB'; // 오류발생 한글자만 
		char c2 = '안';
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
		if(c1 == 65) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		
// 4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		
		System.out.println("bn1="+bn1);
		System.out.println("bn2="+bn2);
		

// 참조형 변수 : 클래스
		String s1 = "자바";
		String s2 = new String("자바");
		
		System.out.println("s1="+ s1);
		System.out.println("s2="+ s2);
		
		if(s1 == s2) { //주소를 비교
			 System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");			
		}
		
		if(s1.equals(s2)) {  // 데이터(값)의 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
// 참조형 변수 : 배열 - 동일한 자료형의 데이터를 저장하는 정적인 자료구조
		String [] a =  new String[10];
		String [] b = {"10","20","30"};
		int [] score = {80,90,100};
				
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(a.hashCode());
		System.out.println(Arrays.toString(b));
		
		for(int j =0; j<score.length; j++) {
			//System.out.print(score[j]+"\t");
			System.out.println(score[j]);
		}
		
// 참조형 변수 : 인터페이스(List)
// 1.순차적인 자료구조 
// 2.여러가지 자료형의 데이터를 모두 저장할 수 있다.
// 3.동적으로 공간의 크기를 늘릴 수 있다.
		
		// 인터페이스는 자체적으로 객체 생성을 할 수 없다.
		//List list5 = new List(); // 오류 발생
		List list2 = new ArrayList();
		list2.add(30);
		list2.add(3.14);
		list2.add('j');
		list2.add(true);
		list2.add("바자");
		
		for(int k=0; k<list2.size(); k++) {
			//System.out.println(list2.get(k));
			System.out.print(list2.get(k)+"\t");
		}
		
//		ArrayList<Integer> list = new ArrayList<Integer>(10);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		System.out.println(list.get(2));


	}

}
