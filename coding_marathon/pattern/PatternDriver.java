package coding_marathon.pattern;

import java.util.Scanner;

public class PatternDriver {
	public static void main(String[] args) {
		
		System.out.println("Enter your PAttern choice");
	    System.out.println("If print pattern 1---> type 1");
	    System.out.println("If print pattern 2---> type 2");
	    System.out.println("If print pattern 3---> type 3");
	    Scanner sc=new Scanner(System.in);
	    int s=sc.nextInt();
	    switch (s) {
		case 1: 
			Pattern1.pattern1(7);
			break;
		case 2: 
			Pattern2.pattern2(7);
			break;
			
		case 3: 
			Pattern3.pattern3(11);
			break;
			
			
		default:
			System.out.println("Description Dhyan se padho");
		}
	}

}
