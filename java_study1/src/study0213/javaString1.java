package study0213;

import java.util.Scanner;

public class javaString1 {

	public static void main(String[] args) {
		
		String title = "자바는 즐거워";
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제목 입력 : ");
//		title = scan.next(); // .nextLine();
		
		// 숫자 -> 문자열
		
		System.out.println(title);
		
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
//		scan.nextLine();
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.println("키 : ");
		String tall = scan.next();
		
		System.out.println(age + " "+ name);
		
		// 키보드로 입력하면 버퍼에 쌓인다.
		// next() 는 엔터입력시 엔터 입력 되기 전에 버퍼에 쌓여있는 값을 가져온다.(엔터미포함)
		// nextLIne() 은 버퍼에 엔터가 있어야 버퍼의 값을 가져온다.(엔터포함)
		
		// 파일 불러오기 (읽기) 하면 버퍼의 영향을 받을 수 도 있다.
//		next()를 이용해서 문자열 입력 받는 것이 무조건 답은 아니다.
//		필요에 의해서는 nextLine을 통해 문자열 입력 받도록 해야한다.

	}

}
