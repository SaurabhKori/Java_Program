package initilliazing_by_chaining_and_Overloding_Constructor;
import java.util.*;
public class StudentDetailDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll number--->");
		int roll_no=sc.nextInt();
		String a=sc.nextLine();
		System.out.println("Enter Student Name---------->");
		String s_name=sc.nextLine();
		
		System.out.println("Enter Student College Name-->");
		String college_name=sc.nextLine();
		System.out.println("Enter Student Adhar Number-->");
		int adhar_num=sc.nextInt();
		String b=sc.nextLine();
		System.out.println("Enter Student Email Id------>");
		String email=sc.nextLine();
		System.out.println("Enter Student Mobile Number->");
		int mobile_no=sc.nextInt();
		String c=sc.nextLine();
		System.out.println("Enter Student Address------->");
		String addres=sc.nextLine();
		System.out.println("====================================");
		StudentDetails o=new StudentDetails( roll_no,s_name, college_name , email, adhar_num,addres, mobile_no);
		o.displaySdetail();
	}
	

}
