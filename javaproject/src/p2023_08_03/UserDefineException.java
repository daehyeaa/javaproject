package p2023_08_03;

// 사용자 정의 예외처리는 
// 보통 기본생성자와 매개변수를 하나 받은 생성자로 보통 만든다.

public class UserDefineException extends Exception {
						// 사용자 정의 예외처리 클래스
    // 기본 생성자
    public UserDefineException() {
    	System.out.println("기본생성자 오류");
    }

    // 인수를 하나 받아들이는 생성자
    public UserDefineException( String information ) {
		// Exception 클래스의 생성자 호출
		super( information ); // 부모클래스(Exception클래스) 의 매개변수가 있는 생성자를 호출 하라는 뜻
    }
}
