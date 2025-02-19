package study0218;

public class ClassArray {

	public static void main(String[] args) {
		
//		Member mem = new Member();
//		mem.name="김유신";
//		mem.job="군인";
//		mem.age=38;
//		원래는, String names = new String[3];이라고 씀
		
//		String[] names = new  String[3];
		
//		Member[] members = new Member[5];//
//		//5명의 정보 저장 가능은 한데 아직...
//		for(int i=0; i<members.length; i++)
//		members[i]  = new Member();
//		
//		members[0].job="감찰관";
//		members[0].name="박문수";
//		members[0].age=34;
//		members[1].name="이순신";
//		members[1].job="군인";
//		members[1].age=31;
//		members[2].name="문익점";
//		members[2].age=45;
//		members[2].job="산업스파이";
//		
//		for(int i=0; i<members.length; i++) {
//			System.out.println(members[i].name);
//			System.out.println(members[i].job);
//			System.out.println(members[i].age);
//		}
//		
//		System.out.println(members[0].name);
//		int[] a = new int[] {1,2,3,4,5,};
//		Member info = new Member(); //생성자 메서드 호출
//		//클래스 외부에서는 참조변수로 표현
//		System.out.println(info);
//	
//		System.out.println(info.name);
//		Member m1  = new Member();
//		System.out.println(m1.name);
//		
//		Movie movie = new Movie();
//		movie.title="베테랑2";
//		movie.genre="액션";
//		movie.cnt=4000;
//		movie.year=2024;
//		
//		System.out.println("제목: " + movie.title + "장르: " + movie.genre + "관객수: "+movie.cnt+ "개봉년도: " +movie.year);
//		
		Member m1 = new Member();
		System.out.println(m1.name);
		Member info = new Member(20, "군인", "김유신");
		System.out.println(info.job);
		
		
	}

}

