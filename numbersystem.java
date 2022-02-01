import java.util.*;
class NumberSystem
{
    static int count=0;
    static int c,sum=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to get output");
        int num=sc.nextInt();
        int a=num;
        NumberSystem  ob=new NumberSystem();
        ob.Neon(a);//ok
        ob.Niven(a);
        ob.Happy(a);//ok
        ob.Palindrome(a);//ok
        ob.Armstrong(a);//OK
        ob.Magic(a);//ok
        ob.Perfect(a);//ok
        ob.Automorphic(a);//ok
        ob.Prime(a);//ok
        ob.Kaprekar(a);
        System.out.println("YOU GOT: "+count+" OUT OF 8");
    }

    public static void Neon(int a)//READY TO USE
    {  sum=0;
        c=a*a;
        while(c!=0)
        {
            int n=c%10;
            sum=sum+n;
            c=c/10;
        }
        if(sum==a)
        {
            System.out.println(a+" :is NEON !");
            count =count +1; 
        }else{
            System.out.println(a+" :is not neon");
        }
    } 

    public static void Niven(int a)
    {

    }

    public static void Happy(int a)//READY TO USE
    {
        c=a; sum=0;

        while(c!=1)
        {
            while(c!=1)
            {
                int n=c%10;
                sum=sum + n*n;

                c=c/10;
                if(c==1){
                    sum=sum+1;
                    if(sum==1){
                        System.out.println(a+" :is HAPPY !");
                        count =count +1;  
                        break;
                    }
                    if(sum!=1){
                        c=sum;
                        sum=0;
                    }
                }
                if(c==0)
                {    
                    if(sum==1){
                        System.out.println(a+" :is HAPPY !");
                        count =count +1;  
                        break;}
                    else if(sum<9)
                    {
                        break;
                    } else{
                        c=sum;
                        sum=0;
                    }
                }
            }
            if(sum<9&&sum!=1){
                System.out.println(a+" :is not happy");
                break;
            }
        }
    }

    public static void Palindrome(int a)//READY TO USE
    {
        c=a;sum=0;
        while(c!=0){
            int n=c%10;
            sum=sum*10+n;
            c=c/10;
        }
        if(sum==a){
            System.out.println(a+" :is PALINDROME !");
            count =count +1;  
        }else{
            System.out.println(a+" :is not palindrome");
        }

    }

    public static void Armstrong(long a)//READY TO USE
    {
        long c=a;
        long sum=0;
        while(c!=0)
        {
            long n=c%10;
            sum=sum+n*n*n;
            c=c/10;
        }
        if(sum==a){
            System.out.println(a+" :is ARMSTRONG !");
            count =count +1;

        }else{
            System.out.println(a+" :is not armstrong");
        }
    }

    public static void Magic(int a)
    {  c=a;sum=0; int dig=0;
        while(c!=1){
            while(c!=1){
                int n=c%10;
                sum=sum+n;
                c=c/10;
                dig=dig+1;
                if(c==0)
                {
                    if(sum==1){
                        System.out.println(a+": is MAGIC !");
                        count =count +1;
                        break;
                    }else {
                        c=sum;
                        sum=0;

                    }
                    if(sum!=1&&dig==1)
                    {

                        break;
                    }
                    dig=0;
                }
                if(c==1)
                {
                    sum=sum+1;
                    if(sum==1){
                        System.out.println(a+": is MAGIC !");
                        count =count +1;
                        break;
                    }else {
                        c=sum;
                        sum=0;
                        dig=0;
                    }

                }

            }
            if(sum!=1)
            {
                c=1;
                System.out.println(a+": is not magic");
            }
        }

    }
    public static void Perfect(int a)//READY 
    {
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(a==sum)
        {
            System.out.println(a+": is PERFECT !");
            count =count +1;
        }else{
            System.out.println(a+": is not perfect");
        }
    }

    public static void Automorphic(long a)//READY TO USE
    {
        long c=a*a;
        String b=Long.toString(c);
        String ba=Long.toString(a);
        int  l=b.length(),le=ba.length(),be=l-le;
        String su=b.substring(be,l);
        if(su.equalsIgnoreCase(ba)){
            System.out.println(a+": is AUTOMORPHIC !");
            count =count +1;
        }else{  
            System.out.println(a+": is not automorphic");
        }
    }

    public static void Prime(int a)//READY TO USE
    {
        int sum=0;
        for(int i=2;i<a;i++)
        {
            int n=a%i;
            if(n==0){
                sum=sum+1;
            }
        }
        if(sum>=1){
            System.out.println(a+": is not prime");
        }else{
            System.out.println(a+": is PRIME !");
            count =count +1;
        }
    }

    public static void Kaprekar(int a)
    { 
    }
}