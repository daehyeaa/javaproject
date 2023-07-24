package p2023_07_14;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random() 은 double형으로 반환하는 타입임으로 강제형변환 (int) 을 해줘야 하면 
		// Math.random() 메소드는  0 이상 1 미만의 부동 소수점 숫자를 무작위로 생성) 난수를 생성하는 메소드 입니다.
		// Math.randon() * 6 을 하면 0 이상 6 이하의 숫자가 나온다 . 거기에  +1을 해줘서 0이 안나오게 합니다.
		
		// 난수 발생공식
		// 난수 = (정수화)(Math.randon() * (상한값-하한값+1) ) + 하한값;
		
		// 난수 발생 : 0.0 <= Math.randon() < 1.0
		//Math m = new Math(); // 오류 발생 Math 클래스는 따로 생성자가 없기때문에 오류가 난다.
		// 정적필드, 정적메소드는 객체를 따로 생성할수 없기때문에 class.필드 , class.메소드로 접근해야 한다.
		System.out.println("E="+Math.E);		//자연로그 class.정적필드
		System.out.println("PI="+Math.PI);		//원주율
		System.out.println(Math.random());		//난수발생
		
		int num = (int) (Math.random() * 6 ) +1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if ( num == 2 ) {
			System.out.println("2번이 나왔습니다.");
		} else if ( num == 3 ) {
			System.out.println("3번이 나왔습니다.");
		} else if ( num == 4 ) {
			System.out.println("4번이 나왔습니다.");
		} else if ( num == 5 ) {
			System.out.println("5번이 나왔습니다.");
		} else  {
			System.out.println("6번이 나왔습니다.");
		}
		
		System.out.println("1~45사이의 난수 발생");
		System.out.println( (int)(Math.random()*45)+1);
		
	}

}
