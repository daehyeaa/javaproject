package p2023_07_18;

import java.util.Arrays;

// p187
public class ArrayEx07 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));		
		
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);	// 프로그램 강제 종료
		}
		
		String strNum1 = args[0];		// args[0] = "10"
		String strNum2 = args[1];		// args[1] = "20"
		
		// 문자를 숫자로 형변환 : "20" ---> 20
		// Wrapper 클래스 
		int num1 = Integer.parseInt(strNum1);		//정적메소드는 따로 객체를 생성할 필요 없이 클래스.메소드 로 선언이 가능하다.
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);		
		
	}
}
