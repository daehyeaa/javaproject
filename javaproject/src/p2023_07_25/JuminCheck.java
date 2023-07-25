package p2023_07_25;

import java.util.Scanner;

public class JuminCheck {
	
	Boolean chck1(String jumin1) { // 주민번호 앞자리 체크 메소드
		if (jumin1.equals("")) { // 아무것도 입력하지 않았습니다 입력해주세요.
			System.out.println("아무것도 입력하지 않았습니다. 다시 입력해주세요.");		
		}else if(jumin1.length() != 6) {
			System.out.println("주민번호 앞자리 6자리수를 입력해주세요.");
		}
		return true;
	}
	void chck2(String jumin2) { // 주민번호 뒷자리 체크 메소드

	}

	public static void main(String[] args) {

		// 키보드로 주민번호를 입력 받아서 남자인지, 여자인지를 판별하는 프로그램을 작성하세요.
		// 단, 주민번호 앞자리는 6자리, 뒷자리는 7자리 인지를 유효성 검사를 한다.

		System.out.println("주민번호 앞자리를 입력하세요.");
		Scanner sc =  new Scanner(System.in);
		String jumin11 = sc.nextLine();
		
		
//   -----------------------------------------------------------------------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//
//		try { // 예외가 발생할 가능성이 있는 소스 try 안에있는 소스들
//			System.out.println("주민등록번호 앞자리를 입력 하세요.");
//			String jumin1 = sc.nextLine();
//			System.out.println("주민등록번호 뒷자리를 입력 하세요.");
//			String jumin2 = sc.nextLine();
//
//			String g = jumin2.substring(0, 1); // jumin2 = "1234567"		//예외가 발생할 가능성이 있는 곳 뒷자리를 입력하지 않으면 substring을 추출 할 수 없다.
//
//			
//			// 유효성 검사
//			if (jumin1.equals("")) {
//				System.out.println("주민번호 앞자리를 입력 하세요.");
//			} else if (jumin1.length() != 6) {
//				System.out.println("주민번호 앞자리 6자리를 입력 하세요.");
//			} else if (jumin2.equals("")) {
//				System.out.println("주민번호 뒷자리를 입력 하세요.");
//			} else if (jumin2.length() != 7) {
//				System.out.println("주민번호 뒷자리 7자리를 입력 하세요. ");
//			} else if (g.equals("2") || g.equals("4")) {
//				System.out.println("여자입니다.");
//			} else if (g.equals("1") || g.equals("3")) {
//				System.out.println("남자입니다.");
//			} else {
//				System.out.println("똑바로 입력 하세요.");
//			}
//		} catch (Exception e) {
//			System.out.println("잘못된 정보 입니다.");
//		}
	}

}
