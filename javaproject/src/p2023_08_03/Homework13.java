package p2023_08_03;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Homework13 extends Thread{
	
	// 작업스레드 와 메인스레드 동시에 수행하는법 
	
	public void run() {		
		try {
			while(true) {			
			Thread.sleep(2000); // (단위: 1/1000 초)
			System.out.println("여기도 작업한다.");
			}
		}catch(InterruptedException e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SimpleDateFormat sd =new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		
			Homework13 ts = new Homework13();
			Homework13 thread = new Homework13();
			
			thread.start(); // 트리거 같은 존재???
			while(true) {
			
			Date d = new Date();
			System.out.println(sd.format(d));
			try {
				Thread.sleep(1000);// 쓰레드 한번 죽이는거 
			}catch(Exception e) {}
			
			}
	}
}


//public class Homework13 implements Runnable{
//	
//	SimpleDateFormat sd =new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
//	
//	public void run() {		
//		try {
//			while(true) {
//			Date d = new Date();
//			System.out.println(sd.format(d));
//			Thread.sleep(1000); // (단위: 1/1000 초)
//			}
//			
//		}catch(InterruptedException e) {
//			System.out.println(e.toString());
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			
//			Homework13 ts = new Homework13();
//			Thread thread = new Thread(ts);
//			
//			thread.start();
//		
//	}
//
//}
