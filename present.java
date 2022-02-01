
import java.util.*;
 class present{
   
    public static void main(String args[])
    {
        int N,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of testcases");
        int T=sc.nextInt();

       
       if(T>=1&&T<=10)
       {
        for(int i=0;i<T;i++)
        {
                System.out.println("Enter the no. of students");
             N=sc.nextInt();
             if(N>=1&&N<=100)
             {

               int A[]=new int[N];
                System.out.println("Enter the roll no. of students ");
              for(int j=0;j<N;j++)
               {
                  A[j]=sc.nextInt();

                 }
            
            for(int x=0;x<N;x++)
            {
                if(A[x]==42)
                {
                   c++ ;
                }else{
                    
                }
            }
        }
    
           
        }
    }
        if(c>=1)
        {
            for(int h=1;h<=c;h++)
            {
        System.out.println("YES");
        }
        }else{
            System.out.println("NO");
        }
       
    }
}
