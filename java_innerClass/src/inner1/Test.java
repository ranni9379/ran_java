package inner1;

public class Test {

	static int count=1; //클래스 변수(정적변수): 프로그램 처음 시작 할때
	int age; //인스턴스변수: 객체를 생성할 때 쓰는 것을 인스턴스라고 함.
	A a;
	static Dog d;
	
	Test(){
		a = new A();
	}
	
	static void origin() { //클래스 메서드
		//a.view(); //인스턴스 변수는 static에서 사용불가 오류뜸
		//A bb= new A(); // 오류
		//setNum(10); // 인스턴스메서드 사용불가
	}
	// 정적 내부 클래스(static)는 static 변수끼리!
	static class Dog{
		int year;
	}
	// 인스턴스 변수는 인스턴스 변수끼리!
	void setYear(int year) {
		d = new Dog();
		d.year=year;
	}
	
	//인스턴스 내부클래스 정의: 노출시키지 않는다는 것 / 외부클래스의 객체생성해야 사용
	
	class A{
		int num;
		void view() {System.out.println("내부클래스 메서드");}
	}
	
	void innerView() {
		this.a.view();
	}
	void setNum(int num) {
		this.a.num=num; //클래스 내부에서만 노출되도록 메서드로 씀
	}
	
	
	void sum() {
		int a,b; //지역변수:
	}
	
	
}
// 내부클래스- 클래스 내부에 만드는 클래스
// 내부 클래스는 여러개의 클래스와 관계를 맺는게 아니라 하나의 클래스와
// 상속 또는 포함관계를 맺을 경우에 사용하면 효과적이다.

// 인스턴스 내부 클래스 - 외부클래스 객체를 생성하고 사용
// 정적 내부클래스(static) - 외부 클래스 객체 없이 사용가능
//			외부클래스의 static 메서드를 이용해서 객체생성 및 사용 권장
// 지역 내부 클래스- 메서드 내부에 클래스를 정의하고  
//				해당 메서드 내부에서만 사용가능
// 익명 내부 클래스- 이름 없는 클래스
//				메서드를 오버라이딩 하여 사용


/*
 
 static 변수 또는 메서드
 -> 프로그램 실행하면서 클래스가 메모리에 로드되면 공간 할당
 
 인스턴스 변수 또는 메서드
 -> new 연산자 통해 클래스의 공간을 생성해야 존재
 
 지역변수
 -> 메서드를 호출 해야 생성

 순서: static 변수 또는 메서드 -> 인스턴스변수 또는 메서드 -> 메서드호출해야 지역변수 생성
 static 변수에서는 인스턴스변수나 메서드 사용 불가
 */