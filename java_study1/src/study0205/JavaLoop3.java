package study0205;

import java.util.Scanner;

public class JavaLoop3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
//		for(초기값; 조건식; 증감식)
//		for(int i=1; 1<=10; i++1)
//		반복횟수가 정해져 있는 경우 for문이 가독성이 좋다.
// 		반복횟수가 없는 경우 while문이 가독성이 좋다.
//	위의 for문과 아래 while문이 같음

//		int i=1; //초기값 while 바깥에
//		while(i<=10) 
//		{//조건식
//		 System.out.println(i);
//			i++;//증감식
//		}
	

//		int com= (int)(Math.random()*50+1);
//		
//		while(true) {
//	System.out.print("정수 입력 : ");
//	int num =scan.nextInt();
//	if(com==num) {
//		System.out.println("정답 !");
//		break;
//	}
//	if(com>num)
//		System.out.println("업");
//	if(com<num)
//		System.out.println("다운");
//}
		
//		오늘의 과제 1~50중 하나를 내가 이 입력한다.
//		내가 입력한 숫자를 컴퓨터가 맞춰야한다. (random사용)
//		무작위로 맞추는게 아니고 범위를 좁히면서 맞출수 있도록 해야한다.
		
		System.out.println("정수입력:");
		int num =scan.nextInt();
		
		while(true) {
			int com =(int)(Math.random()*50+1);
			
			if (com=num) {
				System.out.println("정답!");
			}else 
			
		}
		
		
		
//		동전앞면 뒷면 맞추기 게임
//		내 돈이 바닥날때까지 게임 진행!!
//System.out.print("당신의 머니는 얼마? :");
//		int money=scan.nextInt();
//		final int 판돈=1000;
//		int win=0;
//		while(true) {
//			int coin=(int)(Math.random()*2+1);// 1앞 2뒤
//			System.out.println("1. 앞면, 2.뒷면:");
//			int user = scan.nextInt();
//			if(user == coin) 
//				{System.out.println("정답!!"); win++;}
//			else
//				System.out.println("땡!!");
//			money-=판돈; // 1번 진행시 1000원씩 감소
//			if(money < 판돈) break;
//		}
//		System.out.println("내돈은"+money);
//		System.out.println("정답 몇번" +win);
	}

}
