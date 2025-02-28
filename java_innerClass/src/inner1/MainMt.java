package inner1;

public class MainMt {

	public static void main(String[] args) {
	 // Test.A a = new Test.A(); 오류
		Test t = new Test();
		
		t.setNum(10); //
		t.innerView();
		
		t.a.num=10; // 내부클래스가 노출되므로 이렇게 쓰면 안됨!
		t.setYear(100);
//		Test.A a = t.new A();//외부클래스 객체. 내부클래스 객체 A(); 이렇게 만들어야 함.
//		a.num=10;
//		a.num=20;
		
		//정적 내부클래스를 굳이 노출 하면서 객체를 만들고자 한다면 
		Test.Dog dog = new Test.Dog();
		
		Test.origin();// 클래스 메서드 실행은 객체 없이 가능

	}

}
