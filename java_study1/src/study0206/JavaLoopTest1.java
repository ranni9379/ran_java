package study0206;

import java.util.Scanner;

public class JavaLoopTest1 {

	public static void main(String[] args) {
		/*
		 문제 1 - 무한루프
		 
		 정수 한개씩 계속 입력받기
		 입력하다가 0을 입력하면
		 지금까지 입력한 모든 숫자의 합 출력
		  //Scanner sc= new Scanner(System.in);
//		int sum=0;
//		while(true) {		
//		System.out.println("정수입력:");
//		int num =sc.nextInt();
//		if(num==0) break;
//		sum+=num;}
//		System.out.println("총합: "+ sum);
		
				 
		 
		 문제 2 - 무한루프
		 
		 컴퓨터와 가위 바위 보 게임하기
		 내가 10번을 이길때 까지 계속 게임하기
		 10번 이기면 그동안 몇번 패배하고 몇번 비겼는지 출력
		 
		 
		 문제 3
		 컴퓨터와 주사위 게임을 한다.
		 각각 주사위 2개를 던져서 주사위 합이 큰쪽이 이긴다.
		 단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
		 둘다 같은 숫자가 나왔다면 합이 큰쪽이 이긴다.
		 예) 나-3,4 컴-1,3 내가 이김
		 	나- 5,6 컴-1,1 컴퓨터 이김
		 	5판을 진행했을 때 몇승 몇패 몇무 인지 출력
		 
		 */
		

//		int apple=6;
//		int a=6;
//		if (a==apple)
//			System.out.println("6개 먹음");
//		else System.out.println("6개 먹지 않음");
		
//		int money=100000;
//		int bank=200000;
//		if (money>=bank)
//			System.out.println("100000원 미만이다");
//		else System.out.println("100000원 이상이다");
		
//		int shopping=125000;
//		int bank=50000;
//		
//		if (shopping>=bank)
//			System.out.println("얼마충전 해야하는가?"+(shopping-bank)+"원");
//		else System.out.println("결제완료");


//		int birth=2015;
//		int year=2025;
//		int age=year-birth;
//		if (age >=20)
//			System.out.println("성인" + age + "살");
//		else System.out.println("미성년자" + age + "살");
		
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		int b=0;
		System.out.print("숫자입력 a:  , b: ");
		a=sc.nextInt();
		b=sc.nextInt();	
		if(a==b)
			System.out.println("같다");
		else if(a<b)
			System.out.println("작다"+a);
		else
			System.out.println("작다"+b);
		
		// 세 개 중 같으면 같다 출력, 세 개중 작은 수 작다라고 출력
		 
	}

}
