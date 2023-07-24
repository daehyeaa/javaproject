package p2023_07_24;

// substring() : 전체 문자열에서 특정 범위의 문자를 추출하는 역할
// substring(int beginIndex) : beginIndex 번호 부터 끝까지 문자를 추출. 
// substring(int beginIndex, int endInedx) : beginIndex 번호 부터 끝까지 문자를 추출. 
// : beginIndex 번호 부터 endIndex -1 번 까지 문자를 추출. 
public class SubStringTest {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

		// 인덱스번호 13번 부터 끝까지 문자를 추출     substring("번호") 번호 부터 끝까지 값을 출력해라
		String str1 = message.substring(13);
		System.out.println(str1);

		// 인덱스번호 13번 부터 15번까지 문자를 추출    substring("1","2") 1번 번호 인덱스 부터 2번번호 인덱스 번호에서 -1 한 자리까지 값을 출력해라
		String str2 = message.substring(13, 16);
		System.out.println(str2);
	}
}
