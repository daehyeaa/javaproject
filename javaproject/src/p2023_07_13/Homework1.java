package p2023_07_13;

import java.util.Scanner;

// 과제
// 키보드로 3개의 정수를 입력 받았을때 최대값과 최소값을 구하는 
// 프로그램을 작성하시오(단, 조건 연산자(삼항연산자를 활용하여 작성하시오) 

public class Homework1 {
	public static void main(String[] args) {
		
		int a, b, c, max, min;
		
		System.out.println("수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		//Scanner ff = new Scanner(null); 객체 (
		//String x = new String("몰라");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();		
	
		max = (a>b && a>c ) ? a : (b>a && b>c) ? b : c ; 		
		min = (a<b && a<c ) ? a : (b<a && b<c) ? b : c ; 			

		System.out.println("max:"+max);
		System.out.println("min:"+min);
//------------------------------------------------------------------------------------------
	
		
		
	}
}
