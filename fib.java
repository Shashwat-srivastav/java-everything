import java.util.*;
class fib
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++)
        {
            int temp;
            System.out.println(b);
            temp=a;
            a=b;
            b=temp+b;

        }
    }
}