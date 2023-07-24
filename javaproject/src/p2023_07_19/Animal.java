package p2023_07_19;

public class Animal {
					// 사용자 정의 클래스
	
	int age; // 필드(field) , 멤버변수, 전역변수 : heap 메모리 영역에 저장
				 // : 메소드 바깥쪽에 정의되는 변수
	static String name = "히히";
	
	public Animal () {  //  기본 생성자(Default Constructor) 
								   // : 매개변수가 없는 생성자를 기본생성자 라고 한다.
		System.out.println("생성자 호출 성공");
	}
	
	public static void main(String[] args) {

		int a = 10;	// 지역변수 : stack 영역에 저장
	
		String str = new String("자바");
		
		Animal         a1         =     new     Animal();
//		클래스     래퍼런스 변수           연산자      생성자  호출 // 생성자가 아니다 생성자를 호출 하라는 의미 이다.
		
		System.out.println(a1.hashCode());
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println(Animal.name.hashCode());
		System.out.println(a1.name.hashCode());		

		String c = Animal.name;
		System.out.println("cc"+c);
		System.out.println(a1.age);	// 0
		a1.age = 5; 
		System.out.println(a1.age);	// 5
		
		Animal a2 = new Animal();	// 생성자가 없으면 컴파일러가 자동으로 생성자를 만들어 준다!?
		System.out.println(a2.age);
		
		if(a1 == a2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
			
		}
	}

}
