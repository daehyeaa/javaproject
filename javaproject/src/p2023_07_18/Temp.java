package p2023_07_18;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char형 변수 ch 가 공백이나 탭이 아닐 때 ture 인 조건식 
//		char ch = 'A';		
//		if(ch != ' ' || ch  != '\t') {
//			System.out.println(true);
//		}else {
//		System.out.println(false);		
//		}
		
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.		
//		for(int i=1; i<=20; i++) {
//			if(i%2 != 0 && i%3!= 0) {
//				System.out.println("2또는 3의배수가 아닌수 "+i);
//			}
//		}
		
		//1 + (1+2) + (1+2+3) + ...... + (1+2+3+4+5+6+7+8+9+10) 의 결과를 구하시오.
//		int temp = 0;
//		int sum = 0;
//		for(int i =1; i<=10; i++) {			
//			sum += i ;
//			temp += sum;			
//		}
//		System.out.println(temp);
		
//		for(int i = 1; i<=10; i++) {
//				int innerSum = 0;
//			for(int j =1; j<=i; j++) {
//				innerSum += j;
//			}
//				 sum += innerSum;
//		}
//		
//		System.out.println(sum);
		
		// 1 + (-2) + 3 + (-4) ... 몇까지 더해야 총합이 100 이상 되는지 구하시오.
		
//		int temp = 0;
//		int i = 1;
//		while (temp < 100) {			
//			if(i % 2 == 0) {			
//				temp += (-i);
//			} else {			
//				temp += i;
//			}			
//			System.out.println("i : "+i);
//			i++;
//			System.out.println("temp : "+temp);
//		}
//		System.out.println("i : "+i);
		
		
/* 다른 사람 풀이 */		
//		int sum = 0;
//		int num = 1;
//
//		while(true){
//			if(num%2 != 0){
//		    	sum += num;
//		    }else{
//		    	sum += num*-1;
//		    }
//		    if(sum>=100){
//		    	System.out.println("num : "+num);
//		        break;
//		    }
//		    num++;
//		}

//		int i =0;
//		while(i<=10) {
//			int j =0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		for(int i = 0; i<=10; i++) {
//			for(int j = 0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

		
	}

}
