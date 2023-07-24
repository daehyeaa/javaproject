package p2023_07_19;

public class Homework06 {

//	구구단(2~9단)의 연산 결과를 2차원 배열에 저장하고,
//    배열에 저장된 결과를 이용해서 구구단을 출력하는 
//    프로그램을 작성하세요?
	public static void main(String[] args) {
		int[][] gugudan = new int[8][9];
		
		for(int i=2 ;  i<10; i++) {	//행
			for(int j =1 ; j<10; j++) {	//열
				gugudan[i-2][j-1] = i*j;
			}
		}
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(gugudan[i][j]+"\t");
			}
			System.out.println();
		}		
	}
}
