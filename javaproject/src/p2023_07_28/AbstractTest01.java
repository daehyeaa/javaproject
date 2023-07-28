package p2023_07_28;

// 추상클래스는 자체적으로 객체를 생성 할 수 없는 클래스
abstract class AbstractClass { // 부모 클래스(추상클래스)
	
	int a = 10;							   // 변수 추가 가능 
	
	abstract void Method01();   // 추상 메소드
												   // 이름만 있고, 내용이 없는 메소드 
	void Method02() {			       // 일반 메소드
		System.out.println("Method02:  추상클래스에서 일반 메소드 구현");
	}
	
}

class SubClass extends AbstractClass {

	// 추상 클래스를 상속 받으면, 추상 클래스 안에 있는 추상 메소드를 자식 구현 클래스에서 반드시 메소드 오버라이딩을해야한다.
	@Override
	void Method01() {
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
	
	public int getInt() {
		return this.a;
	}
	
	// 추상클래스를 상속받은 클래스는 추상메소드를 반드시 오버라이딩을 해야한다. 
//	void Method01() {
//		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
//	}
	
	
}

class AbstractTest01 {
	public static void main(String args[]) {
		SubClass obj = new SubClass();
		
		//추상 클래스는 자체적으로 객체 생성을 할 수 없다.
		//AbstractClass ab = new AbstractClass();
		System.out.println(obj.getInt());
		obj.Method01();	// 메소드 오버라이딩된 메소드가 호출된다.
		obj.Method02();	// 부모 클래스로 부터 상속받은 Method02() 메소드가 호출된다.
	}
}


