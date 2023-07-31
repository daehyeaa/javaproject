package p2023_07_31;

import java.util.*;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();			// 업캐스팅
		//	ArrayList list = new ArrayList();

		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);
		System.out.println(list);
		
		
		// Object get(int index)
		System.out.println(list.get(2));	// 인덱스 2번원소 추출: 3.42
		System.out.println(list.get(4));	// 인덱스 2번원소 추출: five

		for (int i = 0; i < list.size(); i++) {
			  System.out.println( i + " 번째 요소는 " + list.get(i));
			  Object s = list.get(i);
			  //String s =(String)(list.get(i)); 오류발생 list의 값들이 String 형이 아닌 자료가 존재함으로 오류가 발생한다.
			  System.out.println(s);
		}
		
		for(Object obj : list) {
			System.out.println("오브젝트"+obj);
		}
		
		// 반복자 : 하나,2,3.42,넷,five,6
		Iterator element = list.iterator();
		while(element.hasNext()) {
			System.out.println("\t\t" + element.next());
			// next() : 데이터를 1개씩 가져오는 역할
			
		}

//	Iterator elements=list.iterator();    
//	while(elements.hasNext()) {
//      System.out.println("\t\t" + elements.next());
//	}	

	}
}
