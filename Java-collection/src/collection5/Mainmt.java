package collection5;

import java.util.LinkedList;
import java.util.Stack;

public class Mainmt {

	public static void main(String[] args) {
		
		//Java에서 LinkedList는 index 없음.
		//삭제,추가를 할것인지에 따라 ArrayList: 데이터 추가하면 공간이 계속생김 
	
//		LinkedList<String> list = new LinkedList<>();
//		list.add("틀린그림찾기");
//		list.add("벽돌꺠기");
//		list.add("슈퍼마리오");
//		
//		
//		list.contains("고인돌");
//		list.indexOf("벽돌깨기");
//		System.out.println(list.get(1));
		
		
		// 스택 - FILO 구조이다. // First In Last Out
		// 웹 브라우저 히스토리, 계산기, 메서드 호출 등등
		Stack<String> stack = new Stack<>();
		stack.add("김춘추");
		stack.push("이순신");
		stack.push("이성계");
		stack.push("홍길동");
		stack.push("김석진");
		stack.push("이정훈");
		stack.push("김미란");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);//최근에 있는것을 내보내기
		stack.pop();
		System.out.println(stack);
		
		stack.
		

	}

}
