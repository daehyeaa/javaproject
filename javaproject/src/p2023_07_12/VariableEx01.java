package p2023_07_12;

public class VariableEx01 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" +  x + ", y:" + y);
		
		int temp = x;  // 3
		x =  y ;            // x = 5
		y = temp;       // y = 3
		System.out.println("x:" +  x + ", y:" + y);
	}

}
