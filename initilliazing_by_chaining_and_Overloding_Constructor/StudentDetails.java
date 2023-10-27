package initilliazing_by_chaining_and_Overloding_Constructor;

public class StudentDetails {
	int roll_no;
	String s_name;
	String email;
	int adhar_num;
	String college_name;
	String addres;
	int mobile_no;
	StudentDetails(){
	

}
	StudentDetails(int roll_no,String s_name,String college_name){
		this.roll_no=roll_no;
		this.s_name=s_name;
		this.college_name=college_name;
	}
	StudentDetails(int roll_no,String s_name,String college_name ,String email){
		this(roll_no,s_name,college_name);
		this.email=email;
		}
	StudentDetails(int roll_no,String s_name,String college_name ,String email,int adhar_num){
		this(roll_no,s_name,college_name,email);
		this.adhar_num=adhar_num;
	}
	StudentDetails(int roll_no,String s_name,String college_name ,String email,int adhar_num,String addres){
		this(roll_no,s_name,college_name,email,adhar_num);
		this.addres=addres;
	
}
	StudentDetails(int roll_no,String s_name,String college_name ,String email,int adhar_num,String addres,int mobile_no){
		this(roll_no,s_name,college_name,email,adhar_num,addres);
		this.mobile_no=mobile_no;
	}
	public void displaySdetail() {
		System.out.println("Student Roll number--->  "+roll_no);
		System.out.println("Student Name---------->  "+s_name);
		System.out.println("Student College Name-->  "+college_name);
		System.out.println("Student Adhar Number-->  "+adhar_num);
		System.out.println("Student Email Id------>  "+email);
		System.out.println("Student Mobile Number->  "+mobile_no);
		System.out.println("Student Address------->  "+addres);
		
	}
}
