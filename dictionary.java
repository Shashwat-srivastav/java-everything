import java.util.*;
class dictionary {

    static{
        if(3>8)
        {
            System.out.println("ok");
        }else{
            System.out.println("okay");
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        //System.out.println("");
        String s=sc.next();
        int number=sc.nextInt();
        int l=s.length();
        //int k=(l/number);
        String ele[]=new String[l-number+1];
        String part;
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(i==(l-number+1))
            {
                break;
            }else{
            part=s.substring(i,i+number);
            }
          
             ele[c]=part;
             c++;
         
        }
        int klm=0;
        
     //   for(int g=0;g<number;g++)
        {
        for(int x=0;x<l-number+1;x++)
        { 
           for(int y=x+1;y<l-number;y++)
            { String temp;
                if(x==l-number)
                {
                    break;
                }
                char first=ele[x].charAt(0);
                char second=ele[y].charAt(0);
             //   try{
                if(first>second/*&&g==0 &&ele[x].charAt(g-1)==ele[y].charAt(g-1)*/)
                {
                    temp=ele[x];
                    ele[x]=ele[y];
                    ele[y]=temp;
                   // klm++;
                }
            }
               /* if(g!=0&&ele[x].charAt(g-1)==ele[y].charAt(g-1)&&first>second )
                {
                    temp=ele[x];
                    ele[x]=ele[y];
                    ele[y]=temp;
                }*/

            //   }catch(Exception e){

              //}
            }
        }
    


        
        for(int j=0;j<l-number+1;j++)
        {
            System.out.println(ele[j]);
        }

    }
    
}
