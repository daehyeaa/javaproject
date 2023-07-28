package p2023_07_28;
/*
 * 인터페이스(interface)
인터페이스는 상수와 추상메소드로 구성된다.
자바 8 부터 디폴트 메소드, 정적 메소드로 사용가능함
cf.추상클래스(멤버변수, 일반메소드, 추상메소드)

public interface Inter01{
    int a = 10;				// 상수 (public static final 생략가능)
    void check();			// 추상메소드 ( public abstract 생략가능)
}

인터페이스를 상속 받을 때는 implements로 상속을 받는다.
인터페이스를 상속받은 일반 클래스는 인터페이스 안에 들어 있는 추상메소드를 반드시 Method Overriding해야된다.

interface A {
	public abstract void check();
}
clasee S implements A {
	public void check() {		// public 을 생략 할 수 없다.
	}
}

인터페이스는 다중상속을 허용한다.
interface A{}
interface B{}
class S implements A, B{
}

추상클래스와 인터페이스를모두 상속을 받는 경우에는 추상클래스를 먼저 상속을 받고, 인터페이스는 그다음으로
상속받아야 한다. (상속 받는 순서가 바뀌면 안됨)
interface A{}
abstract class B{}
Class S extends B implements A {}
 */

public interface Inter01{		// 인터페이스

	int a = 10; // 상수 (public static final 생략) 
	
	public abstract void action();	// 추상 메소드
	
	void check();	// 추상메소드(public abstract 생략)
}
