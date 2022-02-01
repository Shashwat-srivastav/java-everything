import java.util.*;
public class codechef03 {
    public static void main(String args[])
    {
     Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    int color[][]=new int[3][3];
    for(int i=0;i<t;i++)
    {  int c=0;
        int cou=0;
        int n=sc.nextInt();
        for(int j=0;j<3;j++)
        {
            for(int x=0;x<3;x++)
            {
                color[j][x]=sc.nextInt();
               
            }
        }
        for(int j=0;j<3;j++)
        { int sum=0;
            for(int x=0;x<3;x++)
            {
                sum=sum+color[j][x];
                if(sum>n)
                {
                    cou=1;
                    break;
                }
               
            }

        }
        if(cou==1)
        {
           break;
        }

        if(color[0][0]==n&&color[1][1]==n&&color[2][2]==n)
        {
            System.out.println(c);
            continue;
        }
       
        if(color[0][0]==0&&color[1][1]==0&&color[2][2]==0)
        {
            
            c=c+(2*n);
            System.out.println(c);
            continue;
       
        }
        for(int h=0;h<3;h++)
        {
        if(color[1][0]!=0&&color[0][1]!=0)
        {
            color[0][0]=color[0][0]+1;
            color[1][1]=color[1][1]+1;
            color[1][0]=color[1][0]-1;
            color[0][1]=color[0][1]-1;
            c++;
          
        }

        if(color[2][0]!=0&&color[0][2]!=0)
        {
            color[0][0]=color[0][0]+1;
            color[2][2]=color[2][2]+1;
            color[2][0]=color[2][0]-1;
            color[0][2]=color[0][2]-1;
            c++;
           
        }
   
        if(color[1][2]!=0&&color[2][1]!=0)
        {
            color[1][1]=color[1][1]+1;
            color[2][2]=color[2][2]+1;
            color[2][1]=color[2][1]-1;
            color[1][2]=color[1][2]-1;
            c++;
          
        }
        if(color[0][1]==color[1][2])
        {
            c=c+2;
           // System.out.println(c);
           // continue;
           break;
           
        }
    }
        
         System.out.println(c);



    }
    }
}
