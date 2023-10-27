//Write a java program to print all the number upto 200 which is divided by 7 or end with 7//
class EndorDiv
{
   public static void main(String[] args)
      {
        int a=1;
        while(a<=200)
          {
            if(a%7==0 ||a%10==7)
              {
               System.out.println("divided by 7 or End by 7 :"+a);
              }
            a++;
          }
       }
}