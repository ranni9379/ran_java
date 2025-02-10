package study0207;

import java.util.Scanner;

public class Javatest2 {

	public static void main(String[] args) {
		/*
		 문제 4
		 * 
		 **
		 ***
		  변형) ***
		  		**
		  		* 이런식으로
		 별을 위와 같이 출력하세요
		 힌트> 첫번째 줄이라서 별한개 두번째 줄이라서 별두개 세번째 줄이라서 별 세개(이중 for문)
		4번 해설
		for(int line =1; line<=3; line++) {
		for(int star=1; star<=line; star++){
		System.out.print("*");
		}
		System.out.println();
		}
	
			
		문제 5
		0 1 2 3
		4 5 6 7
		8 9 10 11
		숫자를 위와 같이 출력하세요.(이중 for문)
		
		for(int i=0; i<=2; i++){
		for(int k=i*4; k<=(i*4)+3; k++)
		System.out.print(k+" ");
		
		System.out.println();
		}
		
		
		
		
		
		문제 6- 비밀번호 찾기
		1. 비밀번호는 4자리로 구성되어있다.
		2. 비밀번호 각각의 숫자는 1~9 중 하나이고, 중복없다.
		3. 첫번째 숫자는 네번째 숫자보다 2만큼 크다.
		4. 두번째 숫자는 세번째 숫자보다 작다.
		5. 비밀번호와 비밀번호 역순의 숫자를 더하기 하면 16566이다. 예) 1234 + 4321
		6. 위 조건을 모두 충족하는 비밀번호 출력
	 for문 4개 필요
	 for(int a=1; a<=9; a++){
	  for(int b=1; b<=9; b++){
	   for(int c=1; c<=9; c++){
	    for(int d=1; d<=9; d++)
	    if(a!=b && a!=c && a!=d && b!=c && b!=d && c!==d){
	    if(a == d+2){
	    if(b<c){ // 두번째 숫자가 세번째보다 작다
	    int pw = a*1000+b*100+c*10+d;
	    int rPw = d*1000+c*100+b*10+a;
	    if((pw+rPw) == 16566){
	     System.out.print.ln(pw);
	     break;}
	    }
	    }
	    }
	       }
	      }
	     }
	    }
	 
	 
	 
	 
	 
		 */
		
		//for문 17~150 출력 - if 짝수만 출력
	
//
//		for(int a=17; a<=150; a++) {
//			if(a%2==0)
//		System.out.println(a+"");
//		
//}
//for문 5번 반복하여 랜덤값 출력 랜덤의 범위는 1~25
//		for문 10번 반복하여 랜덤값 중 홀수만 출력

//		for(int a=1; a<=5; a++) { 
//			int b= (int)(Math.random()*25 +1);	
//			System.out.println(b+ "");
//		}
//		for(int a=1; a<=10; a++) {
//			int b= (int)(Math.random()*25+1);
//			if(b%2==1)
//				System.out.println(b+"");
//		}
		//오늘의 과제- 숫자 야구
//	 	1~9 중의 임의의 숫자 3개를 뽑아낸다.( 중복 없이- 랜덤 )
// 	변수 3개
//		3개의 숫자를 맞추기 해야한다.
//  자리와 숫자가 맞으면 스트라이크, 숫자만 맞고 자리가 다르면 볼, 숫자와 자리 모두 다르면 아웃 
//		예) 임의의 숫자 - 7 1 8
//		입력: 1 2 3
//		결과: 0스트라이크 1볼 2아웃
//		입력: 4 7 9
//		결과: 0스트라이크 1볼 2아웃
//		입력: 4 1 8
//		결과: 2스트라이크 0볼 1아웃
		
		// 문제 7. 알파벳찾기(반드시 반복문 사용해서)
//		알파벳(대문자 또는 소문자 모두 가능하게) 입력
//		입력한 알파벳이 몇번째 알파벳인지 찾기 - 반드시 for문으로
		Scanner sc = new Scanner (System.in);
		System.out.print("알파벳 입력 : ");
		char alp = sc.nextLine().charAt(0);
		//아스키 코드에서 A-64(10진수), a- 97(10진수)
		for(int i= 1; i<=26; i++) {
			if(alp==(i+64) || alp==(i+96)) {
				System.out.printf("알파벳 %c 는 %d번째 알파벳\n", alp, i);
				break;
			}
		}
		
		
		
		
		//	1~50 랜덤값 중 짝수가 5개 나올때 까지 반복 무한루프
//	int b=0, a=0;
//		while(true) {
//			
//			b= (int)(Math.random()*50+1);
//			if((b%2)==0) {
//				System.out.println(b+"");
//			    a++;
//			    if (a==5) {
//					
//					break;}
			 
	
	
		
		}
		
	}


