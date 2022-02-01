public class ceilingkunal01 {
    public static void main(String args[])
    {
        int[] nums={2,3,5,9,14,16,18};
        int target=10;
        int length=nums.length;
        int left=0;
        int right=length;
        int num=0;

        while(left<=right)
        { 
            int mid=(left+right)/2;
            if(target==nums[mid])
            {
               num=nums[mid];
                break;
                //System.out.println(position);
               // return position;
            }
            else if(target>nums[mid])
            {
                left=mid + 1;
            }
            else if(target<nums[mid])
            {
                right=mid- 1;
            }
            {
                num=nums[left];
            }
           
            

        }
        System.out.println(num);
    }
}
