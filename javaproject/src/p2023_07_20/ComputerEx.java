package p2023_07_20;
//p.253
class Computer{
	// 주소값 전달에 의한 메소드 호출방식(Call by Reference 방식)
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// vargus : 전달된 값은 배열로 받는다.
	int sum2(int ...values ) {	// ... 3개만 입력해야한다.
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}

public class ComputerEx {
	public static void main(String[] args) {

		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);
		
	}

}


