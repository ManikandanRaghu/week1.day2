package week1.day2;

public class MyMobile {
	
	String brandname="Samsung";
	int IMEI=856932147;
	String color="Black";
	
	public void makecalls()
	{
		System.out.println("Call is made");
	}
	
	public void getsms()
	{
		System.out.println("SMS is sent");
	}
	
	private void paybills()
	{
		System.out.println("Bill could not be accessed by anyother");
	}
		

	public static void main(String[] args) {
		
		MyMobile mobobj = new MyMobile();
		System.out.println("Mobile Brand name is: "+mobobj.brandname);;
		System.out.println("IMEI number of the mobile is: "+mobobj.IMEI);
		System.out.println("Coor of the mobile is: "+mobobj.color);
		mobobj.makecalls();
		mobobj.getsms();
		mobobj.paybills();
		
	}

}
