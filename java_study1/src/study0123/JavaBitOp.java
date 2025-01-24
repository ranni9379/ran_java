package study0123;

public class JavaBitOp {

	public static void main(String[] args) {
		// 비트 논리 연산자
		System.out.println(27 & 13); // and 연산 둘다 1=>1 하나라도 0이면 => 0 곱하기 생각
		System.out.println(27 | 13); // or 연산 하나라도 1이면 => 1  
		System.out.println(27 ^ 13); // xor 연산 같은 것끼리 연산하면 => 0 다르면 =>1
		System.out.println(~13); //not 연산
		System.out.println(~-13);
		
		// 비트 쉬프트 연산자
		System.out.println(21 << 2); // <<시프트 연산자
		System.out.println(17 >> 3); // >>시프트 연산자

	}

}
