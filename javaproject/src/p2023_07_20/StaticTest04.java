package p2023_07_20;

class StaticTest3 {
	private static int a = 10; // 정적 필드
	private int b = 20; 		   // 필드, 인스턴스 멤버변수

	public static void printA() {		// 정적 메소드
		
		// 정적 메소드 안에는 정적 필드만 사용 가능하다.
		System.out.println(a);
		// System.out.println(b); //컴파일 에러 발생
	}

	public void printB() {
		//일반 메소드 안에는 필드와 정적필드를 모두 사용할 수 있다.
		System.out.println(a);
		System.out.println(b);
	}
}

public class StaticTest04 {
	public static void main(String[] args) {
		// 정적 메소드는 정적메소드를 가진 클래스명으로 dot(.)으로 접근해서 호출한다.
		StaticTest3.printA();
		
		// 일반 메소드는 일반 메소드를 가진 클래스명으로 객체를 생성해서 메소드를
		// 호출해야 한다.
		StaticTest3 s1 = new StaticTest3();
		StaticTest3 s2 = new StaticTest3();
		s1.printB();
		s2.printB();
	}
}
