package p2023_07_19;


//p228
class FieldInitValue {
	//필드
	byte byteField;
	short shortField;
	int intField;
	long logField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;						//	null로 초기화
	String referenceField;			//	null로 초기화
												//	null	: 참조할 주소가 없다는 의미
}

public class FieldInitValueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteFied: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("logField: " + fiv.logField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField);
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
		
		
	}

}
