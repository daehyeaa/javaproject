package p2023_07_14;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 ~ 100 까지 홀수, 짝수의 합을 구하는 프로그램을 작성하세요
		
		int odd = 0 , even = 0;
		
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		
		System.out.println("홀수의값"+odd);
		System.out.println("짝수의값"+even);
		
	}

}
