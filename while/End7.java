// Write a jva program to printf all the number upto 200 which end with 7//
class End7
{ 
   public static void main(String[] args)
     {
       int a=1;
       while(a<=200)
       {
          if(a%10==7)
            {
             System.out.println("End with 7 :"+a);
            }
          a++;
        }
      }
 }