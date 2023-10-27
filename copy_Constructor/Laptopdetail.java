package copy_Constructor;

public class Laptopdetail {
	String lname;
	String ram;
	double minprice;
	double maxprice;
	Laptopdetail(){
		
	}
	Laptopdetail(String lname,String ram,double minprice,double maxprice){
		this.lname=lname;
		this.ram=ram;
		this.minprice=minprice;
		this.maxprice=maxprice;
		
	}
	Laptopdetail(Laptopdetail lap){
		this.lname=lap.lname;
		this.ram=lap.ram;
		this.minprice=lap.minprice;
		this.maxprice=lap.maxprice;
	}
	public void displaylaptopdetails() {
		System.out.println(" laptop name---------> "+lname);
		System.out.println(" lapt ram------------> "+ram);
		System.out.println(" laptop Price Range--> "+minprice+"--"+maxprice);
	}
}
