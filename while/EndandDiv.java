//Write a java program to print all the number upto 1000 which is divided by 7 and also end with 7.//
class EndandDiv
{
  public static void main(String[] args)
     {
        int a=1;
        while(a<=1000)
        {
           if(a%7==0 && a%10==7)
             {
              System.out.println("divided by 7 and end with 7 :"+a);
              }
            a++;
          }
        }
 }