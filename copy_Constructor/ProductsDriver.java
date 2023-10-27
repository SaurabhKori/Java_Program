package copy_Constructor;
import java.util.*;
public class ProductsDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your products Shirt Or Laptop");
		//String g=sc.nextLine();
		String productn=sc.nextLine();
		switch(productn) {
		case "shirt":
		System.out.println("Enter Shirt Brand");
	//	String g=sc.nextLine();
		String brand=sc.nextLine();
		System.out.println("Enter Shirt Size");
		String size=sc.nextLine();
		System.out.println("Enter Shirt Price Range");
		System.out.println("Enter Shirt price minimum range");
		double mprice=sc.nextDouble();
		System.out.println("Enter Shirt price maximum range ");
		double mxprice=sc.nextDouble();
		Shirtdetail c=new Shirtdetail(brand,size,mprice,mxprice);
		Shirtdetail c2=new Shirtdetail(c);
		c.displayShirtDetail();
		System.out.println("<============================================================>");
		System.out.println("<============================================================>");
		c2.displayShirtDetail();
		break;
		case "laptop":
			System.out.println("Enter laptop name");
			String lname=sc.nextLine();
			System.out.println("Enter laptop ram size");
			String ram=sc.nextLine();
			System.out.println("Enter your price Range");
			System.out.println("Enter Laptop price minimum range");
			double minprice=sc.nextDouble();
			System.out.println("Enter Shirt price maximum range ");
			double maxprice=sc.nextDouble();
			Laptopdetail l=new Laptopdetail(lname,ram,minprice,maxprice);
			Laptopdetail l1=new Laptopdetail(l);
			l.displaylaptopdetails();
			System.out.println("<==========================================================>");
			System.out.println("<==========================================================>");
			l1.displaylaptopdetails();
			break;
		 default:
			 System.out.println("Not available this products ");
			
		}
	}


}
