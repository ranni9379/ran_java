package testMain2;

public  abstract class Payment {
	protected int money;
	protected String payDate;
	
	protected Payment() {}
	protected Payment(int m, String date) {
		this.money=m;
		this.payDate=date;
	}
	public abstract void processPay();

}
