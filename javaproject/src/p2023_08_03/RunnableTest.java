package p2023_08_03;

public class RunnableTest implements Runnable {
	
	@Override
	public void run() {	// 실행중인 상태
		for( int i=1 ; i<=20 ; i++ ) {
			System.out.println( "number = " + i );
		}
	}
	
    // 1부터 20까지 화면에 출력시키는 메소드 
//    public void printNumber() {
//		for( int i=1 ; i<=20 ; i++ ) {
//			System.out.println( "number = " + i );
//		}
//    }
//    
//    public void run() {
//		printNumber();
//    }

    public static void main( String[] args ) {
		// 객체 생성
		RunnableTest tt = new RunnableTest();
		// Thread 클래스 객체 생성
		Thread t = new Thread( tt );
		// Thread를 시작시킴
		t.start();		// 실행 가능한 상태 : run()메소드가 자동으로 호출된다.
		for( int i=101 ; i<=120 ; i++ ) {
			System.out.println( "-------> main number = " + i );
		}
//		System.out.println( "--------> main thread end" );
    }
	
}
