package p2023_08_04;

// 5개의 Thread를 만들어 실행 시키는 클래스
//  
public class ManageToilet {

    public static void main( String[] args ) {
		Toilet t = new Toilet();

		// thread 생성
		Family father = new Family("아버지", t );
		Family mother = new Family("어머니", t );
		Family sister = new Family("누나", t );
		Family brother = new Family("형", t );
		Family me = new Family("나", t );

/*** 우선 순위 적용안됨
		father.setPriority(10);
		mother.setPriority(7);
		sister.setPriority(5);
		brother.setPriority(3);
		me.setPriority(1);
*/

		// 각 Thread는 Runnable 상태에 들어감
		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
    }
}


/*
* Thread의 동기화 기법

한 번에 하나의 쓰레드만 객체에 접근할 수 있도록 객체에 
락(lock)을 걸어서 데이터의 일관성을 유지하는 것.

스레드의 동작에 의해서 동시에 여러작업이 가능하지만 인출 작업과 같이 특정 작업에 대해서는 하나의 스레드만이 동작하도록 해야한다.
이렇게 멀티스레드 프로그램에서 하나의 스레드에 의해서만 처리할 수 있도록 하는 영역을 임계영역(Critical Section)이라고 한다.
임계영역으로 지정하기 위해서는 하나의 스레드가 이 영역에 진입할때 락을 걸어서 다른 스레드가 수행하지 못하도록 하고, 이 영역에서 벗어날 경우 락을 해제하여 다른 스레드가 수행하도록 한다. 
즉, 임계영역 내에서만은 한번에 하나의 스레드만이 동작하도록 제약을 주어야 한다.
이러한 제약을 위해서 자바에서는 동기화 기법을 제공하는데 하나의 스레드만 동작하도록 하고자 하는 메서드나 블록에 synchronized 로 지정한다.


1. 메소드의 동기화 방법(메소드에 lock 을 설정)
 public  synchronized  void  Method(){
   임계영역 처리구문
 }

2. 특정 블록의 동기화 방법 (특정 객체에 lock 을 설정)
 public  void  Method(){

     synchronized(동기화할 객체 또는 동기화할 클래스명){
         임계영역 처리구문
     }
 }
*/