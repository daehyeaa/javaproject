package p;

import  packTest.packOne.AccessTest;

//* 자바의 접근 제어자
//
//접근제어자          자신의클래스        같은패키지       다른패키지    	     하위클래스         하위클래스
//                                                          	   	   (같은패키지)        (다른패키지)
//private 		           O	                   X	      	         X	                   X                   X
//생략(default)   	   O	                   O       		     X                    O                  X
//protected      	       O	                   O		             X                    O                  O
//public                  O	                   O		             O                    O                  O
//
//같은패키지에 있으면 private면 자식이라도 접근이 불가능하다
//그외에는 자식이 부모에게 접근이 가능하다.
//
//다른패키지 일때  (상속관계)부모와 자식이 서로 다른 패키지에 있더라도 protected , public 으로 접근이 가능하다. 
//상속관계가 아니면 protected는 접근이 불가능 하다.
//
//1. 상속 관계가 있는 경우에
//   2개의 클래스(부모,자식 클래스)가 같은 패키지 않에 들어 있을때는 
//   부모의 접근제어자가 default, protected, public 접근제어자인 경우에
//   자식클래스에서 접근 할수 있다. (단, private접근 제어자만 자식
//   클래스에서 접근 할 수 없음)
//
//
//2. 상속 관계가 있는 경우에
//   2개의 클래스(부모,자식 클래스)가 다른 패키지 않에 들어 있을때는
//   부모의 접근제어자가  protected, public 접근제어자인 경우에
//   자식클래스에서 접근 할수 있다. 
//
//
//3. 상속 관계가 없는 경우에
//   2개의 클래스가 서로 다른 패키지 않에 들어 있을때는 public 
//   접근제어자로 되어 있어야만 다른 클래스에서 접근 할 수 있다.


//AccessTest의 서브 클래스로 SubOne을 설계
class SubOne extends AccessTest {
	void subPrn() {
		//System.out.println(a); // [1. Sub] private -X
		//System.out.println(b); // [2. Sub] 기본 접근 지정자-X
		System.out.println(c); // [3. Sub] protected -O
		System.out.println(d); // [4. Sub] public -0
	}
}

//AccessTest랑 상속관계가 없는 클래스 
class SuperSubA {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.print();
		System.out.println("main");
		//System.out.println(at.a); // [1. main] private -X
		//System.out.println(at.b); // [2. main] 기본 접근 지정자-X
		//System.out.println(at.c); // [3. main] protected -X
		System.out.println(at.d); // [4. main] public -O
	}
}