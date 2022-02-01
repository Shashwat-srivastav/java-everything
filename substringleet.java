import java.util.*;
class substringleet
 {
    
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      String in=sc.next();
      int l=in.length();
      String element[]=new String[l];
      int c=0,b=0;
      String sum="";
      for(int i=0;i<(l-1);i++)
      {
          
          for(int j=i+1;j<l;j++)
          {    
              String s= in.substring(i,j);
              int lesub=s.length();
              for(int x=0;x<lesub-1;x++)
              {
                  for(int y=x+1;y<lesub;y++)
                  {
                  char first=s.charAt(x);
                  char second=s.charAt(y);
                 try
                 { if(first==second)
                  {
                       b=1;
                       element[c]=" ";
                       break;
                  }else{
                     
                      element[c]=s;
                     
                  }
                }catch(Exception e)
                {

                }
                  }
                  if(b==1)
                  {
                      break;
                  }
              }
              /*
              char part1=in.charAt(i);
              char part2=in.charAt(j);
              if(part1==part2)
              {
                  i=j-1;
                 sum=part1+sum;
                 element[c]=sum;
                 System.out.println(element[c]);
                 sum="";
                 c++;
               
                 break;
                 
              }
              sum=sum+part2;
              */
                   c++;
                
          }
      }
      int l1=element.length;
      int leng[]=new int[l1];
      for(int x=0;x<l1;x++)
      {
      // leng[x]=element[x].length();
      System.out.println(element[x]);
      }

     

    }
}
