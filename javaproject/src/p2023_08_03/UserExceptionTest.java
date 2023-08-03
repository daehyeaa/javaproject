package p2023_08_03;

public class UserExceptionTest {

	// Exception을 호출한 메소드로 던짐
	public void printNumber() throws UserDefineException {
		for (int i = 0; i < 10; i++) {
			// Excpetion을 발생시킴
			if (i == 5)
				throw new UserDefineException("사1용1자가 정의한 Exception입니다");
				//throw new UserDefineException();
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();

		try {
			uet.printNumber();
		} catch (UserDefineException ue) {
			System.out.println("ㅎㅎ" + ue.toString());
			// ㅎㅎp2023_08_03.UserDefineException: 사1용1자가 정의한 Exception입니다
			// ㅎㅎp2023_08_03.UserDefineException: -> ue.toString()
			// 사1용1자가 정의한 Exception입니다 -> UserDefineException
		}
	}
}
