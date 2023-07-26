package p2023_07_26;

class TestClass {
	private int member;	//필드 접근제어자가 private 이면 값을 정하기 위해서는 set 메소드를 이용하거나 생성자로 필드를 초기화 하여야 한다.

	public void setValue(int value) {
		member = value;
	}

	public int getValue() {
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {
		TestClass obj01 = new TestClass();
		// obj01.member = 30; //privae 접근제어자는 외부 클래스의 접근을 허용하지 않기 때문에 필드로 직접 접근 할 수 없다. 
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		//obj01.setValue(3.4);	//매개변수가 정수형이 메소드가 필요하다. 매개변수의 형이 맞지 않는다.
		System.out.println("되돌리는 값은->" + obj01.getValue());
		//obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());
	}
}                                                         
