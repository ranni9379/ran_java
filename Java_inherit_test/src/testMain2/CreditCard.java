package testMain2;

public class CreditCard extends Payment {
	public CreditCard(int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("신용카드 결제 금액:" + this.money+"결제일:"+this.payDate);
	}
}
