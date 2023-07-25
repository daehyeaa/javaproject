package p2023_07_24;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 날짜 시간 관련 클래스 : Date, Timestamp 주로 쓰는 것
		
		//1. Date		
			// 년, 월, 일. 시, 분, 초 요일로 날짜를 출력		
			// a hh : a는 (오전 오후) 소문자h 는 12시간 대문자H 는 24시간		
			SimpleDateFormat sd1 = 
					new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
			// api 에서는 요일은 EEE를 써야 되는데 E하나만 써도 요일이 출력된다.
			SimpleDateFormat sd2 = 
					new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
			Date d = new Date();
			System.out.println(d);
			System.out.println(sd1.format(d));
			System.out.println(sd2.format(d));
			System.out.println("-----------------------------");
		//2. Timestamp
				// 년, 월, 일, 시, 분, 초 로 날자를 출력
				//11버전 부터 모듈 구성으로 인해 modele-info 파일에 requires java.sql; 넣어진다. 
				// simpleDateFormat 으로 자신이 원하는 형태의 날짜 시간 형태를 만든다 이유는? 나라마다 날짜 표시 형태 or 시간이 다른기 때문에 이런 api가 제공되었다.
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				Timestamp ts = new Timestamp(System.currentTimeMillis());
				
				// simpleDateFormat 에는 메소드에 format 이라는 메소드는 없습니다.
				// 부모클래스인 DateFormat 클래스에 있는 format 메소드를 사용 하여 시간을 출력했다. 
				System.out.println(sf.format(ts));
				// timestamp가 long형임으로 system 클래스에서 제공하는  currentTimeMillis() 메소드를 사용한다,
				System.out.println(ts);
				
		 


	}

}
