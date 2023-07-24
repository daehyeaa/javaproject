package p2023_07_17;

//  p157
public class Break03 {
	public static void main(String[] args) {
		
		int i=1;
		
		while(true) {
			int num = (int) (Math.random() * 6 ) + 1;  // 난수 1 ~ 6 발생
						
			System.out.println(num);
			
			if(num == 6) { // 난수가 6이 나올 경우
				break;		//무한 루프를 빠져나옴
			}			
			i++;
		}
		System.out.println("프로그램 종료");
		System.out.println("루프횟수"+i);
	}
}
