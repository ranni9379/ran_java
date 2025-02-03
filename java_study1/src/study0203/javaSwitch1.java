package study0203;

import java.util.Scanner;

public class javaSwitch1 {

	public static void main(String[] args) {
		// switch문 - 범위가 표현되지 않음 break문 사용 됨. 
//		데이터종류가 같아야함.switch(문자열, 숫자) - case(문자열, 숫자)
//		그러나 switch(정수)-case(문자 ex.'a')는 가능 
 		// if문 -break문(강제종료) 사용이 안됨.
		
//		switch(메뉴선택) {
//		case 파일열기:
//		case 파일저장:
//		case 종료:
//		}
//		if(10<5) {
//			System.out.println("aaa");
//			break; // if문에 단독 사용불가
//			System.out.println("bb");
//			System.out.println("asadaweda");
//		}
		
		
//	switch(3) {
//	case 1:
//		System.out.println("1을 선택");
//		if() {
//			break;
//			}
//		switch() {}
//		break;// 해당 제어문을 강제 종료
//	
//	case 3:
//		System.out.println("3을 선택");
//		break;
//	case 10:
//		System.out.println("10을 선택");
//		break;
//	}
	
//		int num =15; //여러개의 선택지 중에 선택하는 것
//		switch(num) {
//		case 10:
//			System.out.println("10 선택");
//			break;
//		case 30:
//			System.out.println("30 할꺼야??");
//			break;
//		case 20:
//			System.out.println("case에 표현하는 데이터는 정수,문자,문자열");
//			break;
//		case 50:
//			System.out.println("입력된 값에 맞는 case 실행은" + "break 또는 }까지 실행");
//			break;
//			default:
//				System.out.println("case에 없는 값이야! 다시해!!");
//		}
/*
 if(점수 <=100&& 점수 >=99){
 "A학점"
 }else if(점수 >=80){
 "B학점"
 }
*/
		
//		int 점수 =79;
//		switch(점수/10) {
//		case 10:
//		case 9:
//			System.out.println("A학점");
//			break;
//		case 8:
//			System.out.println("B학점");
//			break;
//		case 7:
//			System.out.println("C학점");
//			break;
//		default:
//			System.out.println("F학점");
//		}
//	}
//
//}


/*
 2/3 과제- 랜덤
 
가위바위보 게임 만들기
1. 가위 2. 바위 3. 보
내가 이겼는지, 졌는지, 비겼는지 출력

 */
Scanner sc = new Scanner(System.in);


int user=0, game=0;
System.out.println("1.가위 2. 바위 3. 보:");
user = sc.nextInt();

game = (int)(Math.random()*3+1);
if (user == game) {
    System.out.println("비겼습니다!");
} else if ((user == 1 && game == 2) || (user == 2 && game == 1) || (user == 3 && game == 1)) {
	System.out.println("이겼습니다!");
} else {	System.out.println("졌습니다!");
}
}
}