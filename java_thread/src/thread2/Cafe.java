package thread2;

public class Cafe {
private Order order;
private boolean orderPlace = false; // 주문 했나(true) 안했나(false)

public  synchronized void placeOrder(String menu) throws InterruptedException { // 매장에서 먹기
	while(orderPlace) {
		wait();
	}
	order=new Order(menu);
	System.out.println("손님 매장주문 : " + order.getOrderId()+ " - " + order.getMenu());
	orderPlace = true; // 주문했을때
	notify();// 주문이 들어갔으니까 바리스타를 실행
}
//public void takeOrder(String menu) { // 포장해 가기
//	order= new Order(menu);
//	System.out.println("손님 포장 주문 : " + order.getOrderId() + " - " + order.getMenu());
//}

public synchronized Order give() throws InterruptedException {
	while( !orderPlace ) {
		wait(); // 주문이 들어오기 전까지 바리스타는 대기
	}
	orderPlace=false;
	notify();
	return order;
}

}


//동기화 : 속도를 맞추는것 - synchronized give() 주는 것 메서드와 함께 A 스레드와  다른 스레드의 상태변화가 필요할 때 사용한다!
//비동기화: 속도를 맞추지 않는것