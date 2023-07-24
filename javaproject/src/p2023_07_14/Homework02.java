package p2023_07_14;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 키보드로 정수 3개를 입력 받았을때, 최대값과 최소값을 구하는 프로그램을 작성하시오
		// 단, if else 구문으로작성하세요
		
		System.out.println("정수 3개를 입력하세요.");
		int max = 0, min = 0;
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1>= n2 && n1>= n3) {
			max = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			max = n2;
		} else  {
			max = n3;
		}	
		
		System.out.println("최대값은"+max);
		
		if(n1<= n2 && n1<= n3) {
			min = n1;
		} else if (n2 <= n1 && n2 <= n3) {
			min = n2;
		} else  {
			min = n3;
		}		
		
		System.out.println("최소값은"+min);
		
		//2. 구구단(2~9단)을 가로방향으로 출력하는 프로그램을 작성하시오.		
		
		for(int i = 2; i<=9; i++) {
			System.out.print("["+i+"단]"+"\t"+"\t");
		}
		System.out.println();
		for(int i= 1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan+"*"+i+"="+(i * dan)+"\t");				
			}
			System.out.println();
		}
		
		
			
		
	}

}
