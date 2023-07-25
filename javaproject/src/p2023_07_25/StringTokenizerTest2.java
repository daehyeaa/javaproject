package p2023_07_25;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
	
		String source1="한국 미국 태국 중국 이란";
		
		StringTokenizer st1=new StringTokenizer(source1," ");
		// boolean hasMoreTokens() : 가져올 토큰이 있으면 true 리턴
		//                                               가져올 토큰이 없으면 false 리턴
		int count = 1;
		while(st1.hasMoreTokens()){
			System.out.println(count++);
			System.out.println("st1.token:"+st1.nextToken());
			System.out.println("가져올토큰있음"+st1.hasMoreTokens());
		}
		
		System.out.println();
		System.out.println();
		
		String source2="푸들,삽살개,풍산개,진돗개";
		StringTokenizer st2=new StringTokenizer(source2,",");
		while(st2.hasMoreTokens()){
			System.out.println("st2.token:"+st2.nextToken());
		}
		
		System.out.println();
		System.out.println();		
		
		// 새성자 3번째 자리에 true가 사용되며 구분기호(,)도 토큰으로 처리해준다.
		StringTokenizer st3=new StringTokenizer(source2,",",true);
		while(st3.hasMoreTokens()){
			System.out.println("st3.token:"+st3.nextToken());
		}
		
		
		
		
	}

}
