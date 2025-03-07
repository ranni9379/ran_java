package collection3;

import java.util.ArrayList;
import java.util.Collections;

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
		
		// 이메일로 아이디와 비밀번호를 조회 하기!
		 String email = "brown@gmail.com";
		 for(Member mem : memberList) {
			 if(mem.getEmail().equals(email)) {
				 System.out.println(mem.getMemberId());
				 System.out.println(mem.getPassword());
				 break;
				  }
			 }
		 //타입에 대해서도 비교하기 때문에 동일한 타입으로 비교할 수 있게
		 //email은 String 클래스 타입이라 안된다. 그래서 Member 클래스 객체에  
		 //email을 담아서 비교 되게 한다.
		 
		 Member 대상 = new Member();
		  대상.setEmail("red123@naver.com");
		 
		 for(int i=0; i<memberList.size()-1; i++) {
			 Member cmp = memberList.get(i);
			 if(cmp.equals(대상)) {
				 System.out.println("찾았따");
			 }
		 }
//		 System.out.println(memberList.contains(대상));
		 
		 // memberList에 등록된 사람들 중에서
		 // 장은호 생년월일 과 같은 회원 있나??
		 // 장은호와 같은회원있나??
		 Member 장은호 = new Member();
		 장은호.setBirth("19901221");
		 장은호.setEmail("babo@daum.net"); 
		 장은호.setMemberId("kkk1");
		 
		 for(int i=0; i<memberList.size()-1; i++) {
			 Member cmp = memberList.get(i);
			 if(cmp.equals(장은호)) {
				 System.out.println("찾았따");
			 }
		 }
		 
		 System.out.println(memberList.contains(장은호));
		 System.out.println(memberList.indexOf(장은호));
		 
		 System.out.println("apple".compareTo("cat"));
		 // 오름차순으로 compareTo로 호출하여 정렬할 때, 
		 // 양수이면 바꾸고, 음수이면 안바꾼다. 0이면 안바꾼다.
		 // 음수인 것을 양수로 바꾸려면 큰것에서 작은걸 빼거나 -1를 곱한다! 
		 
		 Collections.sort(memberList);
		 for(Member m : memberList) {
		 System.out.println(m.getId()+ " " + m.getBirth()+" "+m.getAge());	 
		 }
		
		 
		 
//		System.out.println(memberList.contains(email));
//		list.add(new Member());
//		list.get(0).setEmail("asdf");
//		list.get(0).setBirth("1231");
//		list.get(0).setMemberId("adff");
//		list.add(new Member());

	}

}
