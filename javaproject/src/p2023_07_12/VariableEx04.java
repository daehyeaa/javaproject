package p2023_07_12;

// p68
// float형과 double형 차이점
public class VariableEx04 {

	public static void main(String[] args) {
		//float var1 = 3.14;  데이터 뒤에 f를 안붙으면 double 형으로 되기때문에 8byte 임으로 float은 4byte임으로 자료가 크기 때문에 오류가 난다.
		float var1= (float)3.14; // 위에 오류를 안일으키기 위해서는 강제형변환으로 (float)을 데이터 앞에 넣어준다.
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f; 	// 소수점이하 7자리까지 정밀도를 가짐
		double var5 = 0.1234567890123456789; // 소수점이하 15자리까지 정밀도를 가짐 
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		double var6 = 3e6;    // e = 10의 6승
		float var7 = 3e6F;     
		double var8 = 2e-3;  // 10의 -3승
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		
	}
	
}
