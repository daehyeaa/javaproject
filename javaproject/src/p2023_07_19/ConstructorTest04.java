package p2023_07_19;

class MyDate04 {
	int year; // field, 멤버변수
	int month;
	int day;

	public MyDate04() { // 기본 생성자
		year = 2023;
		month = 4;
		day = 1;
	}

	// 이클립스에서 우클릭 -> source -> generate Constructor using Fields 클릭 -> omit ~~~ 상속 super() 메소드를 생성하지 않는다 클릭 -> 생성 
	// this : 내부 레퍼런스 변수
	public MyDate04(int year, int month, int day) {
		this.year = year;			
		this.month = month;
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest04 {	
	
	public static void main(String[] args) {		
		
		MyDate d = new MyDate();
		d.print();
		
		MyDate04 d22 = new MyDate04();
		d22.print();
		MyDate04 d2 = new MyDate04(2023, 7, 19);
		d2.print();
		d2.year = 10;
		d2.print();
	}
}