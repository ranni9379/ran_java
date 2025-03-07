package collection1;

import java.util.ArrayList;

public class MainMt {
	public static void main(String[] args) {
//		int[] a = new int [] {1,2,3,4,5};
//		
//		System.out.println(a[5]); 
//		 배열에 정수를 추가로 저장될 수 있게
		
		MyArray a = new MyArray();
		a.add(100);
		a.add(20);
		a.add(50);
		a.add(1232);
		a.add(543);
		System.out.println(a.get(2));
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(2313);
		list.add("장미란");
		list.add("포카칩");
		list.add(3.144);
		
		System.out.println(list.size()); //크기 - 데이터몇개 저장되어 있는가
		System.out.println(list.get(2));//인덱스위치의 데이터 출력
		System.out.println(list.indexOf("포카칩"));// 배열에 특정데이터 어디?
		
		list.remove(0); //  인덱스를 지정하여 해당데이터 삭제
		list.remove("포카칩");// 삭제할 데이터 입력하여 삭제
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object o :list) {
			System.out.println(o);
		}
		list.add(1, "내가 원하는 곳");
		System.out.println(list);
		System.out.println(list.contains("장미란"));// contains 존재여부
		
		 list.clear();// 배열 모두 삭제
		
		
		//int[] a=new int[3];
	}
	
	

}
/*

자바 컬렉션 프레임워크
자료구조와 알고리즘을 클래스화 시켜놓은 것
자료구조- 데이터를 저장관리하는 방법
알고리즘- 저장된 데이터를 가공하는 방법

Collection          Map
List
	ArrayList		HashMap
	LinkedList		TreeMap
	Vector(구조)			Properties
	Stack(구조)
	Queue(구조)
	Set
	HashSet
	TreeSet
Set
	HashSet
	TreeSet





*/