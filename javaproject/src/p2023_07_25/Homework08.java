package p2023_07_25;

import java.util.Arrays;
import java.util.Scanner;


public class Homework08 {
	
	static boolean chk(String juminNumber) { // 주민 앞번호
		int total = 0;
		boolean answer;
		int [] juminChkNumber = {2,3,4,5,6,7,8,9,2,3,4,5}; // 12개
		int [] intArr = new int[juminNumber.length()];
		for(int i=0; i<juminNumber.length(); i++) {
			intArr[i] = Integer.parseInt(juminNumber.substring(i,i+1));
		}
		System.out.println(Arrays.toString(intArr));
		for(int i=0; i<intArr.length-1; i++) {
			 total += intArr[i] * juminChkNumber[i];
		}
		System.out.println("합산값"+total);
		int chkNum = intArr[intArr.length-1];
		System.out.println("체크넘"+chkNum);
		int key1 = total % 11; // 1번연산결과 에서 11 나눈거 나머지 값
		//int key2 = 11 - key1; // key1값(나머지값) 11
		//System.out.println(key1);
		int key2 = 11 - key1;
		
		if(key2  == chkNum) {
			answer = true;
		}else if(key2 >= 10) {
			if((key2%10) == chkNum) {
				answer = true;
			}else {
				answer = false;
			}
		}else {
			answer = false; 
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("주민등록번호 앞자리를 입력 하세요.");
		String jumin1 = sc.nextLine();
		System.out.println("주민등록번호 뒷자리를 입력 하세요.");
		String jumin2 = sc.nextLine();

		//String g = jumin2.substring(0, 1); // jumin2 = "1234567" //예외가 발생할 가능성이 있는 곳 뒷자리를 입력하지 않으면 substring을 추출 할 수 없다.

		// 유효성 검사
		if (jumin1.equals("")) {
			System.out.println("주민번호 앞자리를 입력 하세요.");
		} else if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리 6자리를 입력 하세요.");
		} else if (jumin2.equals("")) {
			System.out.println("주민번호 뒷자리를 입력 하세요.");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리 7자리를 입력 하세요. ");
		}
		
		String juminNumber = jumin1.concat(jumin2);
		//System.out.println(juminNumber);
		
		if(chk(juminNumber) == true) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("잘못된 주민등록번호입니다.");
		}

	}

}
