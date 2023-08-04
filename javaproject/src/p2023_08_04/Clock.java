package p2023_08_04;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
// Runnable이 필요한 이유
// thread로 상속받으면 되는데 이런 경우 다중상속이 안됨으로 JFrame을 상속받고 Runnable로 
// 쓰레드를 사용할 수 있게 한다.
// Runnable 인터페이스 상속받은 class ex) ThreadRun
// ThradRun tr = new ThradRun();
// Thread thread = new Thread(tr);
// thread.start(); 이렇게 사용
public class Clock extends JFrame implements Runnable{
	
	private JTextField jf;
	public Clock() {
		super("스레드를 이용한 시계"); // JFrame의 기본 생성자 호출 
		setLayout(new FlowLayout());
		
		
		
		jf = new JTextField(20);
		add(new JLabel("현재시간:"));
		add(jf);
		
		setSize(350, 100);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sd = 
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while(true) {
			try {
				Date d = new Date();
				jf.setText(sd.format(d));
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		Thread t = new Thread(c);
		t.start();		
//		t.run();		
	}

}




