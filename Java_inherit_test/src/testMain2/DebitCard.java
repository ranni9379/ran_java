package testMain2;

public class DebitCard extends Payment{
public DebitCard(int m, String date) {
	super(m,date);
}
@Override
public void processPay() {
	System.out.println("체크카드 결제 금액:" + this.money+"결제일:"+this.payDate);
}
	
}
