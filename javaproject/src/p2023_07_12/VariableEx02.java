package p2023_07_12;

public class VariableEx02 {

	static int b =3; // VariableEx02의 클래스 변수 b
	int b2 = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Test.st); // 클래스 변수는 객체 생성없이 사용가능 
		String st = "new variable"; // 지역변수
		System.out.println(st);
		//System.out.println(Test.a);  // 오류 발생 a는 클래스 변가 아니므로 객체를 생성해야 사용 할 수 있다.
		
		Test exercise = new Test();
		System.out.println(exercise.a); // 객체를 생성하고 a의 값을 가져옴
		exercise.a = 10;  // a의 값을 바꾸면		
		System.out.println(exercise.a); // a =10 으로 변경 된다.
		System.out.println(b); // VariableEx02 클래스에 있는 클래스 변수
		//System.out.println(b2); // 오류발생 VariableEx02 파일안에 있어도 클래스에 선언되면 클래스변수(static이 붙은변수) 가 아니면 객체를 생성하여야한다.		
		System.out.println(exercise.b);
		
		// if문 안에서 정의된 지역변수 v2는 if문 안에서만 사용할 수 있다.
		
//		int v1 =15;
//		int v2 = 0;
//		if(v1>10) {
//			// 블럭문 
//			int v4; 		// v4 : 지역변수  if문 안에서 지역변수를 선언하면 if안에서만 사용이 가능하다.
//			
//			v2 = v1 - 10;
//		}		
//		int v3 = v1 + v2 + 5;
//		
//		System.out.println(v1);
//		System.out.println(v2);
//		System.out.println(v3);
	}

}
