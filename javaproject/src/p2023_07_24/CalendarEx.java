package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		// Calendar 클래스		
		// 캘린더 클래스는 생성자를 생성하지 않는다. 문서에 없음
		//Calendar c1 = new Calendar();  // 오류 발생
		
		// 캘린더 클래스 자식클래스 중에 GregorianCalendar 을 이용해 자식클래스를 부모클래스에 형변환 하여 사용 
		Calendar c2 = new GregorianCalendar(); // 업캐스팅 (자료형변환)
		
		// 캘린더 클래스 안에 정적메소드 사용 
		Calendar c = Calendar.getInstance(); // 값을 구해오는 메소드는 보통 get~~로 만들어진 정적메소드가 많다.
		// 캘린더 객체를 바로 출력하면 time=1690168203492 으로 나오는데 1970 년 1월 1분 0초 기준으로 지금(현재시간)까지 나타낸 시간을 유닉스타임 이라고 한다.
		System.out.println(c); // time=1690168203492
		System.out.println(Calendar.YEAR);	// 1 정적필드
		
		// 쳤을때 날짜 2023.07.24 
		int y = c.get(Calendar.YEAR);	//연 : 2023
		System.out.println(y);
		
		// 월은 구하는 MONTH 는  0~11  으로 표시 되기때문에 + 1 을 해주어야 합니다.
		int m = c.get(Calendar.MONTH)+1 ;
		System.out.println(c.get(Calendar.MONTH)+1); // 6
		
		int d = c.get(Calendar.DATE);
		System.out.println(c.get(Calendar.DATE));	// 24
		
		System.out.println(y+"-"+m+"-"+d);

		int h1 = c.get(Calendar.HOUR); // 12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY); // 24시간
		
		int ap = c.get(Calendar.AM_PM); // 0:오전 , 1: 오후
		if(ap == 0) {
			System.out.print("오전 ");
		}else {
			System.out.print("오후 ");
		}		
		int mm = c.get(Calendar.MINUTE); // 분
		int ss = c.get(Calendar.SECOND); // 초
		int day =c.get(Calendar.DAY_OF_WEEK); // 1 ~ 7 일 월~금 토
		
		// int배열 만들어서 요일 숫자들 담아서 오늘 날짜 넣기
		String [] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};		
		for(int i = 0; i<7; i++) {			
			if( i+1 == day) {
				System.out.println("요일"+days[i]);
			}
		}
		
		System.out.println(h1+":"+mm+":"+ss);	//12시간제
		System.out.println(h2+":"+mm+":"+ss);	//24시간제
		System.out.println(day);
		
		
	}
}
