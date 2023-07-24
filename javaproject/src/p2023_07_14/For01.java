package p2023_07_14;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문
//		 for(초기값; 조건식; 증감식) {
//				반복 실행할 문장	
//		}		
		//사랑해요 메세지를 10번 출력 하세요		
		// 실행될 문장이 1줄인 경우에는 중괄호({}) 를 생략 할 수 있다.		
		//                    i< 11   i++ , ++i, i=i+1,  i+ = 1
		for(int i = 1; i< 11; i+=2) {
			System.out.println(i+"."+"사랑해요.");
		}
		System.out.println("종료");		
	}

}
