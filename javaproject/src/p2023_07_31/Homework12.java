package p2023_07_31;


import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework12 {

	public static void main(String[] args) {

		// calendar를 부모로 하는 객체에서는 isLeapYear 메소드가 없는데
		// 객체 자체를 GregorianCalendar 선언하면 isLeap Year가 나온다.
		GregorianCalendar c =new GregorianCalendar();
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		System.out.println("년도를 입력하세요.");
		if(c.isLeapYear(year)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		
	}

}
