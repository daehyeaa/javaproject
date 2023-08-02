package p2023_08_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberInputHomework01 {
	
	public static void main(String[] args) {
		
		// main 메소드 시작
		
		Scanner sc = new Scanner(System.in);	
		ArrayList<MemberInfo0101> list = new ArrayList<MemberInfo0101>();
		MemberInfo0101 info;// DAO 객체생성
		String yn;
		
		do {
			info = new MemberInfo0101();	
			
			System.out.println("성명을 입력하세요.");
			String name = sc.nextLine();
			info.setName(name);
			
			System.out.println("나이를 입력하세요.");
			int age = sc.nextInt();
			sc.nextLine();
			info.setAge(age);
			
			System.out.println("이메일을 입력하세요.");
			String email = sc.nextLine();
			info.setEmail(email);
			
			System.out.println("주소을 입력하세요.");
			String address = sc.nextLine();
			info.setAddress(address);
			
			list.add(info);	// MemberInfo0101의 객체를 저장
			
			System.out.println("계속 하시렵니까?");
			yn = sc.nextLine();
			if("Y".equals(yn)|| "y".equals(yn))  continue;
			else if("N".equals(yn)|| "n".equals(yn)) {
				break;
			}			
		} while(true);
		
			System.out.println("-------------------------------------");
			System.out.println("리스트 사이즈"+list.size());
			System.out.println("-------------------------------------");
			for(int i=0; i<list.size(); i++) {
				MemberInfo0101 m =  list.get(i);
				
				System.out.println("이름:  "+m.getName());
				System.out.println("나이:  "+m.getAge());
				System.out.println("이메일:  "+m.getEmail());
				System.out.println("주소:  "+m.getAddress());
			}
		
	}

}

class MemberInfo0101{
	private String name;
	private int age;
	private String email;
	private String address;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
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
	
}
