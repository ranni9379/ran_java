package thread1;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyThread th1 = new MyThread("장은호");
//		th1.start();
//		test t = new test();
//		t.testfor();
//		
//		MyThread th2 = new MyThread("김명준");
//		th2.start();
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println("main 메서드");
//			try {
//				Thread.sleep(1200);
//			}catch(Exception e) {}
//		}
		Dino[] 알 = new Dino[] { 
				new Dino("티아노사우루스", 10),
				new Dino("밸로시랩터", 4),
				new Dino("프테라노몬", 6),
				new Dino("스테고사우르스", 7)
				
		};
		
		
		Create device1 = new Create();
		device1.start();
		// 부화 시킬 공룡을 선택하여 부화 진행할 것이다.
		// 스레드를 통해 각 공룡별 시간만큼 동작하도록 할 것이다.
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<알.length; i++) {
			System.out.println("1~4중 하나: ");
			int select = sc.nextInt();
			
			Create.hatch(알[select-1]);
		}
		
	}

}
// 스레드: 명령처리가 빠르다. 프로세스의 명령처리 단위
/*
	프로세스란? - 운영체제(윈도우같은거)에서 프로그램을 실행 시키는 단위
 		운영체제에서 프로그램을 실행 시키려면 관리가 필요하다.
 		운영체제에 의해서 프로그램이 실행 되는것이고 각 프로그램의 메모리는 운영체제로 부터 할당받아 사용하게 된다.
 		모든프로세스는 고유한 아이디를 가지고 있다.
 		이런 아이디를 프로세스라고 한다.
 		
 		원스레드의 장점
 		- 컴퓨터의 자원소모 감소
 		- 오류 관리, 디버깅이 쉽다.
 		- 명령코드 실행에서 충돌방지
 		- 오류가 발생해도 예외처리가 쉽다.
 		
 		멀티스레드 장점
 		- cpu 코어 컨텍스트 스취칭 값 감소
 		- 데이터 주고 받은 것이 간단해짐
 		- 응답시간 단축
 		- 네트워크 환경에 적합

 	- 스레드의 생명주기
 	1. new(스레드 생성)
 	2. runnable(실행준비)
 	3. running 상태(실행)
 		- wait, sleep, suspend에 걸리면
 		-> 대기상태
 		- 대기 상태에서 resume, notify, *sleep time up에 의해
 		-> 실행 준비 상태로 변경
 	4. terminated 상태(소멸)
 		

*/