package p2023_07_19;

class MyDate06 {
	// field : 객체가 생성될때 heap 메모리상에서 값을 저장하는 역할
	private int year;
	private int month;
	private int day;

	// 생성자 : 객체가 생성될때 호출되면서, 필드값을 초기화 시키는 역할
//  public MyDate(){//default 생성자
//  }  
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year; // 2023
		month = new_month; // 7
		day = new_day; // 19
	}
	
	// 1. 메소드 : 필드값을 출력하는 역할
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}

	// 2. getter 메소드 : 필드값을 메소드를 호출한 곳에 돌려주는 역할
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	// 3. setter 메소드 :  필드값을 수정, 변경하는 역할
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2023, 7, 19);
		d.print();
		System.out.println(d.getYear());
		d.setYear(2024); // year를 2024년으로  수정 
		System.out.println(d.getYear());
		d.print();
		
		d.setMonth(10); // month를 10월로 수정
		d.print();
		
		d.setDay(25);	// day를 25일로 수정		
		d.print();
		
		System.out.println("돌려받은 year:"+ d.getYear()); //2024
		System.out.println("돌려받은 year:"+ d.getMonth()); //10
		System.out.println("돌려받은 year:"+ d.getDay()); //25
		
	}
}