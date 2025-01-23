package study0122;

import java.util.Scanner;

public class JavaOp3 {

	public static void main(String[] args) {
	// 비교연산자 - 두개 데이터를 비교하여 참, 거짓 결과

		System.out.println(10>5);
		System.out.println(11<4);
		
		Scanner scan = new Scanner(System.in);
		
//		int num;
//		
//		System.out.println(" 정수 입력 : ");
//		num = scan.nextInt();
//		
//		System.out.println("5보다 큰 숫자인가?" + (num > 5));
//		boolean big; // boolean은 true, false이냐를 나타낼 수 있는 조건문
//		big =num >=10;
//		
//		System.out.println("10이상 인가?" + big);
//		
//	
//		String word="가나다"; // 문자열을 타입은 String 클래스타입
//		String word2 = new String("가나다");
//		System.out.println(word == word2); // 정상적인 방식은 아님.
//		System.out.println(word.equals(word2)); // 문자열은 .equals()로 가능
//		System.out.println('a' > 'b');
//		System.out.println(10 == 10); // 두 숫자가 같다.
//		System.out.println(10 == 13); 
//		System.out.println("가나다" == "가나다");
//		 == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별		
//		System.out.println(10!=5);
//		
//		// 놀이동산에 가서 바이킹을 타는데 키가 140 이상 만 탈 수 있다.
//		
//		int tall;
//		System.out.print("키 : ");
//		tall =scan.nextInt();
//		System.out.println(tall >=140);
//		
//		 바이킹 탑승조건 : 키 140이상 190이하
//		 비교연산자로 만들어진 조건식이 여러개 인 경우 논리연산자를 사용
//	System.out.println(tall >=140 && tall<=190);	
//	140 <= tall <=190
//	System.out.println(140 <= tall <=190); //잘못된 식
//	 비교 데이터 타입 불일치
//	true <= 190
//	
	// 청소년 버스요금은 1000원이다. (청소년은 13세부터 19세)
	// 나이를 입력받아서 청소년 이면 false 아니면 true가 출력 되게 하세요.
//		반대의 경우에는 System.out.println(!(age<13 || age>19));
		
	int age=0;
	System.out.print("나이 : ");
	age = scan.nextInt();
	System.out.println(age<13 || age>19);
	 
	// 조건식 - 비교연산자와 논리 연산자를 사용하여 만든식
	// 조건식 만드는 연습 하셔야 해요
	// total > conunt
	}

}
