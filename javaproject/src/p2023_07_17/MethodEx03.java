package p2023_07_17;

import java.util.Scanner;

public class MethodEx03 {

	//키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요.
	// 단, 메소드를 이용해서 작성하세요.
	
	// 최대값
	static int max(int a, int b) {
		if( a > b)
			return a;
		else 
			return b;
	}
	
	// 최소값
	static int min(int a, int b) {
		if( a < b)
			return a;
		else 
			return b;
	}
	
	public static void main(String[] args) {
		System.out.println("2개의 정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int n1, n2, max, min;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		max = MethodEx03.max(n1, n2);		// max()메소드 호출
		min = min(n1, n2);		// min()메소드 호출			//같은 클래스의 정적 메소드는 객체를 따로 생산하지 않고 메소드 호출이 가능하다 .
		
		System.out.println("max의 값 " +max);
		System.out.println("min의 값 " +min);
		
		System.out.println("max의 값 " +max(n1,  n2));
		System.out.println("min의 값 " +min(n1,  n2));
		
			
	}

}
