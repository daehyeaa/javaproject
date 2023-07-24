package p2023_07_14;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 if(조건식) {
//		 	조건식이 참인경우 실행될 문장;
//		  }else {
//		    조건식이 거짓인경우 실행될 문장;
//		  }
		 
		//키보드로 입력한 정수가 짝수, 홀수 인지를 판별하는 프로그램을 작성하세요.
		
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {  // 짝수
			System.out.println(n+"의 값은 짝수입니다.");
		} else {				  // 홀수
			System.out.println(n+"의 값은 홀수입니다.");			
		}
		
	}
}
