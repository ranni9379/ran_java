package Java_genericTest;

public class 포스틱 extends Snack{
public 포스틱(String snackName, int price) {
	super(snackName,price);
}
@Override
public String toString() {
	return snackName +"의 가격은 "+ price+ "이다.";
}
}
