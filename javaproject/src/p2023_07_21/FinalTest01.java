package p2023_07_21;

class FinalMember {
	final int a = 10; // 상수

	public void setA(int a) {
		//this.a = a;	// 상수는 값을 수정할 수 없다.

	}
}

public class FinalTest01 {
	public static void main(String[] args) {
		FinalMember ft = new FinalMember();
		final int a = 1000;
		ft.setA(100); // FinalMember 클래스에 있는 메소드 setA을 이용해 인스턴스변수를 변경 시키려고 하지만 
		// final int a 은 상수이므로 값을 수정 할수 없습니다.
		System.out.println(ft.a);
		System.out.println(a);
	}
}                                       
