package p2023_08_02;

public class MemberInfoHomework01 {

	private String name;
	private int age;
	private String email;
	private String address;
	
	// 기본생성자
	public void MemberInfoHomework01() {
		
	}
		
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
	
	@Override
	public String toString() {
		return "MemberInfoHomework01 [name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]";
	}
	
	
		
}
