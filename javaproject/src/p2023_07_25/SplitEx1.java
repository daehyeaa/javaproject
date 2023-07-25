package p2023_07_25;

import java.util.Arrays;

public class SplitEx1 {

	public static void main(String[] args) {
		
		//String[] split(String regex) 정규식

		String text = "홍길동&홍길순,김길동,김자바-안화수";
		
		String[] names = text.split("&|,|-");  // 구분할기호 "|(하이픈) 다음 구분할기호 |"
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println();
		for(String s : names) {
			System.out.print(s+"\t");
		}
		
	}

}
