package study0120;

import java.util.Scanner;

public class java_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 1월 20일 과제 (변수 활용 문제) 사과상자에 사과가 20개 들어있다. 오렌지 상자에 오렌지가 15개 들어 있다. 사과 상자는 11개, 오렌지 상자는 12개 있다면 과일은 총 몇개 인가?*/
		
		//변수- 데이터를 저장하기 위한 메모리 공간
		//변수의 이름 - 데이터가 저장된 공간을 사용하기 위해 부여한 별명
		//변수 선언 방법 - 데이터타입 변수이름 (예- int num;)
		//저장할 데이터에 맞는 데이터타입을 설정해야 한다.
		//변수이름의 첫글자는 문자로, 자바 예약어는 사용불가
		
		
		// 자바에서 결과로 출력 하는 방법
//		System.out.println("출력하는 방법");
		// 자바에서 키보드를 통해 데이터 입력하는 방법
		// 자바에서 입력하기 위한 순서
		// 1. 입력 객체 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출
		
		// Scanner 변수이름 = new Scanner(System.in);
		
		Scanner sc= new Scanner(System.in); //클래스이름 뒤에다가 변수이름
		
		//num 이라는 변수에 정수 데이터입력하여 저장하기
		//nextInt() 가 정수데이터 입력하기 이한 메서드이다.
//		int num = input.nextInt(); => nextInt()는 고정값
		
//		System.out.println("정수입력:");
//		int num = sc.nextInt();
		
//		System.out.println("입력잘되었나?" + num);
		
		// 사각형 너비와 높이를 키보드를 통해 입력받고
		// 넓이를 계산하여 출력하세요.
		
		int width=0, height=0; //초기값으로 0을 넣어주면 좋다//
		System.out.print("너비입력:"); //만약 System.out.println이면 ("너비입력:") 너비입력 밑에 값이 출력
		width = sc.nextInt();
		System.out.print("높이입력:");
		height = sc.nextInt();
		// 사각형 넓이 구하기
		int area = width * height;
		System.out.println("사각형넓이:"+area);
		


		
	}

}
