package p2023_07_12;

// java.lang패키지 안에 들어있는 클래스는 import를 생략할 수 있다.
import java.util.Date;
import java.util.Random;

public class Test { // 파일명과 class 이름이 일치해야한다.
// public : 접근지정자 or 접근제어자 메인메소드의 public은 없으면 안되고 사용자정의 클래스의 public은 지워도 실행된다. 
// Test : 사용자 정의 클래스 (사용자가 만든 클래스 명)

	int a = 1; //멤버변수-인스턴스변수
	int b;       //멤버변수-인스턴스변수
	static String st = "i'm a static variable"; //멤버변수-클래스 변수 (static 붙여진거는 클래스 변수 이다.)
	
// main() 메소드는 자바가상머신(JVM : java.exe) 이 가장 먼저 호출하는 메소드 이다.
// 1개의 클래스가 독립적으로 실행되기 위해서는 반드시 main메소드가 필요하다.
	public       static               void main(String[] args) {
//  접근제어자     공유(정적메소드) 	        main메소드 
// 한개의 클래가 독립적으로 실행하기위해서는 한개의 main 메소드가 있어야한다.
		
		System.out.println("java출력 성공");
		System.out.println("오라클");
		System.out.println("파이썬");
		
		
		Date d = new Date();
		System.out.println(d);
		
		Random r = new Random();
		System.out.println(r.nextInt(10)); // 0 ~ 9 난수 발생
		
		
	
		
		
	}

 } 
