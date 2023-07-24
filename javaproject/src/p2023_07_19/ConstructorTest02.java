package p2023_07_19;
/*
* 자바의 접근 제어자
접근제어자  	        자신의클래스  	같은패키지      하위클래스       다른패키지
private 	        O	      	             X	   	            X                X
생략(default)   	O      	       	     O            		X	               X
protected      	O              	     O            		O	               X
public         	    O     	       	         O	    		    O	               O
*/

class MyDate {
	private int year;	// field,멤버변수 private :외부클래스의 접근을 허용하지 않는것을 의미
	private int month;
	private int day;

	public MyDate() {		// 기본  생성자(Default Constructor)
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}
	
	public void print() {	//메소드(method)
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {
		
		// 생성자는 객체를 생성할 때 호출된다.
		MyDate d = new MyDate();	// 생성자 호출		
		d.print();									// 메소드 호출
		
//	System.out.println(d.year);	// 필드의 접근제어자가 private이기 때문에, 외부 클래스에서 접근 할 수 없다.
//	MyDate dd =  new MyDate();
	}
}