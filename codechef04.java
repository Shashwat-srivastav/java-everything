import java.util.*;
class codechef04
{
    public static void main(String args[])
    {
        int count =0,sub=0;
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        { count=0;
            int x=sc.nextInt();
            int s=sc.nextInt();
            int left=s-x;
            if(x%2==0&&s%2!=0)
            {
                System.out.println(-1);
                continue;
             }
            if((s-x)<0)
            {
                System.out.println(-1);
            }
            else if((s-x)==0)
            {
                System.out.println(1);
            }
            else{
                   // System.out.println("sdfghjkl");
               for(int j=left;j>=1;j--)
              {
                   // int j=left;
                    if (left==0){
                    //     System.out.println(count+1);
                        break;
                    }
                  
                        if((j|x)>x){
                            //j--;
                            continue;
                        }
                        else{
                            while (left>=j){
                                left = left-j;
                                count++;
                            }
                           
                            // sub=(left/j);
                            // left=left-(sub*j);
                            // count=count+sub;
                            // j=left+1;
                            

                        }
                
                }
                System.out.println(count+1);

            }


        }
    
    }
}
