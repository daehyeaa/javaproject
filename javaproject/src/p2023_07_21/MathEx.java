package p2023_07_21;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스
		// Math 클래스 = 정적 필드 + 정적 메소드
		
		//Math 클래스는 생성자가 제공되지 않기 때문에, Math클래스 직접 객체를 생성할 수 없다.
		//Math m = new Math();	// 오류 the constructor Math() is not visible
		
		System.out.println("E="+ Math.E);  // 오일러 상수
		System.out.println("PI="+ Math.PI);  // 원주율
		
		System.out.println("abs() ="+Math.abs(-10));	//절대값:10
		System.out.println("ceil() ="+Math.ceil(Math.PI));	//올림기능 : 4.0
		System.out.println("round() ="+Math.round(10.5));	//반올림기능 : 11
		System.out.println("floor() ="+Math.floor(10.5));	//내림기능 : 10.0
		System.out.println("max() ="+Math.max(10,20));	//최대값 : 20
		System.out.println("min() ="+Math.min(10,20));	//최소값 : 10
		System.out.println("pow() ="+Math.pow(2,3));	// 2의 3승 : 8
		
		// 0.0  <= Math.random() < 1.0
		System.out.println("random() =" +Math.random()); // 난수 발생
		System.out.println("random() ="+(int)((Math.random()*6) + 1));	// 난수 발생 : 1 ~ 6
		
		int d = (int)(Math.random() * 6) + 1 ;	// 난수발생 : 1~6
		System.out.println("주사위 번호:"+d);
		
		int r = (int)(Math.random() * 45) + 1 ;	// 난수발생 : 1~45
		System.out.println("주사위 번호:"+r);
		
		System.out.println("sqrt() =" + Math.sqrt(5)); // 제곱근 : 2.2360
		System.out.println("sqrt() =" + Math.sqrt(9)); // 제곱근 : 3.0
		
		/* 로또 번호 출력 */
		int[] lotto = new int[6]; // 크기 6의 배열선언
		
//		int l = (int)(Math.random() * 45) + 1; 
//		lotto[0] = l;
		System.out.println("123");
		if(lotto.equals(0) ) {
			System.out.println("Null");
		}
		System.out.println("456");
		
		for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random() * 45) + 1;
				for(int j=0; j<i; j++) {
					
				}
				
		}
		
		
		
	}

}
