package p2023_07_17;

public class DoWhile01 {

	public static void main(String[] args) {
//		do ~ while 문
//		do {
//				반복 실행될 문장;
//		}while(조건식);

		// do ~ while문으로 '사랑해요' 메세지를 10번 출력하는 프로그램을 작성하세요.
		
		// do ~ while문은 조건식이 거짓인 경우에도 최소1번은 실행된다.
		
		int i =11;			//초기값
		do {
			System.out.println(i+" 사랑해요.");
			i++;				//증감식
		}while(i<=10);	//조건식
		
		
	}

}
