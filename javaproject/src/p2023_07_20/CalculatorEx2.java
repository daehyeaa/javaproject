package p2023_07_20;

//p265
// 메소드 오버로딩(Method overloading)
// : 한개의 클래스안에 동일한 이름을 가진 메소드를 여러개 정의 하는 것

// 메소드 오버로딩 조건 
// 1. 매개변수의 자료형을 서로 다르게 설정
// 2. 매개변수의 갯수를 서로 다르게 설정
// 3. 매개변수의 순서를 바꾸어서 설정

// 정적 필드, 정적 메소드는 객체를 생성하지 않고 바로 쓸수 있게 했다.

class Calculator3 {
	// 메소드의 이름은 같지만 매개변수의 수가 다르므로 메소드의 오버로딩 이다.	
	// 정사각형
	double areaRectangle(double width) {
		return width * width;
	}
	// 직사각형
	double areaRectangle(double width, double height) {
		return width * height;
	}	
}

public class CalculatorEx2 {
	public static void main(String[] args) {
		Calculator3 cal = new Calculator3();
		
		//정사각형 넓이 구하기
		double result1 = cal.areaRectangle(10);
		//직사각혀 넓이 구하기
		double result2 = cal.areaRectangle(10,20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}


	
}
