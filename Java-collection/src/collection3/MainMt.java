package collection3;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
	
//		ArrayList<Member> list = new ArrayList<>();
//		list.add(new Member(1l, "kmr","kmr@naver.com", "1234", "19930709"));
//		list.add(new Member(2l, "dw","dw@gmail.com", "1234", "19920520"));
//		
//		System.out.println(list);
		
		MemberDao dao = new MemberDao();
		ArrayList<Member> memberList = dao.select();
		for(Member m : memberList) {
			System.out.println(m);
		}
		
//		list.add(new Member());
//		list.get(0).setEmail("asdf");
//		list.get(0).setBirth("1231");
//		list.get(0).setMemberId("adff");
//		list.add(new Member());

	}

}
