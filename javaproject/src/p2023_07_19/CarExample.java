package p2023_07_19;

// p227
// 메인메소드가 있는 클래스명이 파일명과 일치해야한다.
// 한파일 안에 메인메소드가 없는 클래스는 파일명과 이름이 달라도 된다.


public class CarExample {
	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car();

		System.out.println("제작회사 : " + myCar.company);	  // 현대자동차
		System.out.println("모델명 : " + myCar.model);        //  그랜져
		System.out.println("색깔 : " + myCar.color);          //  검정
		System.out.println("최고속도 : " + myCar.maxSpeed);   //  350
		System.out.println("현재속도 : " + myCar.speed);      //  0
		
		myCar.speed = 60;
		
		System.out.println("수정된속도 : " + myCar.speed); //  60
		 
	}

}

/*  public : public을 쓰면 오류가 난다. default 접근제어자로 클래스를 생성해야한다. */
/* public */ class Car{
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;	// 0으로 초기값이 설정된다. 메인메소드에서 객체가 new연산로 생성될때 0으로 초기화 된다.
	
	
}

