package inherit1;

public class Product {//부모클래스
	protected boolean onOff=false; //같은패키지 이거나, 자식일 경우 해당
	protected String brand;// 브랜드
	protected int price;//가격
	protected String name;// 제품명 - LG휘센,캐리어A32 등
	
	
	public void power() {
		onOff=!onOff;
		System.out.println("전원: " +onOff);
	}
	

}
