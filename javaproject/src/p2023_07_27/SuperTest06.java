package p2023_07_27;

class Point2D06 {					// 부모 클래스
	protected int x = 10;			// 필드
	protected int y = 20;

	public Point2D06( ){			// 기본 생성자 
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출"); 
	}
	 
	public Point2D06(int xx, int yy) {		// 매개변수 있는 생성자
		x = xx;
		y = yy;
	}
}

// super()
// 1. super()는 부모 클래스의 매개변수를 가진 생성자를 호추할때 사용한다.
// 2. super()는 자식 클래스의 생성자 안에서 첫번째 라인에 사용해야 한다.
// 3. super()를 이용해서 부모 클래스의 매개변수를 가진 생성자를 호출하면,
// 더이상 부모클래스의 기본 생성자를 호출해주지 않는다.

class Point3D06 extends Point2D06 {
	protected int z = 30;

	public Point3D06() {		// 기본생성자
		super(50,60); //부모클래스의 매개변수가 있는 생성자 호출
		// 메소드에 있으면 안되고 제일 상단에 있어야 한다 위에 다른 코드가 있으면 안된다.
		System.out.println("서브 클래스인 Point3D 생성자 호출");
	}
	
	public void print() {			// 메소드
		System.out.println(x + ", " + y + "," + z);
	}

}

class SuperTest06 {
	public static void main(String[] args) {
		Point3D06 pt = new Point3D06();
		pt.print();
	}
}