package p2023_07_14;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      1.
//		if(조건식){
//            조건식이 참인 경우 실행될 문장;
//         }
		
		// if 10 > 5 {}  // 조건식을 만들때  괄호가 있어야 한다. (오류 발생)
		if(10 > 5) {
			System.out.println("실행1");
		};
		//실행되는 문장이 1줄인 경우에는 중괄호 {   } 를 생략할 수 있다.
		if( 10 > 5 ) System.out.println("실행2");			
		//조건식 true 는 무조건 실행
		if(true) {
			System.out.println("무조건 실행");
		}
		//조건식 false는 실행 안됨
		if(false) {
			System.out.println("실행 안됨");
		}		
		// if문에 중괄호 { } 가 없으면, if문 바로 아랫쪽 1줄만 if문의 적용을 받는다.
		if(10 > 30)
			System.out.println("실행안됨");
			System.out.println("조건식의 적용을 받지 않고 실행됨");
		
	}

}
