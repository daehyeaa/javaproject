package p2023_07_18;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조 ( 정적인 : 크기가 정해진)
		// 변수 -> 배열 -> 자료구조(List)
		
		// 1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않는 경우에 주로 사용하는 형식		
		int [] score = new int[3];
		
		// int 형 배열은 자동으로 0으로 초기화가 된다.  기본자료형이라도 힙영역에 저장되면 값이 초기화가 됩니다.
		System.out.println(score[0]);	 //0
		System.out.println(score[1]); //0
		System.out.println(score[2]); //0
				
		// double 배열은 자동으로 0.0으로 초기화가 된다.
		double[] d = new double[3];
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		//char 배열은 자동으로 초기화가 되지 않는다.
		char [] ch = new char[3];
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		
		boolean [] b = new boolean[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		String [] str = new String[3];
		System.out.println(str[0]);			// null : 값이 없다.
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스프링";
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		// 1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할 때 주로 사용되는 형식
		//								   (배열에 할당 될 값이 정해져 있는 경우에 주로 사용함)
		int [] s = {80, 90, 100};	// new int[] {80,90,100};
		int [] s1 = new int[] {80,90,100};
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		System.out.println("배열의 크기:"+s.length); // 배열의 크기:3
		
		for(int i =0; i<s.length; i++) {
			System.out.print("배열"+i+"의값 : "+s[i]+"\t");
		}
		System.out.println();	
		
		double [] dd = {3.14, 10.5, 42.195, 50};
		
		for(int i =0; i<dd.length; i++) {
			System.out.println(dd[i]);
		}
		
		char[] c = {'j','a','v','a','자','바'};
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		
		boolean [] bb = {true,false,true};
		for(int i=0; i<bb.length; i++) {
			System.out.print(bb[i]+"\t");
		}
		System.out.println();
		
		String[] str1 = {"자바","오라클","스프링","파이썬","텐스플로우"};	
		String[] str2 = new String[] {"자바","오라클","스프링","파이썬","텐스플로우"};
		for(int i=0; i<str1.length; i++) {
			System.out.print(str1[i]+"\t");
		}
		System.out.println();
	}

}
