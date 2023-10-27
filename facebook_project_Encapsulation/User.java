package facebook_project_Encapsulation;

public class User {
	private String name;
	private String gender;
	private int age;
	private String uId;
	private int pwd;
	User(){
		
	}
	User(String name,int age,String uId,int pwd,String gender){
		this.name=name;
		this.age=age;
		this.uId=uId;
		this.pwd=pwd;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getUid() {
		return uId;
	}
	public void setUid(String uId) {
		this.uId=uId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd=pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	

}
