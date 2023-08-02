package p2023_08_02;

import java.util.*;

class Collections06 {
	public static void main(String[] args) {
		
		// 제네릭(Generic) : 자료구조에 한가지 자료형의 데이터만 저장 하도록 해주는 역할
		Vector<String> vec = new Vector<String>();

		// boolean add(Object e)
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		//vec.add(50);		// 오류발생 제네릭으로 String을 설정했기때문에 String 형 데이터만 저장 할 수 있다.

		//Object get(int index)
		String temp;
		// 제네릭을 사용하게 되면, 자료구조에서 데이터를 구해올때 제네릭으로 설정된 자료형은 생략할 수 있다.
		for (int i = 0; i < vec.size(); i++) {
			temp = /*(String) 생략가능*/ vec.get(i); // 제네릭을 String으로 정의해둬서 String = String 임으로 (String) 강제형변환을 생략해도 인식한다.
			System.out.println(temp.toUpperCase());
		}
	}
}
