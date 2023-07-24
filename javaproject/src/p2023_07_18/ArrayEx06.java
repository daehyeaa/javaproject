package p2023_07_18;

// p198
public class ArrayEx06 {

	public static void main(String[] args) {
		
		int[] scores = {95,71,84,93,87};
		
		
		// 향상된 for문 , 확장 for문
		// 형식 : for( 변수 : 순차적인 자료구조(배열,컬력션)) {
		//				실행될 문자;
		//			}		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 =" + avg);
				
		
	}

}
