package modifier;

import inherit1.Product;//패키지가 다르므로 부모클래스에 import를 넣는다.

public class Microwave extends Product{//전자레인지

	public Microwave() {
		System.out.println(super.brand);
	}
	
	@Override
	public void power() {
		System.out.println("전자레인지 전원");
	}
	
}
