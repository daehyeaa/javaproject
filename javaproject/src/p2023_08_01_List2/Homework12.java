package p2023_08_01_List2;

import java.util.Set;
import java.util.TreeSet;

// 1~45 사이의 정수중에서 6개의 숫자를 추출하는 로또 프로그램을 작성하세요
// 1)Set자료구조를 사용해서 중복 숫자가 나오지 않도록 작성하세요.
// 2)추출된 6개의 숫자를 오름차순으로 정렬해서 출력하세요.

public class Homework12 {

	public static void main(String[] args) {
		
		Set set = new TreeSet();

		System.out.println("셋사이즈"+set.size());
		while(!(set.size() == 6)) {
			int num = (int)(Math.random()*45) +1;
			set.add(num);
		}
		
		System.out.println(set);

	}

}
