package p2023_07_17;

public class Continue03 {

	public static void main(String[] args) {

	// continue문을 이용해서 1 ~ 100 까지 정수 중에서 5의 배수만 출력하는 프로그램 작성
	
	for(int i =1; i<=100; i++) {
		
		if(i%5 != 0) continue;
			System.out.println("5의배수"+i);
		
	}
	
		
		
		
	}

}
