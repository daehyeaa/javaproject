package p2023_07_17;

public class MethodEx01 {	
	// 메소드 : 여러가지 코드를 묶어 놓은 것
	// 메소드를 사용하는 이유는 코드를 재사용하기 위해서 메소드 사용한다.
	// 동일한 메소드명의 매개변수의 타입이 다르거나 갯수가 다르면 오버로딩 이라고 한다.
	
	// 사용자 정의 메소드
	// 사용자 정의 메소드는 프로그래머가 직접 호출해야 실행된다.
	static void check() {		// 정적 메소드(static이 붙은 메소드)
		System.out.println("메소드 호출 성공");
		//return;									// return 생략 가능
	}
	// 값 전달(기본자료형) 에 의한 메소드 호출방식(call by Value방식)  
	// 매개변수가 기본자료형받아 실행되는 메소드를 call by Value 방식
	static void check(int a) {	// 매개변수(parameter) 스택메모리 영역에 생성 		
		System.out.println(a+" 의 값 호출 성공");
	}	
	static void check(int a, double d) {
		double result = a+ d;
		System.out.println("전달될 값의 합:"+result);
	}	
	static void check(char c) {
		System.out.println("전달된 값 : "+c);
	}
	
	static void check(boolean b) {
		System.out.println("전달된 값 : "+ b);
	}	
	// 주소값 전달에 의한 메소드 호출방식(Call by Reference) 방식
	// 참조형 값에 의한 메소드 호출방식
	static void check(String s) {					// String s = "자바";
		System.out.println("전달된 값 : "+ s);	// String s =heck(new String("자바"));
	}
	
	// return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
	// return문은 메소드 가장 마지막 줄에 사용해야 한다.
	static int check01() {
		System.out.println("리턴구문");
		return 50;		// 메소드를 호출한 곳에 50을 돌려주는 역할
	}
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	
	// main() 메소드는 자바가상머신 (JVM:java.exe)으로만 호출된다.
	// main()메소드는 프로그래머가 직접 호출 할 수 없다.
	public static void main(String[] args) {
		int i = 10;
		MethodEx01.check(); // check() 메소드 호출
		check();
		check(30);				
		MethodEx01.check(10 , 20.5);
		check('A');
		check(true);
		check("자바");	// check(new String("자바"));
		check01(); 		// return문으로 돌려주는 값이 출력되지 않는다.
		int result = check01();
		System.out.println("돌려 받은 값1 : "+result);
		System.out.println("돌려 받은 값2 : "+check01());;
		
		double result2 = check02(50,3.14);
		System.out.println("돌려 받은 값3 : "+result2);
		System.out.println("돌려 받은 값3 : "+check02(50,3.14));
			
	}

}
