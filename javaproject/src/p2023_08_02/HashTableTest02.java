package p2023_08_02;

import java.util.Enumeration;
import java.util.Hashtable;

class HashTableTest02 {
	public static void main(String[] args) {
		
		// 제네릭을 설정해서 Hashtable객체를 생성하고 있으며, key의 자료형은 
		// String형, value값의 자로형도 String혀으로 설정되어 있다.
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("사과", "Apple");
		ht.put("딸기", "StrawBerry");
		ht.put("포도", "Grapes");
		ht.put("수박", "water");
		//ht.put("test", 30); 제네릭에 맞지않는 형태로 오류발생
		
//		 방법1. key를 알고 있는 경우에 사용하는 방법
//		 제네릭을 설정되어 있으면, get()메소드로 key를 이용해서 value값을 
//		 구해올때 object형을 자식클래스형으로 형변환할때 자료형을 생략 할 수 있다.
//		 Object get(object key)
		
		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		String Val = ht.get("포도");	// String 자료형을 생략 할 수 있다.
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}
		Enumeration<String> Enum = ht.keys(); // 해쉬 테이블의 키 요소들에 대한 Enumeration 객체 반환
		while (Enum.hasMoreElements()) {
			//String k = Enum.nextElement();
			//String v = ht.get(k);
			String v = ht.get(Enum.nextElement());
			//System.out.println(k + " : " + v);
			System.out.println(v);
		}
		

	}
}