package p2023_07_21;

import java.util.Scanner;

public class MemberInput01_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열: 객체의 주소를 저장하는 배열
		MemberInfo01[] m = new MemberInfo01[5];
		int i = 0;
		String yn;

		Scanner sc = new Scanner(System.in);			
		do {
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();	
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

//			m[i] = new MemberInfo(name, age, email, address);
			// m.name="홍길동";
			
			m[i] = new MemberInfo01();
			m[i].setName(name);
			m[i].setAge(age);
			m[i].setEmail(email);
			m[i].setAddress(address);
			
			i++;

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.next();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("성명:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo01 {
	// 은닉화로 변수에 값을 접근하지 못하도록 하는것(?)
	private String name;
	private int age;
	private String email;
	private String address;
	
	// 생성자에 매개변수를 받아 class 필드 값 초기화	
//	public MemberInfo(String name, int age, String email, String address) {
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.address = address;
//	}	
	
	
	// setter 메소드를 이용해 생성자를 이용하지 않고 매개변수를 받아 class 필드 값 초기화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	

}
