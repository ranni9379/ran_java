package interface5;

public class Mainmt {

	public static void main(String[] args) {
	// 부모클래스는 변수만 제공 기능을 제공할려면 인터페이스 사용
		 CRUD member = new MemberService();
		 CRUD board = new BoardService();
		 
		 member.save();
		 
		 DBConnect mem = new MemberService();
		 //mem.save(); // 부모클래스인 DBConnect에는 save 메서드가 없다.
	}

}
