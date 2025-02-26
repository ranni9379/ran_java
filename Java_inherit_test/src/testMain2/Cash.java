package testMain2;

public class Cash extends Payment{
	public Cash(int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("현금 결제 금액:" + this.money+"결제일:"+this.payDate);
	}
}
