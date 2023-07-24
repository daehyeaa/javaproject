package p2023_07_19;

class MyDate03 {
	private int year;		//field, 멤버변수
	private int month;
	private int day;
	
	//생성자 : 객체를 생성할때 호출되고, 필드값을 초기화 시켜주는 역할을 한다.
	public MyDate03() { // 기본 생성자
		year = 2023;
		month = 4;
		day = 1;
	}

	public void print() {	//메소드
		System.out.println(year + "/" + month + "/" + day);
	}
	
}// MyDate end	//독립적으로 실행이 안된다. 메인메소드가 없기때문에 컴파일까지는 가능하다.

public class ConstructorTest03 {
	public static void main(String[] args) {
		MyDate d = new MyDate();	//접근제어자가 public 이기 때문에 constructorTest02 에 있는 MyDate 클래스 기본생성자를 호출 한다.
		d.print();	//메소드 호출
		MyDate03 dd = new MyDate03();
		dd.print();
		
		// private 접근제어자는 외부 클ㄹ새의 접근을 허용하지 않기 때문에 
		// 직접 접근 할 수 없다.
		//		System.out.println(d.year); //오류 발생
		
		
	}
}