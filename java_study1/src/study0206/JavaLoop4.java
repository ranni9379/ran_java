package study0206;

import java.util.Scanner;

public class JavaLoop4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// do while 반복문의 연결식과 조건식의 연결식이 연관 되어 있을 때 사용
		int user=0;
		do {
		System.out.println("1. 가위 2. 바위 3. 보 :");
		user = sc.nextInt();
//		if(user >=1 && user <=3) break;
		}while(!(user>=1 && user <=3));
		System.out.println("가위바위보 진행");
//		int a=100;
//		do {
//			System.out.println("do~whil문");
//			a++;
//		}while(a<15);
		// 초기값 -> {내용} -> 조건식 비교 -> 참이면 -> {내용}
//		int i=1;
//		while(i <=3) {
//			int k=1;
//			while(k <=2) {
//				System.out.println("i= "+i+" k="+k);
//				k++;
//			}
//			i++;
//		}
//	 for(int i=1; i<=3; i++) {
//		 for(int k=1; k<=2; k++) {
//			 System.out.println("i= "+i+" k="+k);
//		 }
	 }

	}


