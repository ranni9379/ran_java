package study0123;

import java.util.Scanner;

public class JavaOp4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		// 조건연산자
//		// (조건식) ? 참일경우 실행 내용: 거짓이라면 어떤 것을 실행 내용;
//		
//		void a = (10 > 5) ? System.out.println("5보다 크다") System.out.println("5보다 작다");;
//		
//		String result =(1 >5) ? "5보다 크다" : "5보다 작다" ;
//		System.out.println(result);
//		
//		
//		
//		int age = 21;
//		int price = (age < 19)? 1000:1500;
//		System.out.printf("나이: %d살, 버스요금 : %d원 \n", age, price);
//		
//		int a=0;
//		int b = (age < 15) ? a=1000 : 1500; // 이렇게 하지 말기!
//		(age < 19) ? 1000:15000;
//
//		
//
//		System.out.println("첫번째 숫자 :");
//		int num1 = scan.nextInt();
//		System.out.println("두번째 숫자 :");
//		int num2 = scan.nextInt();
//		
//		int res = (num1 > num2) ? num1 : num2;
//		 조건식이 참이라면 res= num1 수행
//		 조건식이 거짓이라면 res= num2 수행
//		
//		int res = ( num1 < num2)? num1 : num2; 이면 두 숫자중 작은걸 찾기
//		
//		System.out.println("두 숫자 중 큰숫자는 :" + res);
//		
//		두숫자를 입력받아서 두 수가 같다, 같지 않았다. 출력
//
//		 System.out.println("숫자1: ");
//		 num1 = scan.nextInt();
//		 System.out.println("숫자2: ");
//		 num2 =scan.nextInt();
//		 String 결과 = (num1 == num2)? "두숫자가 같다." : "두숫자가 같지않다.";
//		 System.out.println(결과);
//				 
//		System.out.println("정수 입력 : ");
//		int num =scan.nextInt();
//		
//		입력한 정수가 양수냐 음수냐, 0이냐 
//		String res= (num > 0 ) ? "양수" : ( num < 0 )? "음수" : "0이다"; //(num = 0)? "0이다" : "음수"이다;
//		System.out.println(res);

		// 바이킹을 타기 위해서는 키가 135 이상이어야 한다.
		// 바이킹 탑승여부를 출력하세요. (키 입력받기)
//		System.out.print("키 입력 : ");
//		int height =scan.nextInt();
//		
//		String res= (height >= 135) ? "탑승가능" :  "탑승불가능";
//		System.out.println(res);

//		System.out.print("1. 파미향짬뽕 2. 쿠켄 돈가스 3. 공주순대 : ");
//		int select = scan.nextInt();
//		
//		int price = (select == 1)? 9000 : 0;
//		price = (select ==2)? 8000 : price;
//		price = (select ==3)? 6500 : price;
//		// 이전 조건자의 연산을 이어서 가져오는 것
//		System.out.println("가격은" + price);
		
		// 정수 세개를 키보드를 통해 입력받기
		// 세 정수 중에서 가장 큰 정수를 출력하세요.
		// 두개가 같은 경우, 세개가 같은경우는 배제하고-서로 다른 숫자
		
//		System.out.print("첫번째 정수");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 정수");
//		int num2 = scan.nextInt();
//		System.out.print("세번째 정수");
//		int num3 = scan.nextInt();
		
		System.out.println("세 정수 입력 : ");
		int num1 =scan.nextInt();
		int num2 =scan.nextInt();
		int num3 =scan.nextInt();
		
		int max =(num1 >  num2) ? num1 : num2;
		max = (max > num3)? max : num3;		
		
		
		System.out.println("가장 큰 정수:"+ max);
		
		
		
	}

}



// 사칙연산 : +, -, /(몫), *, %(나머지값)
// 복합대입연산자 : +=, =+, /=, *=, %= : 복합대입연산자보다 사칙연산자 먼저계산
// a = a+123;  -> a += 123;
// 증감연산자: ++(1씩 증가), --(1씩 감소) : 변수 뒤쪽에 붙으면 대입연산자보다 더 낮은 연산, 변수 앞쪽에 붙으면 우선순위가 높음
// 비교연산자: 비교연산자를 통해 조건식을 만든다. 조건식은 참 또는 거짓의 결과
// 		= 대입/저장, == 같다, !=같지않다
// 논리연산자: &&(and), ||(or), !(not)
// 논리연산자는 참이나 거짓을 가지고 연산을 한다.
// a > 6 && (b < 4 && b > 0 || c >10)

