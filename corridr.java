public class corridr {
    
    public static void main(String args[])
    {
        String corridor="PPSSSPPPS";
        int l=corridor.length();
        int s=0,c=0;
        for(int i=0;i<l;i++)
        {
            if(corridor.charAt(i)=='S')
            {
                s++;
            }
            if(s==2)
            {
                c++;
                i--;
                s=0;
            }
        }
        System.err.println(c);
    }
}
