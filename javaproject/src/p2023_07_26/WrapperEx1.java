package p2023_07_26;

public class WrapperEx1 {

	public static void main(String[] args) {

		//Integer 클래스는 기본생성자를 지원하지 않습니다.
		//기본생성자로 Integer 객체를 생성하면 오류가 발생한다.
		//Integer num = new Integer(); // 오류발생
		
		//박싱(boxing) : heap 메모리를 박스로 생각하고, stack메모리에 저장된
		//                      10을 heap메모리에 복사 하는것 (박스에 집어 넣는다) 
		int n = 10;	//지역변수 메모리는 스택영역
		Integer num01 = new Integer(n); // 박싱(boxing) 힙영역
		// 변수 num01 의 주소값이 스택영역에 생기며 num01 실제 값은 힙메모리 영역에 생겨난다.
		System.out.println(num01.hashCode());
		System.out.println(num01.intValue());
		System.out.println(num01.byteValue());
		System.out.println(num01);
		
		int identityHashCode = System.identityHashCode(num01);
		System.out.println(		
		"객체의 주소값(실제 메모리 주소): " + identityHashCode);
		
		// 언박싱(unboxing) heap 메모리(박스)에 있는 데이터를 stack 메모리로 가져오는것
		int n01 = num01.intValue(); // 언박싱
		System.out.println(n01);
		
		String s = "20";
		Integer num02 = new Integer(s); // 박싱
		
		int n02 = num02.intValue();
		
		System.out.println(num02.hashCode());
		System.out.println(num02.intValue());
		System.out.println(num02);
		System.out.println(n02);
		
		System.out.println(s.hashCode());
		String d = new String("sss");
		System.out.println(d);
		System.out.println(num01);
		System.out.println(num01.hashCode());
		System.out.println(d.hashCode());
	}

}
 