package collection;

//import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;

public class AddRemovemethods {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(20);
		c1.add(30);
		c1.add(40);
		
		Collection c2=new ArrayList();
		c2.add(49);
		c2.add(58);
		c1.addAll(c2);
		
		System.out.println(c1);
		c1.remove(20);
		System.out.println(c1);
		
		c1.removeAll(c2);
		System.out.println(c1);
		System.out.println(c1.contains(40));
		
	}
	
	
	

}
