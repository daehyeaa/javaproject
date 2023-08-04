package p2023_08_04;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Homework14_file {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		FileWriter fw = null;
		
		try {
			 
			fw = new FileWriter("d:/keyboard.txt");
			String str = br.readLine();
			char [] ch = str.toCharArray();
			int input =0;
			
			//write(char[] , int off, int len)
			fw.write(ch, 0, ch.length);
			
			// write(int c) 메소드로 할때 
//			for(int i=0; i<str.length(); i++) {
//				input = str.charAt(i);
//				fw.write(input);
//			}
			
//			while ((input = fr.read()) != -1) {
//				System.out.print((char) input); // 화면에 출력 부분
//				fw.write(input); // 다른 파일에 쓰는 부분
//			}			 
			
			// char 배열로
			//fw.write(ch);
			
			// write(String, int off, int len) 메소드일 때
			//fw.write(str,0,str.length());	  
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(fw != null) try {fw.close();} catch(Exception e) {}
			} catch(Exception e) {}
		}
	}
}
