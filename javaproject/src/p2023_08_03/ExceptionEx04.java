package p2023_08_03;


//462
// 예외처리 떠넘기기
public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			findClass();			
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	// 정적 메소드
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.string2");
		
	}
}
