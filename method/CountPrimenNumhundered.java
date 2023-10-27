//count help all prime number up to 100 with the help of method.
class CountPrimenNumhundered{
 public static void main(String[] args)
     {
      int a=100;
       int i=1;
      
     CountPrimenNumhundered d =new CountPrimenNumhundered();
     System.out.println("Total number of prime number up to 100==>> "+d.countPrimenNumhundered(a));
    }
     public int countPrimenNumhundered(int a){
     int c=0;
   for(int num=1;num<=100;num++){
   int count=0;
   
   for(int b=2;b<=num/2;b++){
     if(num%b==0){
      count++;
        }
      }
      if(count==0){
       c++;
      }
     
     }
    return c;
    }
}