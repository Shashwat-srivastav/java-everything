import java.util.*;
import java.util.ArrayList;
public class dailyleetcode {
     public static void main(String args[])
     {  
       int low=10;
       int high=130000;
       Scanner sc= new Scanner(System.in);
       low=sc.nextInt();
       high=sc.nextInt();
       ArrayList<Integer> list = new ArrayList(2);
      int lower=low;
      int upper=high;
      int lowerdigit=0;
      int upperdigit=0;
      int k=0;
      
      while(lower>0)
      {
          lowerdigit++;
          lower=lower/10;
      }
       while(upper>0)
      {
         upperdigit++;
          upper=upper/10;
      }
      String num="123456789";
      String lower1=Integer.toString(low);
      int digit=lowerdigit;
     
    //  for( k=0;k<9;k++) 
    {
      for(int i=0;i<10-digit;i++)
      { 
          if(num.charAt(i)==lower1.charAt(0))
          {
              for(int j=i;j<10-digit;j++)
              {
                  if(j<(num.length()))
                  {
                    String part=num.substring(j,j+digit);
                  int added=Integer.parseInt(part);
                  list.add(added);
                      // digit++;
                      // System.out.println(digit);
                      // break;
                  }
                //   if(j>(num.length()))
                //   {
                //   digit++;
                //       System.out.println(digit);
                //       break;
                // }
                  // String part=num.substring(j,j+digit);
                  // int added=Integer.parseInt(part);
                  // list.add(added);
              }
              int last=list.size();
              lower1=Integer.toString(list.get(last-1));
              digit++;
          }
          
          if(digit>upperdigit)
          {
            break;
          }
          // if(k!=0)
          // {
          //     break;
          // }
      }
    }
      // String upper1=Integer.toString(high);
      //         for(int i=0;i<10-upperdigit;i++)
      // { 
      //     if(num.charAt(i)==upper1.charAt(0))
      //     {
      //         for(int j=i;j<10-upperdigit;j++)
      //         {
      //             if(j==num.length())
      //             {
      //                 k++;
      //                 break;
      //             }
      //             String part=num.substring(j,j+upperdigit);
      //             int added=Integer.parseInt(part);
      //             list.add(added);
      //         }
      //     }
      //     if(k!=0)
      //     {
      //         break;
      //     }
      // }
      int len=list.size();
     // for(int y=0;y<low;y++)
      {
        for(int x=0;x<len;x++)
      {
          if(list.get(x)>high)
          {
              list.remove(x);
              len=list.size();
          }
      }
    }
      System.out.println(list);
     }
}
