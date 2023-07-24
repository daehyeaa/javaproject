package p2023_07_21;

import java.util.Random;  // 단축키 ctrl + shift + o

public class RandomEx {
	public static void main(String[] args) {

	// 난수 발생 방법 : 1. Math.random()
	//                      2. Random 클래스
	
	//java.util.Random r1 = new java.util.Random();
		
	Random r = new Random();
	int n1 = r.nextInt(10); // 0 ~ 9
	System.out.println("n1="+ n1);
	
	System.out.println(r.nextInt(45) + 1);  // 1 ~ 45
	
	// 1 ~ 45 사이의 난수 6개 발생
	for(int i = 1; i<=6; i++) {
		System.out.print(r.nextInt(45)+1+"\t");
	}
	System.out.println();
	
	// 0.0 <= Math.random() < 1.0
	int n3 = (int)(Math.random() * 45) +1;	// 1 ~ 45
	System.out.println("n3="+n3);
	
	// 1 ~ 45 사이의 난수 6개 발생
		for(int i = 1; i<=6; i++) {
			System.out.print((int)(Math.random() * 45) +1+"\t");
		}

		 
	//자바 문서 확인해보기
	//Random. // random 클래스같은경우는 생성자를 호출해야 메소드를 사용 할 수 있다. 
	//Math  // Math 클래스 같은경우는 생성자가 정의 되어 있지 않고 메소드가 죄다 정적메소드 여서
	// 생성자를 호출하지 않고 class.method로 사용된다.
	
		
	}

}
