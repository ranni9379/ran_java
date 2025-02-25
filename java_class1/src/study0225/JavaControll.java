package study0225;

public class JavaControll {
// 메서드 final 기존의 원형부분이 같고 내용이 달라야 오버라이딩이다.
// 메서드에 final 하면 오버라이딩이 안된다.
// 오버로딩은 새로운 메서드를 정의하는 것이고 final 적용이 안되는 것이다.
// 클래스가 다르면 오버로딩이 안됨. 클래스내부에서만 가능
// 오버라이딩은 기존의 메서드를 내용만 재정의 하는 것이다.
// 그래서 final 붙어있는 메서드는 변경될 수 없기에 오버라이딩 불가
	final void sum(int a, int b) {
		System.out.println("내가 sum이다");
	}
	void sum(int a) {
		int tot = a+20;
		System.out.println("아니야 내가 sum이야");
		
	}
	
//	void sum(int b, float c)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int year =2025; //year변수의 값 변경불가
//		 year =222; // 변경 불가
		
		Movie m = new Movie();
//		private 제어자 붙은 변수에 데이터저장은
//		생성자메서드를 사용해서 변수 초기화
		
	
		
	}

}
/*
  자바 클래스 제어자
  final - 변한지 않는, 변경되지 않는 변수, 메서드, 클래스
  
  static- 클래스의, 공통적인 이라는 의미로 사용 된다.
  		모든 객체(인스턴스)들이 공통으로 사용할 수 있는 변수 또는 메서드
  		
  abstract - 추상적인	
  		클래스, 메서드 사용
  		추상 메서드를 가지고 있는 클래스는 추상 클래스가 되어야 한다.
  		추상 클래스는 객체 생성 불가(크기를 몰라서)
  		
  접근 제어자- public,default,protected,private
  public - 자바 프로그램 어디서든 사용 가능(패키지가 다른 경우 import)
  default - 같은 패키지에서만 사용가능		
  protected - 같은 패키지에서 사용가능, 
  			상속된 경우에는 패키지가 달라도 사용가능
  private - 오직 클래스 내부에서만 사용가능			
  
  
  인스턴스 변수 - 객체  생성시 생성되는 변수 또는 메서드 new클래스명();
  
  클래스 변수- static 제어자 붙는 변수 또는 메서드 프로그램 실행시- 클래스 로드 하고 나서
  
  지역변수- 메서드내부 변수, 제어문 내부변수->{} 블럭 안에 선언하는 변수
	    메서드 제어문 호출 시 할당되는 변수
  
  
 */
 