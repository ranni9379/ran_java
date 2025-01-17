package study0117;

public class javaType {

		public static void main(String[] args) {
			
		int num=20;
		float pi=3.14f;
		
		pi=num; // 자동 형변환 -> 작은쪽(정수)에서 큰쪽(실수)으로 올 때
		num =(int)pi; // 강제 형변환 큰쪽(실수)에서 작은쪽(정수)으로 올 때 예-3.14 -> 3으로만 나오게 함 : 일시적 타입 변환
		char ch = (char)pi;
		
		}
}
