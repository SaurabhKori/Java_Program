import java.util.Scanner;
class HarmonicSeries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num =sc.nextInt();
		double sum=1;
		for(double i=2; i<=num; i++){
			sum+=1/i;
		}
		System.out.println("The Harmonic Series To "+num+" is: "+sum);
	}
}

        
          