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
		
//		int a=0;
//		int b=0;
//		System.out.print("숫자입력 a:  , b: ");
//		a=sc.nextInt();
//		b=sc.nextInt();	
//		if(a==b)
//			System.out.println("같다");
//		else if(a<b)
//			System.out.println("작다"+a);
//		else
//			System.out.println("작다"+b);
		
		
		// 베스킨라빈스 31 게임만들기 
//		나와 컴퓨터 둘이서 진행
//		31을 제시하는 쪽이 패배
//		나 부터 시작한다.
//		숫자를 몇개를 제시할 것인지 갯수를 입력하면 자동으로 숫자가 나온다.
//		컴퓨터는 랜덤을 이용해서 몇개 제시할것인지 해야한다.
//		숫자는 1개부터 3개까지 가능

		int me=0, com=0, num=1;
		
		while(true) {// 언제 31이 나올지 모르니 무한루프로 전체를 반복
			System.out.print("\n숫자 몇개: ");
			me=sc.nextInt();
			//1~3 사이 값입력했는지 체크 하는 반복문 만들면 좋겠지요.
			System.out.print("나 : ");
			for(int i=1; i<=me; i++) {
				System.out.print((num++) + "  ");
				if(num ==32) break;
			
			}
			if(num==32) {
				System.out.println("내가 졌음..");
				break; // while 종료
			}

		com= (int)(Math.random()*3 +1);//1~3 개 중 하나
		System.out.println("\n컴퓨터 : ");
		for(int i=1; i<=com; i++) {
			System.out.print((num++) + " ");
			if(num==32) break;
		}
		if(num ==32) {
			System.out.println("컴퓨터 패배..");
			break; //while 종료
		}
		}
		
			
		
		
		// 세 개 중 같으면 같다 출력, 세 개중 작은 수 작다라고 출력
		      int a=0;
		      int b=0;
		      int c=0;
		      System.out.print("숫자입력 a:  , b:   , c:");
		      a=sc.nextInt();
		      b=sc.nextInt();   
		      c=sc.nextInt();
		      if(a==b && b==c)
		         System.out.println("같다");
		      else if(a<b && a<c)
		         System.out.println("작다"+a);
		      else if(b<a && b<c)
		         System.out.println("작다"+b);
		      else System.out.println("작다"+c);

	}

}
