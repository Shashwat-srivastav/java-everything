/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    String s=sc.next();
		    int l=s.length();
		  if(l==1)
		  {
		      System.out.println("no");
		  continue;
		  }
           if(s.charAt(l-1)=='1')
		  {
		       System.out.println("yes");
		  continue;
		  }
		    int sum=0,count=0;
		    for(int j=l-1;j>=0;j--)
		    {
		        
		        char s1=s.charAt(j);
		        if(s1=='1')
		        {
		            sum=sum +(int) Math.pow(2,count);
		        }
		        count++;
		    }
		    int g=0;
		    for(int k=2;k<=sum/2;k++)
		    {
		        if(sum%k==0)
		        {
		            g=g+1;
		        }
		    }
		    if(g==0&&sum!=1)
		    {
		        int gh=0;
		        for(int x=0;x<l-1;x++)
		        {
		          
		           for(int y=x+1;y<l;y++)
		            {
		                double count1=0, sum1=0;
		               
		                String check=s.substring(x,y);
		                int l2=check.length();
		              
		               
		                 for(int q=l2-1;q>=0;q--)
		                 {
		        
		                     char s2=check.charAt(q);
		                    if(s2=='1')
		                   {
		                       double f= Math.pow(2,count1);
		                     sum1=sum1 + f;
		                    }
		                    count1++;
		                 }
		                 
		                 for(int mn=2;mn<=sum1/2;mn++)
		                 {
		                    if(sum1%mn==0)
		                   {
		                    gh=1;
		                    break;
		                   }else{
		                       gh=0;
		                   }
		           
		                 }
		            }
		            
		        }
		        if(gh==0)
		        {
		        System.out.println("yes");
		        }else{
		            System.out.println("no");
		        }
		        
		    
		        
		    }
		    else
		    {
		        
		        System.out.println("no");
		    }
		    
		}
		
	}
}
