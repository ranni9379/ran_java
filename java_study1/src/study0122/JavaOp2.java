package study0122;

public class JavaOp2 {

	public static void main(String[] args) {
		
		// 증감 연산자  ++, --
		
		int a =10, b=10, result=0;
		// ++ 
		System.out.println(" ++ 전 :" + a);
		a++; //a=a+1
		System.out.println(" ++ 후 :" + a);
		
		++a;
		System.out.println(" ++a : " + a);
// 증감연산자의 위치가 변수앞, 변수뒤 차이
		a=10;
		// 우선순위에 따라 달라짐 
		// ++ 뒤에 있으면 대입연산자 보다 우선순위가 낮음 result a 다음 a++1 -> 나중증가
        // ++ 앞에 있으면 대입연산자 보다 우선순위가 빠름 ++b 증가된 이후에 result b에 저장됨 -> 우선증가
		result = a++; 
		System.out.println( " result  = a++ :" + result);
		result = ++b;
		System.out.println(" result = ++b :" + result);
		
		// 증감연산자를 변수 앞에 붙이면 우선순위가 상위권
		// 증감 연산자를 변수 뒤에 붙이면 우선순위가 하위권
	
	}

}
