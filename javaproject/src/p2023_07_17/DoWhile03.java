package p2023_07_17;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

	System.out.println("메세지를 입력하세요.");
	System.out.println("프로개름을 종료하려면 q를 입력하세요.");
	
//	if(new Scanner(System.in).nextInt() < 10) {
//		System.out.println("여기");
//	} else if (new Scanner(System.in).nextInt() > 30 ) {
//		System.out.println("저기");
//	} else {
//		System.out.println("조기");
//	}
	
	Scanner sc = new Scanner(System.in);
	String input;
	
	do {
		System.out.print(">");
		input = sc.nextLine();  // 사용자가 입력한 값을 한줄을 그래도 받는 메소드 띄어쓰기도 상관없음 enter키 이전의 값
		System.out.println("입력문자"+ input);
		
	}while(!(input.equals("q")));	// 사용자가 q를 입력하면 do ~ while문을 빠져 나오게 된다.
//	while("oracle".equals("q")   :  loop문이 계속 실행된다.	
//	while(!"q".equals("q")			:  loop문을 빠져 나온다.
	
	
	System.out.println("프로그램 종료");
	sc.close();
		
	}

}
