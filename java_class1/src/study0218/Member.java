package study0218;

public class Member {
	String name; //이름
	int age; //나이
	String job; //직업
	
//	Member(){
//		System.out.println("나 생성자야");
//	}
	Member(){
		this.name="박문수"; // 공간만들기
		System.out.println(this);//클래스 내부에서 this 표현
		System.out.print(false);
	}
	Member(int age, String job){
		this.age=age;
		this.job=job;
	}
	Member(int age, String job, String name){ 
		this.name = name;
		this.age = age;
		this.job =job;
		
	}
}
//	생성자 매서드
//	생성자 메서드는 자바에서 클래스정의 할때
//	기본 생성자 매서드도 같이 만들어진다.
//	눈에 보이지 않게 생략처리 된것이지 없는것은 아니다.
//	생성자 매서드는 클래스 객체 공간생성시
//	인스턴스들의 초기화를 담당하는 매서드이다.

//오버로딩 조건
//1.메서드 이름이 같아야 한다.
//2.매개변수타입이 같으면 안된다.
//3. 매개변수 갯수가 달라도 성립
//4. 하나의 클래스 내부에서만 가능하다.

//자바변수 종류
//인스턴스 변수
//지역변수
//클래스변수

// 변수 우선순위
// 지역변수 > 인스턴스 변수 >= 클래스 변수