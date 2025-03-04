package innerTest;

public class MainMt {

	public static void main(String[] args) {
		//Job 클래스를 이용해 익명클래스 다루기
		// 익명클래스 객체를 통해 직업을 입력하고
		//myJob메서드 실행하여 내 직업 출력
		
		Job j =new Job(){
			@Override
			public void myJob() {
				System.out.println(JobName);
			}
		};
		j.JobName="웹프로그래머";
		j.myJob();
		
		// Work 인터페이스를 이용해 익명클래스 다루기
		// working 메서드를 실행하여
		// 내가 하는 일 출력하기
		
		Work w = new Work() {
			@Override
			public void working() {
				System.out.println("게시판 CRUD 구현");
			}
		};
		w.working();
	}

}
