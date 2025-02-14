package study0214;

import java.util.Scanner;

public class JavaTest1 {

	public static void main(String[] args) {

		
		// 문제 1.
//		학생 5명의 시험성적을 키보드를 통해 입력받고
//		평균 점수를 구하여 출력하세요.
//		반드시 시험성적은 배열에 저장 !!!
		
		Scanner sc = new Scanner(System.in);
				
//		int[] score = new int[5];
//		
//		int total=0, avg=0;// 총합과 평균 변수
//		
//		int[] arr = new int[5]; 		
//		for(int i=0; i<score.length; i++) {System.out.println((i+1)+" 번째 학생 시험 성적 : ");
//		score[i]=sc.nextInt();
//		total = total+score[i]; //총점 구하기
//		}
//		avg= total/score.length;	
//		
//		System.out.println("학생들의 평균 점수 : "+ avg);
//		
		
		// 문제 2.
		// 알파벳 문자 하나를 입력하세요.
		// 입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요.
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		};
		
		System.out.println("알파벳 입력: ");
		char alp = sc.nextLine().toLowerCase().charAt(0);
		
		// 알파벳을 무조건 소문자로 변환
//		
		int total=0;
	
		for(String str: word) {
			if(str.charAt(0) == alp ) {
				System.out.println(str); total++;
			}
			
		}
		System.out.println("총 단어 갯수:" + total);
		
		// 문제3. 
/*
 영화관 예약 사이트를 만들려고 한다.
 영화관에 관별로 좌석수가 다르다.
 3관의 좌석수는 96개(8줄 12열)이다.
 
 좌석에 예약완료 된 곳은 1로 표시
 비어있는 좌석은 0으로 표시
 
 몇명 예약할 것인지 인원 수를 입력하면
 연속적으로 비어있는 자리를 지정해준다.
 몇 번째 좌석에 예약이 되어있는지 출력(인덱스 출력)
 
 
  */
	

	}

}
