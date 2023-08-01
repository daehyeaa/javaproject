package p2023_08_01_List2;

public class memberManageVO {

	private String name;
	private int age;
	private String password;
	private String membership;	
	private String email;

	// 생성자 필드값 초기화
	public memberManageVO(String name, int age, String password, String memebership, String email) {
		this.name = name;
		this.age = age;
		this.password = password;
		this.membership = membership;
		this.email = email;
	}
	
	// 기본 생성자
	public memberManageVO() {
		
	}
	

}
