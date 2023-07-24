package p2023_07_14;

public class While04 {
	public static void main(String[] args) {
		
		// while문을 이용해서 구구단(2~9단) 을 출력하는 프로그램을 작성하세요.
		
		int i =2;
		int j =1;
		
		while(i<10) {
			while(j<10) {
				System.out.println(i+"*" +j+ "=" +i*j );
				j++;
			}
			System.out.println();
			i++; // 단증가
			j=1; // J = 10 인거 1로 다시 초기화			
		}
		
		
	}
}
