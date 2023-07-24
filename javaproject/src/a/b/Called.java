package a.b;

//다른 패키지 안에 들어 있는 클래스
// src - a - b - Called.java : check()메소드
//       - c      - Calling.java   

//1) 다른 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어자가 public 접근 제어자로 되어 있어야 한다.
//2) 다른 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 해당 클래스를 import를 해야한다.

public class Called {
	public void check() {
		System.out.println("패키지 a.b 의 Called.java 파일의 메소드 호출 성공");
	}
}
