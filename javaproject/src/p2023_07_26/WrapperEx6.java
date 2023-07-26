package p2023_07_26;

//p498
// 숫자 데이터를 문자열로 변환 : 20 -> "20"
public class WrapperEx6 {

	public static void main(String[] args) {
		
		// valueOf 메소드는 정적메소드로 클래스.메소드로 사용 할 수 있다.
		String st1 = String.valueOf(10);		// 숫자를 문자열로
		String st2 = String.valueOf(10.5);
		String st3 = String.valueOf(true);
		
		Integer it = new Integer(30);
		String str4 = it.toString();	// toString은 객체생성된 변수를 통해서 사용되어야한다.
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(str4);
	}

}