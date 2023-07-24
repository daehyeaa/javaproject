package p2023_07_20;

class StaticTest1 {
	private static int a = 10;  // private 외부에서 접근하는 클래스 접근하지 못하게 하는 것
	private int b = 20;				// 인스턴스 멤버변수

	public static void setA(int new_a) {		// 정적 메소드
		a = new_a;
	}

	public static int getA() {							// 정적 메소드
		return a;
	}
}

public class StaticTest02 {
	public static void main(String[] args) {
		
		//a가 private으로 선언되어서 컴파일 에러 발생
		// System.out.println(StaticTest1.a);
		
		System.out.println(StaticTest1.getA());

		StaticTest1 s1 = new StaticTest1();
		StaticTest1 s2 = new StaticTest1();

		s1.setA(10000);
		int res1 = s1.getA();
		System.out.println(res1);
		StaticTest1.setA(22);
		System.out.println(s2.getA());
	}
}