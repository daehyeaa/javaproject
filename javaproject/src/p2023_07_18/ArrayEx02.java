package p2023_07_18;


// p180
public class ArrayEx02 {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i =0; i<3; i++) {
			sum += scores[i];			//총점:590
		}
		System.out.println("총합 : "+ sum);
		double avg = sum / 3.0;		//강제 형변환
		System.out.println("평균" + avg);	//평균:86.66666666666667
		
		// 평균값을 소숫점 2째자리까지 출력 하세요.
		System.out.printf("%.2f", avg);
		
	}

}
