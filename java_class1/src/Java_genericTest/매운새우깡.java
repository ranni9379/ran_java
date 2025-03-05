package Java_genericTest;

public class 매운새우깡 extends Snack{
	public 매운새우깡(String snackName, int price) {
		super(snackName,price);
	}
	@Override
	public String toString() {
		return snackName +"의 가격은 "+ price+ "이다.";
	}
}
