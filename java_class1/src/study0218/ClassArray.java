package study0218;

public class ClassArray {

	public static void main(String[] args) {
		
//		Member mem = new Member();
//		mem.name="김유신";
//		mem.job="군인";
//		mem.age=38;
//		원래는, String names = new String[3];이라고 씀
		
//		String[] names = new  String[3];
		
		Member[] members = new Member[5];//
		//5명의 정보 저장 가능은 한데 아직...
		for(int i=0; i<members.length; i++)
		members[i]  = new Member();
		
		members[0].job="감찰관";
		members[0].name="박문수";
		members[0].age=34;
		members[1].name="이순신";
		members[1].job="군인";
		members[1].age=31;
		members[2].name="문익점";
		members[2].age=45;
		members[2].job="산업스파이";
		
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i].name);
			System.out.println(members[i].job);
			System.out.println(members[i].age);
		}
		
		System.out.println(members[0].name);
		int[] a = new int[] {1,2,3,4,5,};
		Member info = new Member(); //생성자 메서드 호출
	
		
	}

}
