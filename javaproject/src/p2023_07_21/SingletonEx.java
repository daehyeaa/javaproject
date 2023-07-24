package p2023_07_21;

//p280
class Singleton {
	// 싱글톤(singleton) : 객체 생성을 1번만 수행하는것.
	// 객체를 생성 (객체를 한번만 생성하는 것이 싱글톤)
	private static Singleton singleton = new Singleton(); // 정적 필드 (private)로 외부 클래스 접근 못하도록 함 
	
	private Singleton() {};	// private 으로 직접 객체 생성을 막아주는 역할
	
	// private 정적필드여서 접근이 불가 하여 정적메소드를 이용하여 리턴을 해서 필드를 공유
	// 정적 메소드를 이용해서 공유를 한다.
	static Singleton getInstance() {
		return singleton;
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
} 

public class SingletonEx {
	public static void main(String[] args) {

		//Singleton obj1 = new Singleton(); // The constructor Singleton() is not visible
		//Singleton obj2 = new Singleton(); // The constructor Singleton() is not visible
		
		//오류발생
		//System.out.println(Singleton.s);  //static 정적 필드 여도 private 가 있으므로 외부 클래스에서 접근할 수 없다. 
		
		Singleton obj1 = Singleton.getInstance();	//정적메소드 호출
		Singleton obj2 = Singleton.getInstance();	//정적메소드 호출
		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		// Singleton s = new Singleton(); //오류발생
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
		
	}
}
