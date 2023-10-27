//wajp to take user input and print wheather the number is a perfect or not//
import java.util.Scanner;
 class Perfectnumber
   {
    public static void main(String[] args)
      {
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
       int num=sc.nextInt();
       int b=1;
       int sum=0;
        while(b<=num/2)
         {
          if(num%b==0)
           {
            sum=sum+b;
            }
         b++;
       }
     if(sum==num)
       {
        System.out.println(sum+":  is perfect number because this number is equal to original number  :"+num);
       }
      else{
      System.out.println(sum+": is Not perfect number because this number is equal to original number :"+num);
}
}
}
