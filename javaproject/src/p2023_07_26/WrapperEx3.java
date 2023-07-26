package p2023_07_26;

// Double 클래스
public class WrapperEx3 {
	public static void main(String[] args) {
		
		//기본생성자를 지원하지 않습니다.
		//Double d = new Double(); // 오류발생
		
		Double d1 = new Double(3.14);		// 박싱
		Double d11 = 3.14;		// 자동박싱
		
		int identityHashCode = System.identityHashCode(d1);
		System.out.println(		
		"Double 객체의 주소값(실제 메모리 주소): " + identityHashCode);
		
		int identityHashCode1 = System.identityHashCode(d11);
		System.out.println(		
		"Double 객체의 주소값(실제 메모리 주소): " + identityHashCode1);
		if(d1 == d11) {
			System.out.println("gg");
		}else {
			System.err.println("Ff");
		}
		System.out.println(d1);
		System.out.println(d11);
		System.out.println(d1.hashCode());
		System.out.println(d11.hashCode());
		
		double d2 = d1.doubleValue(); //언박싱
		double d22 = d1;						   //자동 언박싱
		
		// 1. 자료형 변환 : "42.195" --> 42.195 
		Double d3 = new Double("42.195"); // 박싱
		// 문자 데이터의 경우에는 자동 박싱이 되지 않는다. 
		//Double d33 = "42.195"; //오류발생 
		
		double n2 = d3.doubleValue(); // 언박싱
		double n22 =d3;						   // 자동 언박싱ㄴ
		
		// 2. 자료형 변환 : "42.195" --> 42.195
		// Integer.parseInt("String") 처럼 스트링을 더블형으로 바꿔주는 메소드
		double num = Double.parseDouble("42.195"); 
		System.out.println(num);
	}
}
