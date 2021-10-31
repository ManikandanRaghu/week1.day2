package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		
		MyMobile objmob = new MyMobile();
		System.out.println("Mobile Brand name is: "+objmob.brandname);;
		System.out.println("IMEI number of the mobile is: "+objmob.IMEI);
		System.out.println("Coor of the mobile is: "+objmob.color);
		objmob.makecalls();
		objmob.getsms();
		//objmob.paybills(); //Private method
		

	}

}
