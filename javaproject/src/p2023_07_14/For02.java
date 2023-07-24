package p2023_07_14;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;   // 지역변수(local variable) 지역변수는 자동으로 초기화가 안된다.
		
		for(int i=1; i<=10; i++) {
			sum += i;		// sum =  sum + i;
//                                   1	   =     0   +  1		
//                                   3    =     1   +  2
//                                   6    =     3   +  3
//								   10    =     6   +  4
			System.out.println("1~"+i+"="+ sum);
		}
		//System.out.println(i);  오류발생 i는 반복문 안의 지역변수 이기 때문이다. 
		System.out.println("sum="+sum);
	}

}
