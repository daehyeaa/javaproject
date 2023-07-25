package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Homework07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Calendar c = Calendar.getInstance(); 
		int y = c.get(Calendar.YEAR);	//연 : 2023
		int m = c.get(Calendar.MONTH)+1 ;
		int d = c.get(Calendar.DATE);
		int h2 = c.get(Calendar.HOUR_OF_DAY); // 24시간
		int mm = c.get(Calendar.MINUTE); // 분
		int ss = c.get(Calendar.SECOND); // 초
//		int week =c.get(Calendar.DAY_OF_WEEK); // 1 ~ 7 일 월~금 토
//		String dayOfWeek = ""; 
//		// int배열 만들어서 요일 숫자들 담아서 오늘 날짜 넣기
//		String [] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};		
//		for(int i = 0; i<7; i++) {			
//			if( i+1 == week) {
//				dayOfWeek = days[i];
//			}
//		}
		int w =c.get(Calendar.DAY_OF_WEEK);
		String [] days = {"일","월","화","수","목","금","토"};
		System.out.println(y+"-"+m+"-"+d+" "+h2+":"+mm+":"+ss+ " "+days[w-1] +"요일 ");
		
		
		StringBuffer sb = new StringBuffer(); // 메모리 저장하는 과정에서 string과 다르다 새로운 공간을 만들어서 저장하지 않는다 StringBuffer은
		sb.append("dddd");
		sb.append("ffffff");
		sb.append(true);
		
		System.out.println(sb);
		
		
	}
}
