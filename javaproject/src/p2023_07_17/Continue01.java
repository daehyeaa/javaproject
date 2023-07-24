package p2023_07_17;

public class Continue01 {

	public static void main(String[] args) {
		
		//continue문
		//	1.반복문 안에서 사용되며, 다시 반복문으로 돌아가라는 의미를 가지고 있다.
		//  2.continue문이 실행되면, continue문 아랫쪽의 내용들은 실행되지 않고 다시 반복문으로돌아가게 된다.
 
		for(int i =1; i<= 10; i++) {
			
			if(i==5) continue;	// continue문을 만나면 반목문으로 돌아가기 때문에 출력 5가 출력이 안된다.
			System.out.println("출력:"+i); // 출력:5가 출력안된다.
		}
		
	}

}
