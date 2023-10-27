package collection_framework;

import java.util.HashSet;

//Take a String and perform below operations
//each character how many time in String;
public class String2 {
	public static void main(String[] args) {
		String s1="anaaanffiriioo";
		HashSet<Character> h1=new HashSet<Character>();
		for(int i=0;i<s1.length();i++) {
			h1.add(s1.charAt(i));
		}
		System.out.println(h1);
		int count=0;
		for (Character c : h1) {
			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i)==c) {
				count++;
				}
				
			}
			
			System.out.println(c+" is a "+count+" times in the string");	
			count=0;
		}
			
	}
		

}
