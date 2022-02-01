import java.util.*;
class checksubstring {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=1;i<=t;i++)
       {
            
           String s=sc.next();
           int l=s.length();
         
            
             for(int x=0;x<l-1;x++)
                {
          
                 for(int y=x+1;y<l;y++)
                  {
                     double count1=0, sum1=0;
                     int klm=0;
                      String check=s.substring(x,y);
                        int l2=check.length();
              
               
                       for(int q=l2-1;q>=0;q--)
                        {
        
                           char s2=check.charAt(q);
                           if(s2=='1')
                            {
                             double f= Math.pow(2,count1);
                              sum1=sum1 +f ;
                             }
                             count1++;
                        }
                   
                              for(int k=2;k<=sum1/2;k++)
                                {
                                 if(sum1%k==0)
                               {
                                    klm=1;
                                    
                                }

                               }
                            if(klm==0&&sum1!=1)
                            {
                               System.out.print("prime  --");//yes
                            }else{
                               System.out.print("not prime --");//no
                            }   
                              
                            
                              System.out.print(check);
                              System.out.println("   =  "+sum1);
             }
            }
         }
    }
}
