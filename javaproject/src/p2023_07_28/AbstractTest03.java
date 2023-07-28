package p2023_07_28;

abstract class Hello {		//  추상클래스
	public abstract void sayHello(String name);	// 추상 메소드 매개변수 넣기 가능 
}

abstract class GoodBye {	// 같은 클래스파일내에 추상클래스 2개 생성 가능 
	public abstract void sayGoodBye(String name);	// 추상메소드
}

// 하나의 클래스는 하나의 상속만 가능하다. 
// 자바에서는 클래스의 다중상속을 허용하지 않는다.
class SubClass03 extends Hello {			
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest03 {
	public static void main(String[] args) {
		SubClass03 test = new SubClass03();
		test.sayHello(args[0]);
		test.sayGoodBye(args[0]);
	}
}
