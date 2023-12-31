
package p2023_07_20;

class StaticTest {
	static int a = 10;		//정적필드 : 메소드 영역(공유영역)에 저장
	int b = 20;					//인스턴스 멤버변수 : 힙메모리 영역에 저장
}

class StaticTest01 {
	public static void main(String[] args){
    System.out.println("StaticTest.a->" + StaticTest.a); 	// 10
    StaticTest s1 = new StaticTest();
    StaticTest s2 = new StaticTest();
 
System.out.println("s1.a->" + s1.a + "\t  s2.a->" + s2.a);		// 10  10
System.out.println("s1.b->" + s1.b + "\t  s2.b->" + s2.b);		// 20  20

    s1.a=100; 		//정적 필드 a의 값을 100 할당
    System.out.print("s1.a->" + s1.a );		// 100
    System.out.println("\t  s2.a->" + s2.a+"  ");	//100
	System.out.println(StaticTest.a);			//100

    s1.b=200;
    System.out.print("s1.b->" + s1.b);	//200
    System.out.println("\t  s2.b->" + s2.b);	//20	
  }
}