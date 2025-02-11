package study0211;

import java.util.Arrays;
import java.util.Collections;

public class JavaArray3 {

	public static void main(String[] args) {
	
//		int[] number = new int[] {10,20,30,44,55,66,100,2323};
//		
//		for( int num : number ) {
//			System.out.println(num);
//		}
// 배열의 인덱스 사용불가
// 배열의 데이터를 변경하거나 삭제 불가
		
		
		// 문제 
		// tall 배열은 A반 학생들의 키를 저장한 것이다.
		// A반의 평균키이상 큰 키를 찾아서 출력하세요.
//		float[] tall = new float[] {167.2f, 163.4f, 175.7f, 173.8f, 158.3f};
//		
//		float avg = 0, sum=0;
//		for(float t: tall) {
//			sum= sum+t;
//			}
//		avg= sum/tall.length;
//		
//		for(float t : tall) {
//			if(avg <=t)
//				System.out.println(t);
//		}
		
//		배열 관련 메서드
		
		int[] num = new int[] {10, 20, 30, 40, 50, 60, 70};
		System.out.println(Arrays.toString(num));
//		자바에서 데이터 출력 메서드이름은 toString
		
		int[] a = new int[7];
		System.out.println(Arrays.toString(a));
		
		// 배열 복사
		// arraycopy(복사배열, 복사배열시작인덱스, 저장배열, 저장시작인덱스, 크기(몇개저장));
		System.arraycopy(num, 0, a, 0, num.length);
		System.out.println(Arrays.toString(a));
		
		// 배열 비교
		boolean isSame = Arrays.equals(num, a);
		System.out.println(isSame);
	
		// 배열 정렬
		int [] arr = new int[] {575, 48, 29, 17, 9, 2334,73,90,123};
		System.out.println("=== 정렬전 ===");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println("=== 정렬후 ===");
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr2 = {5,4,1,2,3};
		Arrays.sort(arr2 , Collections.reverseOrder());
		// comparator 구현 필요
		
		String[] names = {"이순신", "이성계", "김춘추", "정약용", "문익점"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, Collections.reverseOrder());// 내림차순은 클래스타입으로 함.
		System.out.println(Arrays.toString(names));
	}
	
	

}
