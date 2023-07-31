package p2023_07_31;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {

//		* 레퍼런스 형변환
//		 - 두개의 클래스 사이에 상속관계가 있어야함
//		 
//		* 업캐스팅(자동 형변환)
//		 1. 서브클래스에서 슈퍼클래스로 형변환 하는것
//		 2. 참조 가능한 영역이 축소가 된다.
//		 3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 된다.
		
// 		ex1.
//					
//			Calendar c = new Calendar(); // 오류 발생 캘린더 클래스는 추상클래스로 이기때문에 생성자를 만들 수 없다.
			Calendar c1 = Calendar.getInstance();
			
			// 업캐싕이 되면 Calendar가 상속해준 메소드만 호출 할 수 있다.
			// 자식 캘래스의 메소드는 호출할 수 없다.
			Calendar c2 = new GregorianCalendar();	// 업캐스팅 참조가능한 영역이 제한된다.
			GregorianCalendar c3 = new GregorianCalendar();	// 업캐스팅 된 것과 호출할 수 있는 메소드가 다르다. 
			
//			ex2.
			// Interface List<E> E = element
			// List는 인터페이스 이기 때문에 자체적으로 객체를 생성할 수 없다.
			//List li = new List();	// 오류 발생
			List list = new ArrayList();				// 업캐스팅
			ArrayList al = new ArrayList();
			
//			ex3.
//				add(Object e)
				list.add(10);				// Object e = new Integer(10) 박싱 + 업캐스팅
				list.add(3.14);			// Object e = new Double(3.14) 박싱 + 업캐스팅
				list.add('j');			// Object e = new Character('j') 박싱 + 업캐스팅
				list.add(true);			// Object e = new Boolean(true) 박싱 + 업캐스팅
				list.add("자바");			// Object e = new String("자바") 박싱 + 업캐스팅
				
				// boolean equals(Object e)
				
				// object e = new String("java");				// 업캐스팅
				if("java".equals(new String("java"))) {
					System.out.println("같은 값");
				}else {
					System.out.println("다른 값");
				}
				
				// Object e = new Integer(30);				// 박싱 + 업캐스팅
				// Ojbect e = 30;									// 자동박싱 + 업캐스팅
				if(new Integer(30).equals(new Integer(30))) {
					System.out.println("같은 값");
				}else {
					System.out.println("다른 값");
				}

				// Object e = new Double(3.14);				// 박싱 + 업캐스팅
				// Ojbect e = 3.14;									// 자동박싱 + 업캐스팅
				if(new Double(3.14).equals(new Double(3.14))) {
					System.out.println("같은 값");
				}else {
					System.out.println("다른 값");
				}
				
//			* 자료구조
//			   java.util.*;
//
//			   ex) Set, List, Vector, Map, Queue, Stack etc
//
//			i. Set 인터페이스 - HashSet, TreeSet (상속받는 클래스)
//
//			   1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//			      ex) int, double, char, boolean, String etc
//			   2. 순서없이 입.출력 한다.
//			   3. 중복된 Data를 저장하지 못한다.
//
//
//			ii. List 인터페이스 - ArrayList (상속받는 클래스)
//
//			    1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//			      ex) int, double, char, boolean, String etc
//			    2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
//			    3. 중복된 Data를 저장 할 수 있다.
//
//
//			iii. Vector 클래스
//
//			     1.여러가지 자료형의 Data를 모두 저장할 수 있다.
//			      ex) int, double, char, boolean, String etc
//			     2. 순서있는 입.출력 처리(index번호 순으로 저장됨)
//			     3. 중복된 Data를 저장 할 수 있다.
//
//
//			iv. Map 인터페이스  - HashMap, HashTable (상속받는 클래스)
//			    1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//			      ex) int, double, char, boolean, String etc
//			    2. Data를 저장할 때 Key, Value 를 동시에 저장한다.
//			    3. key 값은 중복이 되면 안된다.
//			       만약에 중복된 key가 있으면, 가장 마지막에 설정된 value만 사용할 수 있다.
//			    4. value값은 중복이 되어도 상관없다.	
//
//			v. 큐(Queue) 인터페이스 - LinkedList (상속받는 클래스)
//			   1. FIFO(First Input First Output) 구조
//			      먼저 입력된 자료가 먼저 출력되는 구조
//
//
//			vi. 스택(Stack) 클래스
//			   1.  LIFO(Last Input First Output) 구조
//			       마지막으로 입력된 자료가 가장 먼저 출력되는 구조

//---------------------------------------------------------------------------------------------------
				
				// ex.1
					List lt = new ArrayList();	// 업캐스팅
					
				// add(Object e)
				lt.add(new String("자바"));
				lt.add("오라클");
				lt.add("JSP");
				lt.add("스프링");
				lt.add("파이썬");
				lt.add("텐스플로우");
				

				// Object get(int index)
				Object obj = list.get(0);
				String s = (String)lt.get(0);	// 강제 형변환 다운캐스팅
				
				for(int i=0; i<list.size(); i++) {
					Object ob = list.get(i);
					
					String str = (String)lt.get(i);
					System.out.println(str);
				}
				
//		ex2.
				List ls = new ArrayList();
				
				// add(Object e)
				ls.add(10);					// 오토박싱 + 업캐스팅
				ls.add(200);
				ls.add(3000);
				ls.add(40000);
				ls.add(500000);
				
			
				// Object get (int index)
				
				Integer it = (Integer)ls.get(0);		// 다운 캐스팅
				
				int n1 = it.intValue();						// 언박싱
				
				// 다운 캐스팅 + 언박싱
				int n2 = ((Integer)ls.get(1)).intValue();
				System.out.println("n2"+n2);
				
				for(int i = 0; i<ls.size(); i++) {
					Object ob = ls.get(i);
					
					// 다운 캐스팅 + 자동 언박싱
					int n3 = ((Integer)ls.get(i));		// 자동 언박싱
					System.out.println(n3);
					System.out.println(((Integer)ls.get(i)));
					
					//다운 캐스팅 + 언박싱
					int n4 = ((Integer)ls.get(i)).intValue();
					System.out.println(n4);
					
				}
			
	}

}
