package p2023_07_19;

class MyDate05 {
	private int year;
	private int month;
	private int day;
	
	// 기본 생성자는 객체를 생성할때 컴파일러가 자동으로 만들어 주지만, 예외적으로
	// 매개변수를 가진 생성자가 있을 경우에는 더 이상 기본 생성자를 만들어 주지 않는다.

	public MyDate05() {	//기본생성자
	}

	// 생성자의 매개변수명과 필드명이 같은 이름인 경우에는 값전달이 되지 않는다. 그럴때 this을 붙여주면 값 전달이 된다.
	public MyDate05(int year, int month, int day) {
		year = year;		//0
		//this.year = year;		// 2023
		month = month;	// 0
		//this.month = month;	// 11
		day = day;			// 0   
		//this.day = day;			// 13
	}

	public void print() {
		System.out.println(year + "/" + month	+ "/" + day);
	}
}

public class ConstructorTest05 {
	public static void main(String[] args) {
		
		MyDate05 d = new MyDate05();
		d.print();

		MyDate05 d2 = new MyDate05(2023, 11, 13);
		d2.print();

	}
}