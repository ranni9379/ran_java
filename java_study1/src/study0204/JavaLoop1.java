package study0204;

import java.util.Scanner;

public class JavaLoop1 {

	public static void main(String[] args) {

//	for(int i=1; i<=10; i=i+2) {
//		System.out.println(1);
//	}
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("숫자입력 :");
//		
//		int num =scan.nextInt();
//		
//		for(int i=num; i>=1; i--) {
//			System.out.println("반복!!!");
//		}
		
//		for(int i=1; i<=num; i++) {
//			System.out.println("반복문!");
//		}
		 
		//6번 반복하는 반복문 만들고 싶다.
		//1부터 시작해서 6까지 1씩증가
		//i=1; -> 1부터 시작하겠다.
		// i<=6;  -> 6까지
		// i++ 또는 i=i+1 1씩증가
		
		// 정수 5부터 17까지 출력하는 반복문을 만드세요.
//		System.out.println("숫자입력 :");
		
//		int num =scan.nextInt();
//		for(int i=5; i<=17; i++) {
//			System.out.println(i);
//		}
		//총합구하기
//		int sum=0;
//		for(int num=1; num<=10; num++) {
//			sum= sum +num;
//		}
//		System.out.println("1부터 10까지 합:"+sum);
		
		// 두개의 정수를 입력하여 두 수중 작은 숫자부터 큰숫자까지의 합을 구하세요.
		// 예) 1번째 숫자를 21입력하고 2번째 숫자를 4 입력했다면
		// 4부터 21까지의 합 구하기
		
//		int num1=0, num2=0 , sum=0;
//		System.out.println("정수입력 1.  :");
//		num1= scan.nextInt();
//		System.out.println("정수입력 2.  :");
//		num2= scan.nextInt();
//		
//		if(num1>num2) {
//			for(int i=num2; i<=num1; i++) {
//				sum= sum+i;
//			}
//		}else {
//			for(int i=num1; i<=num2; i++) {
//				sum=sum+i;
//			}
//		}
//		System.out.println(num1+"부터"+ num2+"까지 합:"+sum);
		
//		int num1=0, num2=0;
//		
//		System.out.println("두 개 정수 입력:");
//		num1 =scan.nextInt();
//		num2 =scan.nextInt();
//		
//		if(num1>num2) {
//			int temp = num1;
//			num1 = num2;
//			num2= temp;
//			}
		
//		 내가 키보드로 입력한 숫자에 해당하는 구구단 출력하기
		System.out.println("숫자입력:");
		int gugu =scan.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d = %d \n",gugu,i, gugu*i);}

		
		
		
//		for(int i=1; i<=9; i++) {
//			System.out.printf("2*%d = %d \n",i,2*i);
//		}
//		System.out.println("2*1="+(2*1));
//		System.out.println("2*2="+(2*2));
//		System.out.println("2*3="+(2*3));
//		System.out.println("2*4="+(2*4));
		
		
		
		
	}

}
// 반복문- for, while, do~while
// 반복 몇번을 반복할꺼냐, 몇번을 반복할것인지 정하지 않고 하는 경우와
// 반복횟수를 정하여 반복하는 경우
// 주로 반복하는 횟수가 정해진 경우는 for문
// 출력되는 값이 다르지만 반복적으로 출력
// for(반복할 횟수_변수를 범위 형태로 작성)
//=> 초기값지정; 조건식 비교; 참일 경우 1회 실행=>증감식
//=> 조건식 다시 비교=> 거짓일 경우까지 도달 후 종료
//=>조건식 다시 비교=> 거짓일 경우까지 도달 후 종료
//for문은 2개의 ; 필수(구분위함)
// 반복횟수가 정해져있지 않은 경우는 while문 

