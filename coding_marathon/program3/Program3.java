package coding_marathon.program3;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int mul=a*b;
		System.out.println(sum);
		System.out.println(mul);
		sum=Program3.removeEvenDigits(sum);
				mul=Program3.removeEvenDigits(mul);
		System.out.println(sum);
		System.out.println(mul);
		
	}
	public static int removeEvenDigits(int n) {
		  int result = 0;
		  int power = 0;
		  while (n != 0) {
		    int digit = n % 10;
		    if (digit % 2 == 1) {
		      result += digit * Math.pow(10, power);
		      power++;
		    }
		    n /= 10;
		  }
		  return result;
		}

}
