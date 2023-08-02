package p2023_08_02;


// 예외처리
// 1. try ~ catch 구문으로 예외처리
// try{
//			예외가 발생할 가능성이 있는 문장;
//		}catch(예외클래스명 매개변수){
//				예외 메세지;
//		}
// 2. 예외가 발생하면, 예외가 발생한 라인 아랫쪽의 내용은 실행되지 않고,
//     catch 구문에서 에외를 받아서 예외처리를 한다.

public class DivideZeroExceptionHandling {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		// 두 수의 나눗셈 결과를 구한다

		try {
			c = b / a;
			int total = a + b;
			int sub = b - a;

			//ArithmeticException : 숫자를 0으로 나눌때 발생되는 예외
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나누어 오류가났씁니다.");
			a = 2;
			c = b/a;
		} finally {
			System.out.println(c);
		}
	}
}
