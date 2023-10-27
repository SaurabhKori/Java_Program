package collectionframeworkProject2;

public class Shirt {
	String sname;
	String scolor;
	String size;
	int sprice;
	public Shirt() {
		
	}
	public Shirt(String sname, String scolor, String size, int sprice) {
		
		this.sname = sname;
		this.scolor = scolor;
		this.size = size;
		this.sprice = sprice;
	}
	@Override
	public String toString() {
		return "Shirt [sname=" + sname + ", scolor=" + scolor + ", size=" + size + ", sprice=" + sprice + "]";
	}
	
	
	

}
