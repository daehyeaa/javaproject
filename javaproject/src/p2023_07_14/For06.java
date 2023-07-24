package p2023_07_14;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단(2~9단)을 출력하는 프로그램을 작성 하세요.
		
		for(int i=2; i<10; i++) {			
			System.out.println("["+i+"단]");
			for(int j =1; j<10; j++) {
				System.out.println(i+"X"+j+"="+i*j);				
			}
			System.out.println();
		}
		
	}

}
