import java.util.*;
public class hashcode01 {
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt(); 
        String entl[]= new String[t];
        String entdl[]= new String[t];
        int nul[]=new int[t];
        int nudl[]=new int[t];
      //  int c=0;
        for(int i=0;i<t;i++)
        {
             nul[i]=sc.nextInt();
            entl[i]=sc.nextLine();
            nudl[i]=sc.nextInt();
            entdl[i]=sc.nextLine();
            
        }
        int tnuml=0,tnumdl=0;
        for(int j=0;j<(t);j++)
        {
            tnuml=tnuml+nul[j];
            tnumdl=tnumdl+nudl[j];
        }
        System.out.println(tnuml);
        String lik[]=new String[tnuml];
        String dislik[]=new String[tnumdl];
      
         int c=0;
        for(int x=0;x<t;x++)
        {
           String dist[]=entl[x].split(" ");
           int len=dist.length;
           for(int y=0;y<len;y++)
           {
               lik[c]=dist[y];
               c++;
           }

        }
         c=0;
        for(int x=0;x<t;x++)
        {
           String dist[]=entl[x].split(" ");
           int len=dist.length;
           for(int y=0;y<len;y++)
           {
               dislik[c]=dist[y];
               c++;
           }

        }
        for(int z=0;z<tnuml;z++)
        {
            System.out.println(lik[z]);
        }
        
    }
}
