
import java.util.*;
class binarytodecimal {

    public static void main( String args[])
    {
       Scanner sc = new Scanner(System.in);
       String s= sc. next();
       int l=s.length();
       double sum=0,c=0;
       for(int i=l-1;i>=0;i--)
       {
           char a=s.charAt(i);
           if(a=='1')
           {
               double f= Math.pow(2,c);
                sum=sum + f;
           }
           c++;
       }
       System.out.println(sum);
    }
}
