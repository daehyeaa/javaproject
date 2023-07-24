package c;

// 서로다른 패키지 임으로 import도 해주어야하고 
import a.b.Called;

//피키지 a.b에 있는 Called.java 안의 check() 메소드의 접근제어자가 default 이면은 여기서 check()메소드를 사용 할 수 없다 오로지 public만 가능하다.
public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Called c = new Called();
		c.check();

	}

}
