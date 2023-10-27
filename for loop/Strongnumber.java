// take input from user and print strong number
class Strongnumber{
   public static void main(String[] args)
       {
       int num=100000;
       int factd=1;
       int sum=0;
       int rem=0;
       int i;
       int k;
      for(i=1;i<=num;i++){
           k=i;
           while(k>0)
             {
                rem=k%10;
              for(int j=1;j<=rem;j++){
                factd=factd*j;
                 }
                sum=sum+factd;
               k=k/10;
               factd=1;
              }
            if(sum==i){
               System.out.println(sum+" --- strong number---"+i);
              }
           sum=0;
        }
      }
}
           




















