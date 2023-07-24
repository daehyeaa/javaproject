
package p2023_07_20;

//p260
// execute() 호출 -> avg() 메소드 호출 -> plus() 메소드 호출 -> println() 메소드 호출 
class Calculator1 {
	int plus(int x, int y) {
		int result = x + y ;					// 17
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	// plust () 메소드 호출
		double result = sum / 2;		// 8.5 호출
		return result;
	}
	
	void execute() {
		double result = avg(7,10);		//avg()메소드 호출
		println("실행결과: " + result);	//println()메소드 호출
	}
	
	void println(String message) {
		System.out.println(message);
	}
}

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator1 myCalc = new Calculator1();
		//main() 메소드 안에서 method를 호출하기 위해서는 method를 가진 클래스로 객체를 생성한 후에 생성된 객체를 이용해서 method를 호출해야 한다.
		myCalc.execute();
		
	}

}


