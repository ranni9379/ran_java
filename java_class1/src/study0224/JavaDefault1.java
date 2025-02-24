package study0224;

public class JavaDefault1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m1 = new Member();//객체생성, 인스턴스 생성
		System.out.println(m1.name);
		
		System.out.println(m1.count);
		
		System.out.println(Member.count); //Member=> 클래스이름
		Member m2 = new Member();
		System.out.println(m2.count);
		
	}

}
