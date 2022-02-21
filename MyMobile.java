package week1.day2;
public class MyMobile {
	short num =12345;
	int billAmt = 1258977895;
	long bamt = 1415151444444413858L;
	float amt = 10000000555555555555555555.4545454555555555555F;
	double txtamt = 12222145444444444444444444.2245444444544444448787875454;
	char txt = 'T';
    String msg = "Thank you for the Payment";
	public void makeCall()
	{
		System.out.println("We can Make Call");
	}
	public void sendMsg()
	{
		System.out.println("Send Message:"+msg);
	}
	private void payBill()
	{
		System.out.println("Paying Bill:"+num);
	}
	public void printVal()
	{
	   System.out.println("billAmt:"+billAmt+",bamt:"+bamt+",amt:"+amt);
	}
	public static void main(String[] args) {
		MyMobile objmob = new MyMobile();
		objmob.makeCall();
		objmob.sendMsg();
		objmob.payBill();
		objmob.printVal();
	}
}
