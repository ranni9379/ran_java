package study0117;

public class javaType {

		public static void main(String[] args) {
			
		//int num=20;
		//float pi=3.14f;
		
		//pi=num; // 자동 형변환 -> 작은쪽(정수)에서 큰쪽(실수)으로 올 때
		//num =(int)pi; // 강제 형변환 큰쪽(실수)에서 작은쪽(정수)으로 올 때 예-3.14 -> 3으로만 나오게 함 : 일시적 타입 변환
		//char ch = (char)pi;//
		
		
		int a=2;
		
		int 한개피단축 =2; //2분 - 분단위
		int 일년 =365;
		int 흡연기간 =20;
		int 하루담배 =5; // 하루에 5개피씩 매일 흡연
		
		int 단축수명 = 하루담배 * 한개피단축 * 일년 * 흡연기간;
		int 단축수명시간 = 단축수명/60;
		int 단축수명일 = 단축수명시간/24;
		
		System.out.println("총 단축시간(분): " + 단축수명);
		System.out.println("총 단축수명(시간) :" + 단축수명시간);
		System.out.println("총 단축수명(일):" + 단축수명일);
		
		
		
		}
}
