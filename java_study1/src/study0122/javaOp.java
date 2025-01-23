package study0122;

import java.util.Scanner;

public class javaOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =20; // 대입연산자에 의해 오른쪽의 값을 왼쪽에 저장
		num =20+3+1*10; // +,* 연산 후 대입연산 실행

		int num2 =10, num3 = 55;
		num =num2+13/num3 + 123; // 대입연산자는 다른 연산자들보다 우선순위가 낮다.
		// ()  [] .(참조) -> 접근연산자
// 사칙연산자
		System.out.println(num2 + num3); // num2 + num3 +
		System.out.println(num3-num2); //-
		System.out.println(num2*4); //*
		System.out.println(num2+num3*2); // * 연산 후 + 연산
		System.out.println(num3/num2); // 연산은 몫
		System.out.println(num3%4); //% 연산은 나머지
	
		System.out.println(10 / 3.0);		
		System.out.println(10 % 3.0);	
		
		
		// 복합대입 연산자
//		num=10;
//		num= num +20;
//		num += 20;
//  num = num2*5;
//		 num2 *=5;
//		num=num+5 * num3;
//		num + 5 * num3;
//		 더하기 먼저하고 대입연산 하기
//		동일한 변수이어야만 연산 할 수 있음.
		
		Scanner scan =new Scanner(System.in); // 키보드 입력 받기 위해 생성
		
		// 원의 둘레 구하기
		int r=0, dist=0;
		System.out.print("반지름 : ");
		r = scan.nextInt();
				
		dist = (int)(r*2*3.14); //강제형변환
//		데이터 이동 시, 타입의 범위가 큰쪽에서 작은쪽으로 갈때 타입 변환 해야함.
		System.out.println(" 원의 둘레 : " + dist); 
	}

}
