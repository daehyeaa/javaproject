package p2023_07_18;

//p182
public class ArrayEx05 {

	public static void main(String[] args) {

//		int[] yy = null;
//		System.out.println(yy.hashCode()); // 힙영역이 할당 되지 않아 ??
		
		int[] yy = {70,80,90};
		System.out.println(yy.hashCode()); // 힙영역이 할당 되지 않아 ??
		
		int[] scores;
		scores = new int[] {83,90,87};  //new을 써야만 힙영역에 값을 할당할 공간이 나온다.
		
		int sum1 = 0;
		for(int i=0; i<3; i++){
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		//int[] ss = new int[] {83,90,87};  배열을 선언 해준 후		
		int sum2 = add(new int[] {83,90,87});	// 배열 변수로 넣어줘도 된다.
		
		//System.out.println(add(new int [] {80,90,100}));
		System.out.println("총합 : " + sum2);
		System.out.println();
		
	}
	
	// 사용자 정의 메소드 : 합을 구해서 리턴해주는 메소드 
	public static int add(int[] scores) {	// add(매개변수 가 배열도 들어 갈 수 있다. add(int[] scores)
		int sum = 0;
		for(int i =0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
