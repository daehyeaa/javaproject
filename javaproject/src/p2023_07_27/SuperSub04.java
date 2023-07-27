package p2023_07_27;

//바이트코드는 따로 만들어진다.
// 부모 클래스안의 필드는 자식 클래스에게 상속된다.
class Point2D {	//부모 클래스 
	protected int x = 10; // private int x=10;
	// private 으로 화면 상속관계여도 접근하지 못한다.
	// default 은 같은 패키지 안에 있는 것은 접근이 가능하다.
	protected int y = 20; // private int y=20;
}

class Point3D extends Point2D {	//자식클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}
}

class SuperSub04 {
	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.print();
		System.out.println("x="+pt.x);
		System.out.println("x="+pt.y);
		System.out.println("x="+pt.z);
	}
}