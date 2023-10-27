package initilization_by_constructor;
import java.util.*;
public class EmpSalDistribution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ID");
		int id=sc.nextInt();
		String asdf=sc.nextLine();
		System.out.println("Enter Employee Name");
		String Ename=sc.nextLine();
		System.out.println("Enter Empolyee total montly Sal");
		double totalsal=sc.nextDouble();
		System.out.println("Enter working days of employee");
		int workday=sc.nextInt();
		
		
		EmpsalDetail a=new EmpsalDetail( id, Ename, totalsal, workday);
		a.displaySaldetail();
		
		
		
		
	}

}
