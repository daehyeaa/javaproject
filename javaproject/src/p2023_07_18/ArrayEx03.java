package p2023_07_18;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {

		// 키보드로 5과목의 점수를 입력 받아서, 총점과 평균을 구하는 프로그램을 작성하세요.
		
		System.out.println("5과목 점수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum =0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();			
			sum += score[i];
		}
		
		System.out.println("총합"+sum);
		double avg = (double) sum / score.length ;
		System.out.println("평균"+avg);
		System.out.printf("%.2f", avg);		
		
	}

}
