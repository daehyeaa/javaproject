package p2023_07_21;

public class Calling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Called called = new Called();

		//private은 안되고 public or default 접근 제어자는 접근이 된다.  
		// import를 따로 하지 않아도 된다.
		called.check();	// called.java 파일에 check메소드의 접근제어자가 private이면 접근이 불가능하다.
	}

}
// 자바의 접근 제어자
//접근제어자			자신의클래스	같은패키지		하위클래스		다른패키지
// private				  0                 x                   x                 x
// default(생략)         0                0                   x                  x   
// protected            0                  0                 0                   x
// public                  0                 0                  0                   0

//같은패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어자가 public 이나 default 접근 제어자로 되어 있어야한다.
//같은 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 import 를 하지 않아도 된다.


