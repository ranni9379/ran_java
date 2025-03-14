package thread2;

public class Barista implements Runnable{
	private final Cafe cafe; //초기화 단계 final단계 상수로 전환   // 바리스타가 일하는 카페
	
	public Barista(Cafe cafe) {// 바리스타가 일하는 카페를 넣어줘야 주문을 받지!! //생성자 메서드 초기화 가능!
		
		// 초기화 3가지 방법
		// 1. 명시적 초기화: 변수선언과 동시에 값을 설정하는 것, 2. 생성자 메서드:ex) this.cafe=cafe; 
		// 3. 초기화 블럭: cafe= new Cafe();
		this.cafe =cafe; // 생성자 메서드
	}
	

	@Override
	public void run() {
		try {
		while(true) {
			Order order = cafe.give();
			System.out.println(" 바리스타 제조 : " +  order.getOrderId()+" - " + order.getMenu());
			Thread.sleep(3000);// 그냥 주만 시간 설정만 한거 nullpointer와 상관없음
			
			System.out.println(" 바리스타 제조 완료 : " + order.getMenu());
		}
	}catch(InterruptedException e) {
		e.printStackTrace();
	  }
     }	
	}


