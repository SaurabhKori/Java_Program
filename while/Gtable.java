//WAJP to take a user input and generate table up to that number starting from 1'
import java.util.Scanner;
class Gtable
 {
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=sc.nextInt();
   int b=1;
  int table;
   while(b<=num)
   {
   for(int i=1;i<=10;i++){
    table=b*i;
    System.out.println(b+"*"+i+"--->>"+table);
    }
    b++;
   }
 }
}