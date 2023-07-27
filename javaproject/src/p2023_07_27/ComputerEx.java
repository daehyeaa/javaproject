package p2023_07_27;

//p318 ~ 319

class Calculator{	// 부모 클래스
	double areaCircle(double r) {	//원 넓이
		System.out.println("Calculaotr 객체의 areaCircle()실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator{	// 자식 클래스
	
	@Override // anotation 올바르게 오버라이딩 됐는지 확인해주는 어노테이션	
	double areaCircle(double r) {		// 메소드 오버라이딩 
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI * r * r;
	}
	
}

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원의 면적: " +cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원의 면적: " +com.areaCircle(r));
		//	자식 클래스에서 메소드 오버라이딩된 메소드가 호출된다.
		
	}

}
