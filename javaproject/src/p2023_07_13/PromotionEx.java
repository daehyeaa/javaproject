package p2023_07_13;

public class PromotionEx {
	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;  // 자동 형변환
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;  // 자동 형변환   유니코드 전세계의 문자를 숫자로 표현 한거
		System.out.println("가의 유니코드: " + intValue);
		
		// 유니코드는 세계 각국의 문자를 2Byte로 표현 할 수 있는 숫자 (0 ~ 65535) 로 매핑한 국제 규약
		// 영문자는 아스키 그외 문자는 유니코드로 
		
		intValue = 50;
		long longValue = intValue;  // 자동형변환
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 자동형변환
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;  // 자동형변환
		System.out.println("doubleValue: " + doubleValue);
	}
	
}
