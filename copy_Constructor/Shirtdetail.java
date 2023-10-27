package copy_Constructor;

public class Shirtdetail {
	String brand;
	String size;
	double mprice;
	double mxprice;
	Shirtdetail(){
		
	}
	Shirtdetail(String brand,String size,double mprice,double mxprice){
		this.brand=brand;
		this.size=size;
		this.mprice=mprice;
		this.mxprice=mxprice;
		
	}
	public void displayShirtDetail() {
		System.out.println("Shirt brand name--> "+brand);
		System.out.println("Shirt size--------> "+size);
		System.out.println("Shirt Range-------> "+mprice+"---"+mxprice);
		
	}
	Shirtdetail(Shirtdetail s){
		this.brand=s.brand;
		this.size=s.size;
		this.mprice=s.mprice;
		this.mxprice=s.mxprice;
	}
	

}
