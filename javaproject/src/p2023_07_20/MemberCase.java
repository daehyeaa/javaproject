package p2023_07_20;

import java.util.Scanner;

class MemberCaseInfo {
	
	// 필드
	private String name;
	private int age;
	private String email;
	private String address;
	
	// 생성자
	public MemberCaseInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	void MemberInfoCasePrint() {
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("이메일 :"+email);
		System.out.println("주소 :"+address);
	}
	
}

public class MemberCase {
	public static void main(String[] args) {
			
			System.out.println("1.정보 입력");			
			System.out.println("2.정보 출력");			
			System.out.println("3.종료");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
				
			switch (s) {
				case 1:
					// 메소드
					break;
				case 2:
					// 메소드
					break;
				case 3:
					System.exit(0);
			}
		
	}
}

	
