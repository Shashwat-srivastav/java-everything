import java.util.*;
class decisionmaker
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE RANGE");
int range=sc.nextInt();
int rand=(int)(Math.random()*range)+1;
System.out.println("you can do "+rand);
}
}