package p2023_07_21;

import java.util.Scanner;

class MemberInfo1 {
	
	// 필드
	private String name;
	private int age;
	private String email;
	private String address;
	
	//기본생성자
	public MemberInfo1() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}
		
	void MemberInfoPrint() {
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("이메일 :"+email);
		System.out.println("주소 :"+address);
	}
}

public class MemberInput1 {
	public static void main(String[] args) {

		System.out.println("몇 명의 사람을 입력 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		sc.nextLine();
		MemberInfo1[] mi = new MemberInfo1[num];	// 멤버인포 객체 생성
		
		for(int i=0; i<num; i++) {
			String name = sc.nextLine();
			int age = sc.nextInt();
			sc.nextLine();
			String email = sc.nextLine();
			String address = sc.nextLine();			
			
			// 객체를 호출
			//mi[i] = new MemberInfo1(name, age, email, address); // 생성자			
			mi[i] = new MemberInfo1();
			mi[i].setName(name);
			mi[i].setAge(age);
			mi[i].setEmail(email);
			mi[i].setAddress(address);
		}
		
		for(int i=0; i<num; i++) {
			mi[i].MemberInfoPrint();
		}
	}
}
