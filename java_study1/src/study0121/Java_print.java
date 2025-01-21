package study0121;

public class Java_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("한줄에 하나씩 출력 !@#@!$!");
		System.out.print(" 한줄에 이어서 출력 ");
		System.out.print(" 그다음 이어서 출력 ");
		
		System.out.printf(" 그냥 print 처럼 사용 가능 ");//f는 포맷을 의미
		System.out.printf("println 처럼\n 하려면 \n"); // \n는 엔터를 의미
		System.out.printf("다음줄 \n에 출력 \n");
		System.out.printf("%d", 100); // "%d"는 데이터를 대신해서 표현하는 것을 의미, 형식지정자
		System.out.printf("%%"); // %를 한번하면 오류 %% 두번 써야 %로 출력
		
		// 형식 지정자를 사용하기 위해 주의 할것
		//1. 형식지정자와 데이터 위치를 맞워야 한다.
		System.out.printf("%d %f", 100, 3.14);
		//2. 형식 지정자와 데이터 갯수 맞추기
		System.out.printf(" %d %d %d ", 10,20,30);
		System.out.println(2025 + "년" + 1+"월" + 21+"일");
		System.out.printf("%d년 %d월 %d일 \n",2025,1,21);
		
		float fnum = 5.12345f;
		System.out.println("println 출력 :" + fnum);
		System.out.printf("printf 출력 %.1f \n", fnum); //.뒤로 한자리까지 출력
		
		int num =15;
		System.out.println(num);
		System.out.printf("%4d\n", num); // %4\d 4자리 확보하고 오른쪽정렬까지
		System.out.printf("%-4d\n", num); // %4\d 4자리 확보하고 왼쪽정렬까지
		
	}

}
/*
	형식 지정자 ( 서식문자 )
	%d, %i - 10진수 정수
	%f - 10진수 실수
	%c - 문자
	%s - 문자열
	%b - boolean 타입
*/