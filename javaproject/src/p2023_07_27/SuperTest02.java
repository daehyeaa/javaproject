package p2023_07_27;

//부모 클래스안의 필드는 자식 클래스에게 상속된다.
class Point2D02 {								// 부모 클래스
	protected int x = 10;						// 필드 - 멤버 변수
	protected int y = 20;
}

class Point3D02 extends Point2D {			// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z); // x와 y는 상속 받아 사용하는 멤버변수
	}
}

class SuperTest02 {
	public static void main(String[] args) {
		Point3D02 pt = new Point3D02();
		pt.print();
	}
}