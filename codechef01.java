import java.util.*;
public class codechef01 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int Ddsa=sc.nextInt();
            int Dtoc=sc.nextInt();
            int Ddm=sc.nextInt();
            int Sdsa=sc.nextInt();
            int Stoc=sc.nextInt();
            int Sdm=sc.nextInt();
            int Ds=Ddsa+Dtoc+Ddm;
            int Ss=Sdsa+Stoc+Sdm;
            if(Ds>Ss)
            {
                System.out.println("DRAGON");
            }
            if(Ds<Ss)
            {
                System.out.println("SLOTH");
            }

            if(Ds==Ss)
            {
                if(Ddsa>Sdsa)
                {
                    System.out.println("DRAGON");
                }
                if(Ddsa==Sdsa)
                {
                    if(Dtoc>Stoc)
                    {
                        System.out.println("DRAGON");
                    }
                    if(Dtoc==Stoc)
                    {
                        System.out.println("TIE");
                    }
                    if(Dtoc<Stoc)
                    {
                        System.out.println("SLOTH");
                    }
                }
                if(Ddsa<Sdsa)
                {
                    System.out.println("SLOTH");
                }
            }
        }
    }
}
