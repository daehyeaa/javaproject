package p2023_07_26;

//p500
public class WrapperEx2 {

	public static void main(String[] args) {

		//박싱(boxing)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer("300");
		
		// 언박싱(unboxing)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();	// 자료형 변환 : "200" -> 200
		int value3 = obj3.intValue(); // 자료형 변환 : "300" -> 300
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// 자동 박싱 자동 언박싱 : JDK 1.6부터 지원
		
		// 자동 박싱
		Integer ob = new Integer(100); // 박싱
		Integer objj = 100;	//자동 박싱
		
		System.out.println("언박싱"+ objj.intValue());
		System.out.println("자동 언박싱:" + objj);
		
		// 언박싱
		int value11 = objj.intValue();
		
		// 자동 언박싱
		int value22 =objj;
		
		// 자동 언방식
		int result = objj + 100;
		System.out.println("result"+ result);
		
		//Integer obj10 = new Integer(20);
		//int value5 = obj10;	// obj10.intValue();
		
		
	}

}
