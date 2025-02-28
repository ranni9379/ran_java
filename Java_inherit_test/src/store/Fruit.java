package store;

public abstract class Fruit { // 부모 클래스- 추상클래스
    protected int cost; // 판매 금액
    protected int capacity;// 용량
 // 상속- 부모클래스에 final를 붙이면 부모클래스로 되지 못한다. final의 뜻은 변하지 않는다. 
    protected Fruit() {}
    protected Fruit(int c, int cp) {
    	this.cost=c;
    	this.capacity= cp;
    }
	
	public abstract void makeJuice();// 과일주스 만들기
	public abstract void pieceFruit();//과일 소량 컵에 팔기
	
	// 부모클래스가 가지고 있는 메서드 중 자식이 변경 안되게 할 메서드가 있다면 
	// public final void makeJuice(){}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
