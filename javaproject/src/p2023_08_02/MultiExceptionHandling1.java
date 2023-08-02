package p2023_08_02;

//try ~ catch ~ finally 형식
//1. finally 안에 들어있는 내용은 예외가 발생하든, 발생하지 않아도 무조건 실행된다.
//2. finally 안에 들어가는 내용은 주로 파일을 닫거나, 데이터베이스 연결을 끊는 내용이 주로 사용된다.
//    ex) file.close(), con.close()
public class MultiExceptionHandling1 {
    public static void main( String[] args ) {
		
	int value = 20;
	int div = 0;

	int[] intArray = { 1, 2, 3 };

	try {
	    // 두수의 나눗셈을 구함
//	    int result = value / div;		// 예외발생: ArithmeticException
//	    System.out.println( result );

	    // 배열의 특정 값을 저장
            int arrayValue = intArray[2];	// 예외발생 ArrayIndexOutOfBoundsException
			System.out.println( arrayValue );

	    } catch ( ArithmeticException ae ) {		// 0으로 나눌때 발생되는 예외
			System.out.println( ae.toString() );
			System.out.println("0으로 나눌수 없습니다.");
	    } catch ( ArrayIndexOutOfBoundsException ai ) {	// 배열의 범위를 벗어난 값을 사용할때 발생하는 예외
			ai.printStackTrace();
			System.out.println("배열의 범위를 벗어 났습니다.");
	    } finally {
	    	System.out.println("예외가 발생했음!");

	    }	 
    }    
}



