package p2023_07_13;

public class Oper04 {

	public static void main(String[] args) {
		//비교 연산자 : >, >=, <, <= , ==(같다), != (같지않다)
		//비교 연산자의 결과가 참이면 true, 거짓이면 false 값을 리턴한다.
		
		// 지역변수는 stack memory 영역에 저장된다 .
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바"); // 스트링 객체를 생성한다.		
		
		// 참조형 변수는 스택메모리에 주소값을 갖고 있고 실제 값은 heap 메모리에 있다.
		// str1, str2 는 같은 값을 가르키고 있기 때문에 같은 주소값을 갖고 있다.		
		// str1에 생성된 자바는 str2 = "자바" 지역변수 선언은 같은 값을 갖고 있는 str1 과 동일한 주소값과 실제값을 갖고 있다 . 새로 값을 만들지 않는다.
		// str3 = new String("자바"); 로 선언했기 때문에 new 연산자를 사용 했기 때문에 str1,str2 와 같은 값이라도 같은 주소값이 아닌 새로운 주소값을 갖는다. 실제값은 같아 보이더라도
		// heap 메모리에 새로운 자바값이 2개 생성되어 있다.
		
		// 비교 연사자로 주소값을 비교
		if(str1 == str2) {
			System.out.println("같은 주소");	// 같은 주소
		}else {
			System.out.println("다른 주소");			
		}
		
		if(str1 == str3) {
			System.out.println("같은 주소");	// 다른 주소
		}else {
			System.out.println("다른 주소");			
		}
		
		// 값을 비교 
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		
	}

}
