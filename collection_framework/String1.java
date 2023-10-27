package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class String1 {
	public static void main(String[] args) {
		String s1="Sau34ghh38kje";
		List<Character> l1=new ArrayList<Character>();
		for(int i=0;i<s1.length();i++){
			l1.add(s1.charAt(i));
			
	
		}
		System.out.println(l1);
//		s1="";
		for (Character c : l1) {
			if(!(c>=48&&c<=58)) {
				 System.out.print(c);
			}
			
		}
		
		System.out.println();
//		System.out.println();
		System.err.println("------------------------------------------------");
		for (Character c : l1) {
			if(c>=48&&c<=58) {
				 System.out.print(c);
			}
			
		}
		System.out.println();
//		System.err.println("--------------------------------------------");
		int sum=0;
		for (Character c : l1) {
			if(c>=48&&c<=58) {
	
				 sum=sum+(c-48);
			}
			
		}
		System.out.println(sum);
	
	}

}
