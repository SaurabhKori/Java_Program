// write a jp to count how many number are number are upto 1000 which is divided 4 and also end with 4.//
class DivandEnd
{
   public static void main(String[] args)
     {
       int a=1;
       
       int count=0;
       while(a<=1000)
       {
          if(a%4==0 && a%10==4)
            {
             
              
             count=a/a+count;
             } 
           a++;
       }
     System.out.println("count of number which is divided by 4 and end with 4 :"+count);
    }
}
       