package collection_framework;

import java.util.HashSet;

public class Array1 {
	public static void main(String[] args) {
		String s1[]= {"a","b","c","d","a","b","b","c","a"};
		HashSet<String> h1=new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			h1.add(s1[i]);
		}
		System.out.println(h1);
		int count=0;
		for (String s : h1) {
			for (int i = 0; i < s1.length; i++) {
				if(s1[i]==s) {
					count++;
				}
				
			}
			System.out.println(s+"is a "+count+" times in the string");
			count=0;
		}
	}

}
