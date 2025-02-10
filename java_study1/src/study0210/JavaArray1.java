package study0210;

import java.util.Scanner;

public class JavaArray1 {

	public static void main(String[] args) {
	// 변수: 값(데이터, 주소 등등)을 저장하기 위한 메모리 공간
		
		int a =10;
		a=20;
		// 배열: 데이터 저장하기 위한 메모리 공간 변수의 차이점) 하나의 값만, 배열은 여러개의 데이터 값을 가질 수 있음.
		// 같은 데이터 타입의 연속적인 메모리 공간 // 다른말로 -> 변수공간 여러개를 연속적으로 사용, 같은타입으로 들어가야 함. cf. 클래스는 다른 타입으로 들어감.
		// 자바스크립트 배열 -> let arr =[]; let arr= new Array();
		//		const arr=[1, "aaa", 3.31, 4];
		// 자바는 타입부터 작성
		// 자바 배열 선언 방법
		int[] arr = new int[5]; //5개 공간으로 이루어진 배열 선언 // 크기 정해야 함. // 한번 정해놓은 크기는 변할 수 없음.(늘리고 줄이고가 안됨. 여유있게 가져오기)
		int[] arr2 = new int[] {1, 20, 50, 15}; // 4개 공간 배열 선언
		
		// 자바 배열 사용법
		arr[2] = 20;// arr 배열의 세번째 공간에 20저장
		System.out.println(arr[0]);
		arr[0] =10;
		arr[1] =30;
		arr[3] =40;
		arr[4] =60;
		
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		// 배열의 각각의 공간을 표현하려면 인덱스로 표현해야 한다.
		// 인덱스는 0부터 시작한다
		// 그래서 반복문의 초기값은 0으로 지정하면 된다.
		// 반복문의 조건식은 배열인덱스의 마지막까지 표현 될 수 있게 하면 된다.
//		 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7
//		조건식은 i<=7 하면된다.
		for(int i=0; i<=3; i++) {
			System.out.println(arr2[i]);
		}
		int[] apple = new int[10]; //참조변수 ->  뒤에 new가 들어감 데이터가 아님
//		참조변수를 사용하려면 배열인 경우 인덱스로 객체인 경우는 . 접근연산자로 
		long naa=100;
//		Scanner[] ab = new Scanner[50];
//		ab[0];
//		Scanner 라는 이름의 클래스 타입이다.
		Scanner sc= new Scanner(System.in);
//		배열에 데이터 입력
		for(int i=0; i<=9; i++) {
			System.out.println("숫자 입력:");
			apple[i] = sc.nextInt();
			}
//		apple.length -> 배열의 크기(공간갯수)
//		실수데이터는 정확도가 100%가 아니라 잘못 처리 될수도 있다.
//		배열의 크기는 반드시 10진수 정수(양수)로 지정
		for(int i=0; i<apple.length; i++) {
			System.out.println("배열값 : " + apple[i]);
			
		}
	}

}
