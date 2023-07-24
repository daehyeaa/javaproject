package p2023_07_21;

// 상속
// 1.클래스를 상속 받기 위해서는 자식클래스명 옆에 extends를 쓴후 부모클래스를 써서 상속 받는다. 
// 2.부모 클래스의 멤버 중에서 필드아 메소드만 자식클래스로 상속된다.

// 메소드 오버라이딩(Method Overiding)
// : 부모 클래스로 부터 상속받은 메소드를 자식 클래스에서 이름과 형식은 동일하게 사용하고
//   내용을 다르게 정의해서 사용하는 것을 의미
class FinalMethod {  // 부모 클래스
	String str = "Java ";

	// public void setStr(String s) {
	// final 붙이면 서브 클래스에서 오버라이딩이 불가.
	// 부모클래스 메소드에서 fianl 메소드 가 되면 자식클래스의 오버라이딩된 메소드는 사용 할 수 없다.	
	public /*final*/ void setStr(String s) {
		str = s;
		System.out.println(str);
	}
}
        //자식클래스 extends    부모클래스
class FinalEx extends FinalMethod { //자식 클래스
	int a = 10; // final 붙이면 밑에서 a값 대입 불가.
	
	public void check() {
		System.out.println(str);
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public void setStr(String s) { // 메소드 오버라이딩
		super.str += s;					// 부모클래스와 자식클래스에서 서로 동일한 필드가 있을 경우 선언한 객체의 필드를 본다
		System.out.println(str);    // 자식객체에서 부모클래스의 필드를 가져오기 위해서는 super.동일한변수명을 사용하여 구분 짓는다.
	}
}

public class FinalTest02 {
	public static void main(String[] args) {
		FinalEx child = new FinalEx();	// 자식 객체 생성
		child.setA(100);
		System.out.println("gg");
		System.out.println(child.a);
		System.out.println("ii");
		child.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
		System.out.println("ii");
		FinalMethod parent = new FinalMethod();	// 부모 객체 ㅐㅇ성
		parent.setStr("hi");// 자신의 클래스의 setStr을 실행.
	}
}