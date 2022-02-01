public class arrleet03 {
    
    public static void main(String args[])
    {
        int cost[]={6,5,7,9,2,2};
        int l=cost.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(cost[i]>cost[j])
                {
                    int temp;
                    temp=cost[i];
                    cost[i]=cost[j];
                    cost[j]=temp;
                }
            }
        }
        for(int x=0;x<l;x++)
        {
            System.out.print(cost[x]+" ,");
        }
        int sum=0,c=2;
        for(int x=0;x<l;x++)
        {
            if(x==c)
            {
                c=c+3;
            }else{
            sum=sum+cost[x];
            System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
