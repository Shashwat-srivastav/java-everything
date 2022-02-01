
import java.util.*;
class frequent{
  
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
           

       }
   
          
       }
   }
      
      
   }
}
