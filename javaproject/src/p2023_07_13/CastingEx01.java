package p2023_07_13;

// p78 서로다른 자료형의 변수를 산술연산을 수행하면 큰 자료형으로 자동 형변환이 된다.
public class CastingEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1+value2+value3;
		//int result2 = value1+value2+value3; // 자동형변환 하는데 long 형이 있기때문에 int 형으로 하면 오류 발생
		int result2 = (int) (value1+value2+value3); // 강제 형변환 해야 한다.
		
		System.out.println(result);
		System.out.println(((Object)result).getClass());
		
		int i = 100;
		double d = 3.14;
		double result1 = i + d;
		System.out.println(result1);
		System.out.println((int)result1);
		
		//1. 같은 자료형의 변수를 산술연산을 수행하면 같은 자료형 처리된다.
		//2. 서로다른 자료형의 변수를 산술연산을 수행하면 큰 자료형으로 자동 형변환이 된다.
		int total = 93;
		double result3 = total / 5 ;			// 자동 형변환 : int -> double
		double result4 = total / 5.0 ;	    
		System.out.println(result3);		// 18.0  int / int 형 이기때문에 소수점 자리 값은 0 이다. 
		System.out.println(result4);		// 18.6  int / double 형 이기때문에 double 형 이므로 소수점 까지 값이 나온다.
	}

}
