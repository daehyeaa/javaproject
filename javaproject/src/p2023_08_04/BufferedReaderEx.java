package p2023_08_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로 구구단 1개 단을 입력 받아서, 출력하는 프로그램을 작성 하세요.
		// 단,  BufferedReader 클래스로 처리 하세요.
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("단을 입력하세요.");
			String s = br.readLine();
			
			for(int i=1; i<10; i++) {
				System.out.println(s+"*"+i + "="+ Integer.parseInt(s)*i);
			}
		}catch(IOException e) {
			//e.printStackTrace();
			//e.toString();
			System.out.println(e.getMessage());
		}
	}

}
