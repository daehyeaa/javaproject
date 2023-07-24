package p2023_07_14;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 키보드로 입력한 구구단 1개단을 while 문으로 출력하는 프로개름을 작성 하세요.
		System.out.println("단을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();		
		int i = 1;
		System.out.println(dan+"단");
		while(i<10) {
			System.out.println(dan+"*"+i+ "=" +dan*i);
			i++;
		}
		
	}

}
