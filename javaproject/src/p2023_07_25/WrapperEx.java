package p2023_07_25;

public class WrapperEx {

	public static void main(String[] args) {

		//int형 변수의 최대값과 최소값
		System.out.println("max="+ Integer.MAX_VALUE);		//max=2147483647
		System.out.println("max="+ Integer.MIN_VALUE);		//max=-2147483648
		
		//String형을 int형으로 형변환 : "20" --> 20
		int n = Integer.parseInt("20");
		System.out.println(n);	// 20 이미 int형으로 형변환 되어 
		System.out.println(n+10); //30 산술연산 가능함  +10을 해도 계산이 된다.
	
		// parseInt() 메소드 안에는 숫자로 형변화이 가능한 문자만 사용해야 된다.
		// java.lang.NumberFormatException 발생
		//int n2 = Integer.parseInt("a"); // 형변환이 안되는 문자가 들어와서 오류가 난다.
		
		// 10진수를 2진수로 변환
		System.out.println("2진수:"+ Integer.toBinaryString(10));	//10 - > 1010(2)
		
		// 10진수를 8진수로 변환
		System.out.println("8진수:"+ Integer.toOctalString(10));	// 10 -> 12(8)
		
		// 10진수를 16진수로 변환
		System.out.println("16진수:"+ Integer.toHexString(10));	// 10 -> a(16)
		
		// Boxing 과 Unboxing에 대하여 알아버괴 
		// jdk1.6 이후에는 자동 박싱 자동 언박싱이 지원돈다.
//		Integer in = new Integer();
//		Integer in2 = new Integer(n);
		
		
	}

}
