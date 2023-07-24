package p2023_07_20;

import java.util.Scanner;

class MemberInfo {
	
	// 필드
	private String name;
	private int age;
	private String email;
	private String address;
	
	// 생성자
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	void MemberInfoPrint() {
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("이메일 :"+email);
		System.out.println("주소 :"+address);
	}
	
}

public class MemberInput {
	public static void main(String[] args) {
		
		System.out.println("성명, 나이, 이메일, 주소 를 입력 하세요.");
		Scanner sc = new Scanner(System.in); 
		
		String name = sc.next();
		int age = sc.nextInt();
		String email = sc.next();
		String address = sc.next();
		
		MemberInfo mInfo = new MemberInfo(name, age, email, address);
		
		mInfo.MemberInfoPrint();

	}

}
