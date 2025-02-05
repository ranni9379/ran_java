package study0205;

import java.util.Scanner;

public class javaLoop2 {
	//자바변수 종류
	// 지역변수, 클래스변수(static), 인스턴스변수
	
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i=1;
		for(int k=2; k<=9;) {
			System.out.println(k+"*"+i+"="+(k*i));
			i++;
			if(i==10) {
				k++;
				i=1;
			}
		}
		
		
//		for(int k=2; k<=9; k++) {
//			for(int i=1; i<=9; i++) {
//		System.out.println(k+"*"+i+"="+(k*i));
//		}}
		
//		for(int i=1; i<=9; i++) {
//		System.out.println(3+"*"+i+"="+(3*i));}
//		
//		for(int i=1; i<=9; i++) {
//		System.out.println(4+"*"+i+"="+(4*i));}
//		
		
		
		
//		for(int i=1; i<=2;
//				i++) {
//			System.out.println("변수 i 사용반복문"+ i);
//		for(int k=1; k<=3; k++) {
//			System.out.println("변수 k 사용" +k);
//		}	
//		}
		
//		int num=0;
//		for(;num!=100;) {
//			System.out.println("정수입력:");
//			num = sc.nextInt();
//		}
		// for(;;), for(; true;), for(;num!=0;) //for문 무한루프
//		while(true) {
//			
//		} => while문 무한루프
//		for(; true ;) { //for문 무한루프
//		System.out.print("정수입력:");
//		int num =sc.nextInt();
//		if(num == 0) return;// 무한 루프의 종료시점 정하기 if문과 break로
		
//		}
		// break는 해당 제어문(반복문, switch)을 종료 시키기만 한다.
		// return은 매서드를 종료
//		System.out.print("무한루프 종료 되었습니다.");
//		for(int i=1; true; i++) {
//			System.out.println(i);
//		}
		// 10부터 100까지의 총합을 구하세요.
		// 단, 10단위의 숫자만 계산(10,20,30,40,50,60,70,80,90,100)
		
//		int total = 0;
//		for(int i=10; i<=100; i=i+10) {
//			total += i; //total= total i;
//		}
//		System.out.println(total);
//	
		
//		for(초기값;조건식;증감식) {
//			반복내용
//		}
//	초기값=> 조건식비교-> 참이라면 ->{내용}-> 증감식
//			-> 조건식비교 -> 참이라면 -> {내용} -> 증감식
//			-> 조건식비교 -> 참이라면 -> {내용} -> 증감식
//			-> 조건식비교	-> 거짓이라면 -> 종료
	}

}
