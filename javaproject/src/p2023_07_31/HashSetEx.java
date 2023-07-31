package p2023_07_31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		//제네릭(generic)
		// : 자료구조에 1가지 자료형의 데이터만 저장할 수 있도록 해준다.
		// <> generic < > 안에 자료형을 입력하면 입력한 자료형만 넣을 수 있다 다른 자료형의 데이터가 들어오면 오류가 발생한다.
		Set<String> set = new HashSet<String>();
		// set.add(30); 오류발생
		set.add("ee");
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");			// 중복된 데이터를 저장할 수 없다.
		set.add("iBatis");
		
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+ element);
		}
		
		set.remove("JDBC");
		set.remove("iBatis");
		System.out.println("총 객체수: "+ set.size());	// 3
		
		
		// 반복자
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t"+ element);
		}
		
		// clear() : 모두 원소를 삭제하는 역할
		set.clear();
		if(set.isEmpty()) {		// isEmpty() : 해당 자료구조가 비어있을때 true 리턴
			System.out.println("비어있음");
		}
	}

}
