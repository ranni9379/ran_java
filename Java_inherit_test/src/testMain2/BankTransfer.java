package testMain2;

public class BankTransfer extends Payment{
	public BankTransfer(int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("계좌이체결제 금액:" + this.money+"결제일:"+this.payDate);
	}
}
