package initilization_by_constructor;
import java.util.*;
public class EmpsalDetail {
	int id;
	String Ename;
	
	double totalsal;
	int workday;
	
	EmpsalDetail(int id,String Ename,double totalsal,int workday){
		this.id=id;
		this.Ename=Ename;
		this.totalsal=totalsal;
		this.workday=workday;
	
	}
	public double getsal(double totalsal,int workday){
		
		
		double empsal=workday*(totalsal/30);
		return empsal;
		
	}
	public void displaySaldetail() {
		System.out.println("Employee ID  --> "+id);
		System.out.println("Employee Name--> "+Ename);
		System.out.println("Working day of Empolyee-->"+workday);
		System.out.println("Employee Total/month sal--> "+totalsal);
		double empsal=getsal(totalsal,workday);
		System.out.println("Employee Total Filter Salary---> "+empsal);
	}

}
