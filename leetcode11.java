public class leetcode11 {
    public static void main(String args[])
    {
        int height[]={1,8,9,6,2,5,4,8,3,7,6,6};
        int l=height.length;
        int vol[][]=new int[l][l];
        
            for(int i=0;i<l-1;i++)
            {
                for(int j=i+1;j<l;j++)
                {
                    vol[i][j]=height[i]*(j-i);
                    if(height[j]<height[i])
                    {
                        vol[i][j]=height[j]*(j-i);
                    }
                }
            }
        int max=0;
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<l;j++)
                {
                    if(max<vol[i][j])
                    {
                        max=vol[i][j];
                    }
                }
            }
            System.out.println(max);
    }
}
