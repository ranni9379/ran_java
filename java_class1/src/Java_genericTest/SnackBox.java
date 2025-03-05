package Java_genericTest;

public class SnackBox<T extends Snack> {
T 과자;
public void makeBox(T 과자봉지) {
	this.과자=과자봉지;
	System.out.println(this.과자);
	System.out.println("과자 박스 만들기");
}
}
