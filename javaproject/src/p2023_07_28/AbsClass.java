package p2023_07_28;

public abstract class AbsClass {
	int a;				// 변수 선언 가능 
	
	// 추상메소드: 메소드 이름만 있고, 내용이 없는 메소드
	public abstract void check();	// 추상메소드 가능
	public void dark() {					// 일반메소드 가능
		System.out.println("일반 메소드 생성 가능");
	}

}
