package interface4;

public class Mainmt {

	public static void main(String[] args) {
	 RemoteCon[] rcon = new RemoteCon[] {
			 new Light(), new Tv(), new Aircon()
	 };
	 
	 for(RemoteCon con : rcon) {
		 con.turnOn();
		 con.turnOff();
	 }
	 
//int[]a =new int[]{1,2,3};
	}

}
