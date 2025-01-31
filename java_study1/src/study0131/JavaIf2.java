package study0131;

import java.util.Scanner;

public class JavaIf2 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
//		int num=0;
//
//		System.out.print("숫자입력 : ");
//		num = in.nextInt();
//
//		if(num % 2 ==1) {
//			System.out.println("홀수");
//			}else {
//				System.out.println("짝수");
//			}
	
		//조건식은 if뒤에만 else뒤에는 못씀
//		int num =15;
//		if(num > 0) {
//			System.out.println("양수이다.");
//			}else if(num < 0) {
//					System.out.println("음수이다.");
//				}else {
//					System.out.println("0 이다.");
//				}
//		int score =81; // 100~90은 A, 89~80은 B, 79~70은 C // 나머지는 F
//		if(score <=100 & score >=90) {
//			System.out.println("A학점이다.");
//		}
//		else if(score >=80) {
//			System.out.println("B학점이다.");
//		}
//		else if(score >=70) {
//			System.out.println("C학점이다.");
//		} else {
//			System.out.println("F학점이다.");}
		// 1 입력하면 데이터 저장이라고 출력
		// 2 입력하면 데이터 삭제 하고 출력
		// 3 입력하면 종료 라고 출력
		// 1,2,3 이 아닌 숫자는 잘못입력했습니다. 라고 출력
		// 정수를 입력하여 위 내용 처럼 실행 될 수 있게 만드세요.
		
		int num=0;
		System.out.print("메뉴를 선택 : ");
		num = in.nextInt();
		if(num == 1) {
			System.out.println("데이터 저장");
		}else if(num==2) {
			System.out.println("데이터 삭제");
		}else if(num==3)
			System.out.println("종료");
		else 
			System.out.println("잘못 입력했습니다.");
		}
	}

/*
변수: 데이터(값)을 저장하기 위한 메모리 공간
변수이름: 데이터가 저장된 메모리공간을 사용하기 위해서는 이름을 부여 해야한다.
System.out.println(1000); -> 변수가 아님, 재사용 금지
int a =1000; -> 변수, 재사용 할 수 있음
a=123;
a=23;
-> 데이터 타입에 맞춰서 변수 작성하기
그러나, 형변환은 데이터 타입에 맞추지 않고 변수 작성도 가능
데이터타입 변환(형변환)
자동 형변환: 데이터타입이 작은범위에서 큰범위로 데이터가 저장되는 경우 
ex. float a=10;이 float a= 10.0; float 실수변수= 10;
강제 형변환: 데이터타입이 큰범위에서 작은범위로 데이터가 저장되는 경우 
int b = 2.14f;
int b =(int)2.14f;  강제형변환
나누기 %:나머지 구하기
++, --,: 증감연산자 (1씩증가, 1씩 감소)

if문
if(조건식){조건식이 참이라면 조건식 다음의 중괄호 안에 내용만 실행 참일 경우 실행할 내용, 여러 줄 가능} 
if(조건식){ }else{else는 조건식이 거짓일 경우에만 실행, 거짓일경우 실행할 내용, 여러 줄 가능} 
int 나이 =25;
if(나이 >= 19){System.out.println("성인 입니다.");}
else {System.out.println("청소년입니다.");}

int money =6400;
if(money >=10000){
System.out.println("충전 안함");
System.out.println("현재잔액 : " + money);} else
{System.out.println("잔액 부족" + (10000-money)+"충전");
money =(10000-money)+money;
System.out.println("현재 잔액 :" + money);}


System.out.println(a);

변수 선언: 데이터타입 정하기, 변수이름 정하기
		-> 사용할 데이터에 맞춰서 정하기
		-> int num; 데이터타입 변수이름;
		
*/
// 사각형의 너비와 높이이다,
// 현재 사각형은 정사각형이나 직각사각형인가??
//int width = 53, height =52;
//if(width == height) {
//	System.out.println("정사각형이다.");
//}else {
//	System.out.println("직각 사각형이다.");
//}

	// 입력한 숫자가 짝수인가 홀수인가?
	

 

 
