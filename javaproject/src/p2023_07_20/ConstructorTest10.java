package p2023_07_20;

// this() : 같은 클래스 안에 있는 생성자를 호출하라는 의미로 사용됨.
class MyDate10 {

	private int year;					//  field, 멤버변수
	private int month;
	private int day;

	// 생성자 오버로딩 : 한개의 클래스에 여러개의 생성자를 정의 하는것.
	// 조건 : 매개변수의 자료형을 다르게 정의, 매개변수의 자료형의 갯수를 다르게 정의
	// java api 제공하는 String class 찾아보고 거기에 나와있는 생성자만 사용 할 수 있는다
	// String a = new String("자바");
	// Constructors
	// Constructor and Description  String(String original) 의 생성자를 사용한다.
	// 매개변수의 자료형 순서를 다르게 정의
	public MyDate10() {				// 기본 생성자
		this(1991, 11, 13); // 같은 클래스안의 생성자 호출 
									   //  MyDate10(int new_year,int new_month,int new_day) 메소드 호출
	}

	// MyDate10 d3 = new MyDate10(2020); 생성자 호출하면
	public MyDate10(int new_year) {
		// 매개변수가 (2020) 이기때문에 new_year은 2020이 되면
		this(new_year, 1, 1);
		// this() 로 인해 다시 한번 
		// MyDate10(int new_year, int new_month, int new_day) 메소드 호출 
		// int new_year 은 2020으로 받았기 때문에 
		// year = 2020  
		// month = 1
		// day = 1 로 초기화된다. 
	}

	public MyDate10(int new_year, int new_month) {
		this(new_year, new_month, 1);
	}

	public MyDate10(int new_year, int new_month, int new_day) {
		year = new_year;
		month = new_month;
		day = new_day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest10 {
	public static void main(String[] args) {
		MyDate10 d = new MyDate10(2025, 10, 25);
		d.print();
		MyDate10 d2 = new MyDate10(2023, 11);
		d2.print();
		MyDate10 d3 = new MyDate10(2020);
		d3.print();						// 출력값은 : 2020/1/1 로 출력된다.
		MyDate10 d4 = new MyDate10();
		d4.print();
	}
}