
import java.util.*;
public class roger {
    
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
   
      int N=sc.nextInt();
     
      String s=sc.next();
      String s1="Potato-Chips",s2="Pudding",s3="Cola";
     
     if(N>=1&&N<=20)
      {
         if(s.equalsIgnoreCase(s1)||s.equalsIgnoreCase(s2)||s.equalsIgnoreCase(s3))
      {
          System.out.println("Yayyy!");

      }else{
          System.out.println("Nooo!");
      }
    }
}
}
