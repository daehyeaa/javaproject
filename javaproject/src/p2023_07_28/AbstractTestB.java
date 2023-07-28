package p2023_07_28;

// 추상클래스도 같은 패키지(?) 안에 동일한 클래스명이 있으면 안된다.
abstract class AbstractClassB {	//추상 클래스
	abstract void Method01();		//추상 메소드

	void Method02() {						//일반 메소드
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

abstract class MiddleClass extends AbstractClassB {  // 추상클래스도 추상크래스를 상속 받을 수 있다.
	void Method01() {
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}

	public void Method03() {
		System.out.println("Method03: 추상클래스에서 구현");
	}
}

class SubClassB extends MiddleClass {
	void Method01(){		// 추상클래스 상속한 추상클래스의 추상메소드여도 추상받은 클래스에서 오버라이딩 하면 일반 메소드가 됨으로 2번 상속받은 클래스는 위가 추상메소드
		// 였어도 일반메소드로 인식하기 때문에 따로 오버라이딩을 할 필요 없다.
	  System.out.println("ㅎㅎㅎㅎㅎㅎㅎMethod01: 서브클래스에서 구현된 추상메소드");
	}
}

class AbstractTestB {
	public static void main(String args[]) {
		SubClassB obj = new SubClassB();
		obj.Method01();	// 메소드 오버라이딩된 메소드가 호출된다.
		obj.Method02();	// 조부모 클래스로 부터 상속 받은 메소드를 호출한다.
		obj.Method03();	// 부모 클래스에 있는 메소드가 호출된다.
	}
}
