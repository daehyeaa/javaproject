package p2023_07_17;

import java.util.Scanner;

public class Homework03 {
	
	static int factorial(int n) {		
		if(n==1) {
			return 1;
		}		
		return n * factorial(n-1);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드를 이용해서 입력한 정수의 팩토리얼을 구하는 프로그램을 작성 하세요.
		System.out.println("값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = factorial(a);
		System.out.println(a+"!의 팩토리얼 값은 : "+b);		
	}
}
