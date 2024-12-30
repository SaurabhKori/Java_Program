package stream_api;

public class Product {
  int sno;
  String pname;
  float price;
public Product(int sno, String pname, float price) {
	super();
	this.sno = sno;
	this.pname = pname;
	this.price = price;
}
@Override
public String toString() {
	return "Product [sno=" + sno + ", pname=" + pname + ", price=" + price + "]";
}
  
}
