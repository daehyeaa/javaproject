package p2023_07_14;

public class While02 {

	public static void main(String[] args) {

		//while 문을 이용해서 1~100 까지 홀수, 짝수의 합을 구하는 프로그램을 작성 하세요.
		//단, while문 1개와 if ~ else 문으로 작성 하세요.
		
		int odd =0 , even = 0;
		int i = 1;
		
		while(i<=100) {
			if(!(i%2 == 0)) { // 홀수
				odd += i;
			} else {
				even += i; // 짝수				
			}
			i++;
		}		
		System.out.println(odd);
		System.out.println(even);
		
	}

}
