package p2023_07_20;
//p.250
 class Calculator{
	void powerOn() {
		System.out.println("전원을 켭니다.");
		return;			// 생략가능
	}
	
	// return문 : plus 메소드를 호출한 곳에 값을 돌려주는 역할
	// return문은 메소드 가장 마지막 줄에 사용해야한다.
	// return문 아래의 코드는 실행되지 않아 오류로 인식된다.
	int plus(int x, int y) {		
		int result = x + y;			// 지역변수: x, y , result
		return result;
		//System.out.println("Test");	// 오류발생
	}
	
	double divide(int x, int y) {	// 자동 형변환 : byte -> int
		double result = (double)x / (double)y;	// 강제형변환 int -> double 
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}

public class CalculatorEx {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		System.out.println();
		System.out.println(myCalc.plus(10, 20));
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // 자동형변환 byte -> int
		System.out.println("result2: " + result2);
		System.out.println(myCalc.divide(20, 6));
		
		System.out.println("커밋커밋");
		
		myCalc.powerOff();

	}

}
