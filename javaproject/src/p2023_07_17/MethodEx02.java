package p2023_07_17;

public class MethodEx02 {

	static void sum(int n) {
		int hap = 0;
		for(int i =1; i<=n; i++) {
			hap += i;
		}
		
		System.out.println("i~"+n+"="+hap);
	}
	
	public static void main(String[] args) {

		sum(3);
		MethodEx02.sum(5);
		sum(10);
		sum(30);
		sum(100);
		sum(1000);
		sum(10000);
		
		
		
	}

}
