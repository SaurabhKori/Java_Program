package collection_framework;

import java.util.ArrayList;
import java.util.Collection;

import recurcion_Progrma_topic1.Reverse;
//import method.*;

//import recurcion_Progrma_topic1.Reverse;


public class FindTheTypeOfNumber {
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(1221);
		c.add(23);
		c.add(24);
		c.add(26);
		c.add(131);
		c.add(7);
		findThenumberOftype(c);
//		System.out.println(findThenumberOftype(c));
		
		
	}
	public static void findThenumberOftype(Collection c) {
		
		for (Object a : c) {
			  int b=(Integer)a;
			  int r=b;
			  
			  int rev=0;
			    int rem=0;
			    while(b!=0)
			     {
			      rem=b%10;
			      rev=rev*10+rem;
			      b/=10;
			      }

			    
			    if(r==rev) {
			    	System.out.println(r+"--is Palindrome---"+rev);
			    }
			    
			     
       
	}
		
//    System.out.println(b);
	}
}
