package p2023_07_18;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
	
		//      1.키보드를 이용해서 정수 5개를 입력 받은후 int형
        //		배열에 저장한다. 이때 배열에 저장된 값중에서
        //		최대값과 최소값을 구하는 프로그램을 작성하세요?

		
		System.out.println("정수 5개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int min, max;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		min = a[0];
		max = a[0];
		
		for(int i = 1; i<a.length; i++) {
			if(a[i] <= min) min = a[i];
			if(a[i] >= max) max = a[i];
		}
		
		System.out.println("max의 값 : " +max);
		System.out.println("min의 값 : " +min);

	}

}
