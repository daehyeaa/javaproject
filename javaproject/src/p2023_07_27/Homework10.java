package p2023_07_27;

import java.text.DecimalFormat;

public class Homework10 {

	public String circumFerence(int n) {
		double circumference = 2 * Math.PI * n;
		DecimalFormat form = new DecimalFormat("#.##");
		String dVal = form.format(circumference);
		return dVal;
	}	
	public String rawArea(int n) {
		double rawarea =  Math.PI  * n * n;
		DecimalFormat form = new DecimalFormat("#.##");
		String dVal = form.format(rawarea);
		return dVal;
	}	
	public String circlesurfaceArea(int n) {
		double circlesurfacearea =  4 * Math.PI  * n * n;
		DecimalFormat form = new DecimalFormat("#.##");
		String dVal = form.format(circlesurfacearea);
		return dVal;
	}	
	public String sphereVolume(int n) {
		double spherevolume =  4/3 * Math.PI  * n * n * n;
		DecimalFormat form = new DecimalFormat("#.##");
		String dVal = form.format(spherevolume);
		return dVal;	
	}
	
	public static void main(String[] args) {
		
		// DecimalFormat 생성자를 생성한 후 		// new DecimalFormat("#.##"); 설정하는 법을 API 보고도 몰라서 구글링을 하였습니다...
 		
		Homework10 r = new Homework10();
		
		System.out.println("원주(원둘레) : "+r.circumFerence(5)); // 원주

		System.out.println("원의 면적" +r.rawArea(5)); // 원면적

		System.out.println("구의 표면적"+r.circlesurfaceArea(5)); // 구의 표면적
		
		System.out.println("구의 체적(부피)"+r.sphereVolume(5)); // 구의체적(부피)
		
	}

}
