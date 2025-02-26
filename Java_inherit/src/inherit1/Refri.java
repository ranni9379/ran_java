package inherit1;

public class Refri extends Product{ //냉장고

	@Override
	public void power() {
		onOff = !onOff;
		System.out.println("냉장고 전원 :" +onOff);
	}
}
//부모클래스가 추상메서드를 가지고 있는 추상클래스라면
//자식클래스에게 추상메서드 상속시키기 때문에
//자식클래스 추상메서드를 가지고 있는 것과 마찬가지가 된다.