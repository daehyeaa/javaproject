package p2023_08_03;

public class ThreadEnd extends Thread {
	
// Thread(쓰레드) : 1개의 process를 구성하는 논리적인 작업단위
// 자바에서 Thread를 만드는 방법
// 1.Thread 클래스를 상속 받아서 만드는 방법
// 2. Runnable 인터페이스를 상속 받아서 만드는 방법

//	* Thread
//	1개의 process를 구성하는 논리적인 작업 단위
//
//
//	* 자바에서 Thread를 만드는 방법
//	1. Thread 클래스를 상속 받아서 만드는 방법
//	2. Runnable 인터페이스를 상속 받아서 만드는 방법
//
//
//	* Thread의 생명 주기(Life Cycle)
//
//	Runnable :  새로 생성한 Thread를 start하면 Runnable 상태가 됨.
//	            실행 가능한 상태( start() 메소드 호출한 상태)
//
//	Running : CPU를 점유하고 run() 메소드 내의 명령문을 실행하는 
//		  상태. 실행상태(run() 메소드를 실행한 상태)
//
//	Block : 특정 메소드의 호출에 의해서 현재 실행중인 Thread가 
//	        CPU의 제어권을 잃어버린 상태.
//
//	Dead : run() 메소드의 명령 수행이 끝났을 경우

    public void run() {	//실행중인 상태
		// thread가 시작되면 실행되는 문장
		for( int i=1 ; i<=20 ; i++ ) {
			System.out.println( "run number = " + i );
		}
    }

    public static void main( String[] args ) {		
		ThreadEnd tt = new ThreadEnd();
		// thread를 실행시킴
		tt.start(); // 실행 가능한 상태 : run() 메소드가 자동으로 호출된다.
		
		// main()내에서 화면에 101부터 120까지 출력
		for( int i=101 ; i<=120 ; i++ ) {
			System.out.println( "-------> main number = " + i );
		}
    }

}
