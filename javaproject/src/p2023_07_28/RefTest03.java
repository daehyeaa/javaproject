package p2023_07_28;

class Parent03 {
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 {
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03(); // 서브 클래스로 인스턴스 선언	// 업캐스팅(자동 형변환)
		//부모 클래스 p = new 자식클래스 생성자 호출;
		p.parentPrn();							// 부모가 상속해준 메소드만 호출 가능함
		// p.childPrn();//-컴파일 에러		// 부모가 상속 해주지 않는 메소드는 호출할 수 없다.
		Child03 c; // 서브 클래스로 레퍼런스 변수 선언  (주소값을 가지지 못한 상태);
		
		Child03 c1 = (Child03) p; /// 다운 캐스팅 (강제 형변환) 가로를 지우면 오류
		
		System.out.println("---------------->>");
		// 서브 클래스 레퍼런스 변수에 슈퍼 클래스의 레퍼런스 값이 대입됨
		// 다운 캐스팅이 되면 상속받은 메소드(parentPrn()) 와 자기 클래스의 메소드 (childPrn()) 2개의 메소드 호출해서 사용할 수 있다.
		// 참조 가능한 영역의 확대가 일어난다.
		c = (Child03) p; // 강제 형변환으로 다운 캐스팅
		c.parentPrn();
		c.childPrn();
	}
}