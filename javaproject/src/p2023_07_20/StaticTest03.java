package p2023_07_20;

class StaticTest2 {
	private static int a = 10; // 정적 필드
	private int b = 20; // 필드, 인스턴스 멤버변수

	public static void printA() { // 정적 메서드에서는 this를 사용하지 못함
		System.out.println(a); // 정적 메서드에서는 this를 사용하지 못한다.
  //    System.out.println(this.a);   //컴파일 에러 발생
	    //System.out.println(this.b); // 정적메서드 안에는 정적필드 사용이 가능하다.
		//정적 메소드 안에는 정적 필드만 사용할 수 있다.
		//System.out.println(b);
	}

	// this는 인스턴스 메서드에서 여러 객체에 의해서
	// 메서드가 호출될 때 이를 구분하기 위해서 사용된다.
	public void printB() { 
		// 일반 메소드 안에는 필드와 정적필드를 모두 사용할 수 있다.
		System.out.println(a); 
		System.out.println(b); 
	}
}

public class StaticTest03 {
	public static void main(String[] args) {
		StaticTest2.printA();	// 10
		StaticTest2 s1 = new StaticTest2();	
		System.out.println("123");
		StaticTest2 s2 = new StaticTest2();
		s1.printB();	// 10 20
		s2.printB(); // 10 20 
	}
}