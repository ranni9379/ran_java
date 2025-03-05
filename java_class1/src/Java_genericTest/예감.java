package Java_genericTest;

public class 예감 extends Snack{
public 예감(String snackName, int price) {
	super(snackName,price);
}
@Override
public String toString() {
	return snackName +"의 가격은 "+ price+ "이다.";
}


}
