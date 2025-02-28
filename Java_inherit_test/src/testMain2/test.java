package testMain2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) throws ParseException {
		
		Date today = new Date();
//		System.out.println(today);
		// 2025/02/27(일본표기법) 2025-02-27
		// 2025.02.27(우리나라 표기법)
		
		//년도 추출
//		System.out.println(today.getYear()+1900);//1900+(숫자) 따라서 125년도라고 가져옴
		
		//월 출력
//		System.out.println(today.getMonth()+1);//0부터시작이라 +1해야함.
		
		//일 출력
//		System.out.println(today.getDate());//Date는 일

		//요일 출력
//		System.out.println(today.getDay());//day는 요일
		
		//시, 분, 초
//		System.out.println(today.getHours()+":"+today.getMinutes()+":"+today.getSeconds());
		
		//날짜와 시간 포맷 지정하는 방법
		//2025.2.27
		
//		SimpleDateFormat day = new SimpleDateFormat("yyyy년.MM월.dd일");
//		String myDate = day.format(today);
//		System.out.println(myDate);
		
//		SimpleDateFormat time = new SimpleDateFormat("hh시 mm분 ss초");
//		String myTime = time.format(today);
//		System.out.println(myTime);
		
		// 날짜 차이 구하기
		// 2024.12.18 부터 오늘까지 몇일 인지 구하기
		
//		Date start = new SimpleDateFormat("yyyy.MM.dd").parse("2024.12.18");
		
//		long difsec = (today.getTime() - start.getTime())/1000; //초
//		System.out.println(difsec);
		
//		long difmin =  difsec/60;
//		System.out.println(difmin);//분
		
//		long difhour = difmin/60;
//		System.out.println(difhour);//시
		
//		long difDays = difhour/24;
//		System.out.println(difDays);//일
		
		
	}

}
