//design java program with the help of method to check wheater a number is an Armstrong number or not 
import java.util.*;
class ArmstrongN
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
long num=sc.nextLong();
ArmstrongN m= new ArmstrongN();
long c=m.arsum(num);
if(c==num)
{
System.out.println(c+"--ArmStrong Number--"+num);
}
else{
System.out.println(c+"-- Not ArmStrong  Number--"+num);
}
}
public long arsum(long num){
 long sum=0;
 CountDigit a=new CountDigit();
 long b=a.countdigit(num);
 while(num!=0)
{
 long rem=num%10;
 PowerN c=new PowerN();
 sum=sum+c.powerN(rem,b);
 num/=10;
}
return sum;
}
}

