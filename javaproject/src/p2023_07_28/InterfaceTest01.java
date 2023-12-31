package p2023_07_28;

interface IHello01 {		// 인터페이스
	void sayHello(String name);	// 추상메소드 (public abstract 생략)
}

class Hello01 implements IHello01 {
	public void sayHello(String name) {		// public 생략 불가능
//	void sayHello(String name){
		System.out.println(name + "씨 안녕하세요!");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		// 인터페이스는 자체적으로 객체 생성을 할 수 없다.
		//IHello01 ih = new IHello01(); // 오류발생
			
		
		Hello01 obj = new Hello01();
		obj.sayHello("홍길동");
		obj.sayHello("이순신");
	}
}
