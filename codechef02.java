import java.util.*;
public class codechef02 {
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        { int sum=0;
            int sum1=0;
            int pr=0;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for(int h=0;h<n;h++)
            {
                a[h]=sc.nextInt();
            }
            for(int s=0;s<n;s++)
            {
                sum1=sum1+a[s];
            }
            if(sum1<x)
            {
                System.out.println(-1);
                continue;
            }

            for(int d=0;d<n;d++)
            {
                for(int u=0;u<n;u++)
                {
                    if(a[d]>a[u])
                    {int temp;
                        temp=a[u];
                        a[u]=a[d];
                        a[d]=temp;

                    }
                }
            }
            for(int j=0;j<n;j++)
            {
                sum=sum+a[j];
                if(sum==x||sum>=x)
                {
                    pr=j+1;
                    break;
                }
            }
            System.out.println(pr);
        }
    }
}
