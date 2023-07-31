package p2023_07_31;

import java.util.*;

class dodo{
	int a = 50;
}

class Collections02 {

	public static void main(String[] args) {
//  List list = new ArrayList();
		
		dodo b = new dodo();
		if(50 == b.a) {
		System.out.println("dd"+b.a);
		}
		ArrayList list = new ArrayList();
		list.add("하나");								// 업캐스팅
		list.add(new dodo().a);
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
