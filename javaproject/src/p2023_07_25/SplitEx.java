package p2023_07_25;

import java.util.Arrays;
import java.util.StringTokenizer;

public class SplitEx {

	public static void main(String[] args) {
		// String[] split(String regex)
		
		String jumin = "950101-1234567";
		
		//방법1. StringTokenizer
		StringTokenizer st = new StringTokenizer(jumin, "-");
		String j1 = st.nextToken();
		String j2 = st.nextToken();
		System.out.println("주민번호 앞자리:"+ j1);
		System.out.println("주민번호 앞자리:"+ j2);
		
		//방법2. split() 메소드 
		String[] c = jumin.split("-");
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}

		// 향상된 for문 
		for(String s : c) {		// 변수 : 배열명
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(c));
		
		String tel = "010-1234-5678";
		String[] t =tel.split("-");
		System.out.println("전화번호 앞자리:"+ t[0]);
		System.out.println("전화번호 중간자리:"+ t[1]);
		System.out.println("전화번호 끝자리:"+ t[2]);
		
		String email = "totoro@naver.com";
		String[] e = email.split("@");
		System.out.println("아이디"+e[0]);
		System.out.println("도메임"+e[1]);
		
	}

}
