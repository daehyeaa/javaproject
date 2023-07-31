package p2023_07_31;

import java.util.ArrayList;
import java.util.List;

// p560
// ArrayList
public class ArrayListEx {
	public static void main(String[] args) {

		
		List<String> list = new ArrayList<String>();	// 업캐스팅
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");	// Servlet/JSP는 인덱스 2번에서 3번으로 이동
		list.add(2,"database");	// 인덱스 2번 위치에 Database 추가
		list.add("iBatis");
		
		System.out.println(list);
		
		int size = list.size();
		System.out.println("총 객체수:"+size);
		System.out.println();
		
		//인덱스 2번 원소를 구해와서 skill 변수에 저장 후 출력
		String skill = list.get(2);
		System.out.println("2:"+ skill);
		System.out.println();
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":" + str);
		}
		System.out.println();
		
		// remove(int index) : 특정 인덱스 번호를 가진 원소를 삭제하는 역할
		list.remove(2);	// Database 삭제
		list.remove(2);// Servlet/JSP 삭제
		list.remove("iBatis");   // remove(Object o) : 특정값을 삭제한다.
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":" + str);
		}
		System.out.println();
		
		
		
		
		
	}

}
