package p2023_07_14;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 ~ 100 까지 홀수, 짝수의 합을 구하는 프로그램을 작성하세요
		int odd = 0;
		int even = 0;
		
		// 홀수의 합
		for(int i =1; i<=100; i=i+2) {
			odd += i;							// odd = odd + i
		}
		
		// 짝수의 합
		for(int i =0; i<=100; i=i+2) {
			even += i;						// even = even + i
		}
		
		System.out.println("1~100 홀수의 합:"+ odd);
		System.out.println("1~100 짝수의 합:"+ even);
		
		int odd1 = 0;
		int even1 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				even1 += i;
			}else {
				odd1 += i;
			}
		}
		
		System.out.println(odd1);
		System.out.println(even1);
		
	}

}
