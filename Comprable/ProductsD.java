package Comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ProductsD {
	public static void main(String[] args) {
		Set<Products> s=new LinkedHashSet<Products>();
		s.add(new Products("Laptop", "black", 198999232));
		s.add(new Products("Laptop bag", "grey", 76782));
		s.add(new Products("pen", "aqua",991232));
		s.add(new Products("bag", "gray", 881232));
		s.add(new Products("book", "black", 128832));
		s.add(new Products("chair", "red", 33331232));
		s.add(new Products("table", "yellow", 441232));
		s.add(new Products("Mobile", "blue", 4421232));
		s.add(new Products("Pencile", "skyblue", 941232));
		s.add(new Products("Cooler", "brown", 93281232));
		s.add(new Products("Fan", "violet", 32991232));
		List<Products> l=new ArrayList<Products>();
		l.addAll(s);
		Collections.sort(l);
		for (Products products : l) {
			System.out.println(products);
		}
		
		}
	}


