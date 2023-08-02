package p2023_08_02;

import java.util.*;

class Collections05 {
	public static void main(String[] args) {

		// 제네릭을 사용하지 않으면, 여러가지 자료형의 데이터를 모두 저장할 수 있다.
		Vector vec = new Vector();
		
		// boolean add(Obejct e)
		boolean b = vec.add("Apple");				// 업캐스팅
		System.out.println(b);
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(50);		 
//		vec.add(3.14);
//		vec.add('k');
//		vec.add(true);

		//	Object로 돌려준다. get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			// 위에 String형이 아닌 데이터가 들어가서 vec.add(50)부터 밑에 있는 데이터가 저장됐을시 오류가 나낟.
			temp = (String) vec.get(i); // 다운 캐스팅		//java.lang.ClassCastException: c 오류가 난다. 밑에
//					temp=vec.get(i);	// 오브젝트에 string으로 넣을려니 오류가 난다. 다운캐스팅 필요
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}
}
