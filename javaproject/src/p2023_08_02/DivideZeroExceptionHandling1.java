package p2023_08_02;

// 예외처리
// try ~ catch 구문에서 예외처리 클래스를 잘 모를때는 에외처리 클래스 중에서
// 최상위 클래스인 Exception 클래스로 모든 예외를 받을 수 있다.

public class DivideZeroExceptionHandling1 {
    public static void main( String[] args ) {
    	
	// int type의 변수 선언
 	int b = 20;
	int a = 0;
	int c = 0;

	// 두 수의 나눗셈 결과를 구한다

	try {
		c = b/a;					//예외발생
		int total = a + b;// 발생하면 발생하고 뒤에 있는 코드들은 돌지 않고 바로 catch문으로 넘어간다.
		int sub = b-a;
		
	} catch ( Exception e ) {
		a = 2;
		c = b/a;
		System.out.println("0으로 나눌수 없습니다.");
	}

		System.out.println( c );
    }
}

		