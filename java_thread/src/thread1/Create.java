package thread1;

public class Create extends Thread{
	
	public static Dino egg=null; // 모든 객체가 사용할 수 있는 변수
	
	public static void hatch(Dino dino) {
		egg = dino;
	}

	@Override
	public void run() {
		Dino myEgg =null; //지역변수
		while(true) {try {
			Thread.sleep(100);}catch(Exception e) {}
		// egg에 값이 들어오고 myEgg에 null 인경우에는 공룡알 부화 시작안한 상태
		// egg에 값 이 들어왔지만 myEgg변수가 값을 가진 경우는 부화 시작 한 상태
		if(egg  != null && myEgg ==null) {
				myEgg=egg; //run서드 내부 변수에 값전달 
				egg=null;// 값 전달 했으니까 다시 null
				System.out.println(egg.getName()+"부화 시작");
				try {
				Thread.sleep(egg.getTime()*1000);}
				catch(Exception e) {}
				System.out.println(egg.getName()+"공룡 태어남");
				egg=null;
			}
		}
	}
}

//스레드에서 처음 실행되는 메서드가 run이다.
// 즉, run 메서드가 종료되면 스레드 사라짐
