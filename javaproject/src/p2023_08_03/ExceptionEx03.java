package p2023_08_03;

public class ExceptionEx03 {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+ result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		
//		1.Exception클래스는 예외 처리 클래스 중에서 최상위 클래스이기 때문에
//		모든 자식클래스의 예외로 받아서 처리 할 수 있다.
//		2. Exception클래스는 예외를 받을때는 가장 마지막 catch구문에서 사용해야한다.
			
		}catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
