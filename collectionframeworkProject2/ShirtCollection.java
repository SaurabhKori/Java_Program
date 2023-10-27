package collectionframeworkProject2;

import java.util.HashSet;

public class ShirtCollection {
	public static void main(String[] args) {
		HashSet<Shirt> s1=new HashSet<Shirt>();
		s1.add(new Shirt("Tommy Hilfiger","red","L",1500) );
		s1.add(new Shirt("Tommy Hilfiger","black","m",1800) );
		s1.add(new Shirt("Tommy Hilfiger","yellow","s",1900) );
		s1.add(new Shirt("Tommy Hilfiger","green","L",3500) );
		s1.add(new Shirt("Tommy Hilfiger","sky-blue","s",3000) );
		s1.add(new Shirt("Tommy Hilfiger","red","m",2500) );
		s1.add(new Shirt("Arrow","red","L",1500) );
		s1.add(new Shirt("Arrow","black","m",1800) );
		s1.add(new Shirt("Arrow","yellow","s",1900) );
		s1.add(new Shirt("Arrow","green","L",3500) );
		s1.add(new Shirt("Arrow","sky-blue","s",3000) );
		s1.add(new Shirt("Arrow","red","m",2500) );
		s1.add(new Shirt("Allen Solly","red","L",1500) );
		s1.add(new Shirt("Allen Solly","black","m",1800) );
		s1.add(new Shirt("Allen Solly","yellow","s",1900) );
		s1.add(new Shirt("Allen Solly","green","L",3500) );
		s1.add(new Shirt("Allen Solly","sky-blue","s",3000) );
		s1.add(new Shirt("Allen Solly","red","m",2500) );
		for (Shirt s : s1) {
			System.out.println(s);
		}

		System.err.println("----------------------------------------------------------------");
//		Access all the shirt which of color black
		for (Shirt s : s1) {
			if(s.scolor=="black") {
				System.out.println(s);
			}
			
		}
		System.out.println();
		System.out.println();
//		Access all the shirt which price range 1500-30000
		System.err.println("----------------------------------------------------------------");
		for (Shirt s : s1) {
			if(s.sprice>=1500 && s.sprice<=3000) {
				System.out.println(s);
			}
		}
		System.out.println();
		System.out.println();
		System.err.println("------------------------------------------------------------------");
//		Acess all the Shirt with brand name Arrow
		for(Shirt s: s1) {
			if(s.sname=="Arrow") {
				System.out.println(s);
			}
		}
//		Acess all the Shirt Allen Solly which color red;
		for(Shirt s:s1) {
			if(s.sname=="Allen Solly"&& s.scolor=="red") {
				System.out.println(s);
			}
		}
//		Access all the Shirt which of black
	}

}
