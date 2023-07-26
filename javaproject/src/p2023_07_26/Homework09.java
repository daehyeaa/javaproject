package p2023_07_26;

import java.util.Arrays;

// 1 ~ 45 사이의 숫자를 6개 추출 하는 프로그램을 작성하세요
// 중복된 숫자는 1번만 출력되도록 한다.
// Math.random() 을 이용해서 프로그램을 작성하세요.

public class Homework09 {
	public static void main(String[] args) {
		// 배열 선언
		int arr[] = new int[6];
		for(int i =0; i<arr.length; i++) {
			arr[i] = ((int)(Math.random() *45))+ 1;
				for(int j = 0; j<i; j++) 
					if(arr[i] == arr[j]) 	i--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
