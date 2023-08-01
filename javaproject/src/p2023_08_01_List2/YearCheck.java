package p2023_08_01_List2;

// C:\Program Files\Java\jdk-11\lib src 폴더를 압출풀기 하고 필요한 라이브러리 메소드들의 소스를 볼 수 있다.

import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
//		업캐스팅이 되면 부모가 상속해준 메소드만 호출할 수 있다.
//		Calendar y = new GregorianCalendar();  // 업캐스팅
		GregorianCalendar y = new GregorianCalendar();

		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}

	}

}
