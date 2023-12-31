package p2023_07_27;
//* 상속에서의 생성자
//1. 생성자는 기본적으로 상속이 되지 않는다
//2. 자식클래스를 이용해서 객체를 생성할때 자식클래스의 
//   생성자(기본생성자,매개변수 있는 생성자 모두 가능)가 
//   호출되면, 부모클래스의 기본생성자가 자동으로 호출된다.
//3. 매개변수가 있는 생성자가 있는 경우에는 더이상 컴파일러가
//   기본 생성자를 자동으로 생성해 주지 않는다.
//4. 부모 클래스의 매개변수가 있는 생성자를 자식 클래스에서
//   호출 할때는 super()를 이용해서 호출할 수 있다.
//   단, super()는 자식 클래스의 생성자 안에서만 사용 가능함.
class Point2D05 {
	protected int x = 10;
	protected int y = 20;

//	public Point2D05() {
//		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
//	}
}

class Point3D05 extends Point2D05 {
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}

		// 
//	public Point3D05() {
//		System.out.println("서브 클래스인 Point3D 생성자 호출");
//	}
}

class SuperTest05 {
	public static void main(String[] args) {
		Point3D05 pt = new Point3D05();
		pt.print();
	}
}