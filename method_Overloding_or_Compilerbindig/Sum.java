package method_Overloding_or_Compilerbindig;

public class Sum {
  
  
   public void Sumoftwonum( int num1,int num2) {
    System.out.println("Sum of two integer---->  "+(num1+num2));


}
   public void Sumoftwonum(int num1,double num3) {
	    System.out.println("Sum of one integer and one double---->  "+(num1+num3));


	}
   public void Sumoftwonum(double num3,int num2) {
	    System.out.println("Sum of one double and one integer---->  "+(num3+num2));


	}
   
  
   public void Sumoftwonum(String str1,String str2) {
	    System.out.println("Sum of two  String---->  "+(str1+str2));


	}
	   public void Sumoftwonum(String str1,double num3) {
		    System.out.println("Sum of one String and one double---->  "+(str1+num3));


		}
	   public void Sumoftwonum(double num3,String str1) {
		    System.out.println("Sum of one double and one String---->  "+(num3+str1));


		}
	  

	
	   public void Sumoftwonum(int num1,String str1) {
		    System.out.println("Sum of one  integer and one String---->  "+(num1+str1));


		}
	   public void Sumoftwonum(String str1,int num2) {
		    System.out.println("Sum of one string and one  integer---->  "+(str1+num2));


		}
	   public void Sumoftwonum(double num3,double num4) {
		    System.out.println("Sum of two double---->  "+(num3+num4));


		}
		  
}