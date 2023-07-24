package p2023_07_18;

import java.util.Arrays;

// p195
public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] oldArray = {10,20,30};			//원본 배열
		int [] newArray = new int[5];		//새로운 배열
		
		
//		for(int i : oldArray) {
//			newArray[i] = oldArray[i];
//		}
			
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];			//배열 복사
		}
		
		//System.out.println(Arrays.toString(newArray));
		
//		for(int i : oldArray) {
//			System.out.println(oldArray[i]);
//		}
		
		// 복사된 배열 출력
		for(int i: newArray) {
			System.out.println(i+"\t");
		}
		
		
	}

}
