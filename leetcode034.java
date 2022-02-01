import java.util.Arrays;
public class leetcode034 {
    public static void main(String args[])
    {
        int nums[]={1};
        int target=1;
        int location[]={-1,-1};
        int length=nums.length;
        
        int c=0;
        while(length>0)
        {
            if(nums[length-1]==target)
            {
                location[0]=length-1;
               if(c==0)
               {
                   location[1]=length-1;
               }
               c++;
            }
            length--;
        }
        System.out.println(Arrays.toString(location));
     
        
    }
}
