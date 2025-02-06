package study0206;

import java.util.Scanner;

public class JavaHomework {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==== UP & DOWN 게임 (컴퓨터버전) ====");
		System.out.print("1~50 중 하나 입력 : ");
		int number = scan.nextInt(); // 내가 입력한 숫자를 컴퓨터가 맞춘다.
		
		int max=50, min=1, t=50; // t변수는 random()*t로 사용
		
		
		while(true) {
//			int com = (int)(Math.random()*50+1);
			

			int com=(int)(Math.random()*t+min); //20,
			System.out.println("컴퓨터:" +com);
			if(number == com) {
				System.out.println("정답!!");
				break; //반복문(while) 종료
			}
			if(number > com) {
				System.out.println("UP");
				min = com+1;// 업인 경우 범위의 최소값 변경
				t= max-com;
			}
			if(number < com) {
				System.out.println("DOWN");
				max =com-1; // 다운 인경우 범위의 최대값 변경
				t= max -min+1; //범위의 최대값- 최소값 +1하면 *값 나옴
			}
		}
		
		
	}

}
