package p2023_07_24;

public class SubstringEx {

	public static void main(String[] args) {

		// 아래와 같은 주민번호가 있을때, 남자인지 여자인지를 판별하는 프로그램을 작성하세요
		
		String jumin = "950101-234567";
		
		String gender = jumin.substring(7, 8);
		
		//System.out.println(jumin.substring(7, 8));
		
		if(Integer.parseInt(jumin.substring(7, 8)) == 1 ) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		if(jumin.substring(7, 8).equals("1") || jumin.substring(7, 8).equals("3")) {
			System.out.println("남자입니다.");
		}else if( jumin.substring(7, 8).equals("2") || jumin.substring(7, 8).equals("4") ){
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		
		char c = jumin.charAt(7); // 7번째
		if(c == '1' || c == '3') {		// char형은 기본 자료형 이기 때문에  == 을 사용한다.
			System.out.println("남자입니다.");
		}else if ( c == '2' || c == '4' ) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된정보입니다.");
		}
		
	}

}
