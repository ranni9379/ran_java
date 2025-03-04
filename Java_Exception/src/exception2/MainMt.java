package exception2;

public class MainMt {

	public static void main(String[] args) {
		
//		int[] arr = new int[] {1,2,3,4};
//		try {
//		System.out.println(arr[8]);
//		} catch(Exception e) {
//			System.out.println("인덱스 범위 벗어남");
//			e.printStackTrace();
//		}
		
		try {
		String name=null;
		
		if(name!=null || name.equals("이순신")) {
			System.out.println("이순신이다.");
		}else {
			System.out.println("아니다");
		}
		}catch(Exception e) {
			System.out.println("이름입력 해라!");
		System.out.println(e.getMessage());
		}
	}

}
// 참조변수 선언, 입력, 계산, 인덱스일때 예외처리 됨.