package p2023_07_26;

class TestClass2 {
	// 필드의 자료형이 Object 일때 
	private Object member;

	public void setValue(Object value) {		// 자료형이 Object로 되어 있다.
		member = value;
	}

	public Object getValue() {
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass2 obj01 = new TestClass2();
		
		// Object value = new Integer(3); //박싱 + 업캐스팅
		// Object value = 3;	// 자동 박싱 + 업캐스팅
		
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		// 다운 캐스팅 + 언박싱
		int n = ((Integer)(obj01.getValue())).intValue();	// 있으면 언박싱 없으면 자동 언박싱
		System.out.println("n의 값"+n);
		
		// Object value = new Double(3,4); 박싱 + 업캐스팅
		// object value = 3.4    자동박싱 + 업캐스팅		
		obj01.setValue(3.4);		// setValue 로 해서 object 값이 일단 해당 자료형 형태의 값이어야 한다.?
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
		//다운 캐스팅 + 언박싱
		double d1 = ((Double)(obj01.getValue())).doubleValue();	
		//다운 캐스팅 + 자동 언박싱
		double d2 = (Double)obj01.getValue();
		
		System.out.println("d2값 : " + d2);
		
		// Object value = new String("이해할 수 있다.");
		// 오브젝트 클래스는 값을 다 전달 할 수 있다.
		// 변수에 저장하기 위해서는 다운 캐스팅을 해야한다.
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());
		
		//다운 캐스팅  자동언박싱은 되지 않았다.
		String str = (String)obj01.getValue();
		System.out.println(str);
		

	}
}                                                            
