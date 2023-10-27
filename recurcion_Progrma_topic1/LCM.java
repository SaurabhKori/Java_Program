package recurcion_Progrma_topic1;

public class LCM {
	static int lcm=0;
	public int lcm(int a,int b) {
		int big=a>b?a:b;
		for(lcm=big;;lcm+=big) {
			if(lcm%a==0 && lcm%b==0) {
				return lcm;
			}
		}
	}

}
