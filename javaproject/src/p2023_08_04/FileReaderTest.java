package p2023_08_04;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader 객체 선언
		FileReader file = null;
		int inputValue = 0;

		try {
			// "data.txt" File과 stream 형성
			// FileReader file = new File Reader("data.txt"); 을 하게되면 try 문 안에서만
			// 적용되기때문에 finally에 있는 file 변수를 사용 할 수 없다 . 그러므로 선언은 try문 밖에서 생성해주고
			// try안에서 객체를 선언해준다.
			file = new FileReader("data.txt"); // 상대경로
			// file = new FileReader( "data.txt" ); // 절대경로
			// 프로젝트 시 문제 1. 경로문제 2. 한글 인코딩 문제

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}

			
		}  catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			// stream을 닫음
			if(file != null)  try{
				file.close();
			}catch(Exception e) {}
		}
	}// main() end
}
