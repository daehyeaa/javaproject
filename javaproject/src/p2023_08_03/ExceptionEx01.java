package p2023_08_03;

// p456
// 예외처리

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];	//args[0] = "10';
			data2 = args[1];  //args[1] = "20";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
//			return;	
		}
		//return구분으로 main()메소드를 빠져 나가기 때문에 아랫쪽의 내용이 실행도지 않는다.
		try {
			int value1 = Integer.parseInt(data1); // 예외발생*//
			int value2 = Integer.parseInt(data2);
			int result =value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			//finally 안에 들어있는 내용은 예외가 발생하든 하지 않던 실행된다.`
		}finally {
			System.out.println("다시 실행하세요.");
		}
		
	}

}
