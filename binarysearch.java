public class binarysearch {
    public static void main(String args[])
    { int position=-1;
        int nums[]={5,6,7,8,9,12,33,44,55,66,77,88};
        int target=88;
        int length=nums.length;
        if(target>nums[length-1])
        {
             System.out.println(position);
                  
            //return position;
        }
        if(target<nums[0])
        {
           System.out.println(position);
                  
        }
        if(target>=nums[length/2])
        { int start=(length/2);
           int end=length;
           
            for(int i=start;i<end;i++)
            {
                if(target>nums[(start+end)/2])
                {
                    start=(start+end)/2+1;

                }
                if(target<nums[(start+end)/2])
                {
                    end=(start+end)/2-1;
                    
                }
                if(target==nums[(start+end)/2])
                {
                    position=(start+end)/2;
                   // System.out.println(position);
                  //  break;
                    
                }
                
            }
        }else{
            int start=0;
           int end=length/2;
           
            for(int i=start;i<=end;i++)
            {
                if(target>nums[(start+end)/2])
                {
                    start=(start+end)/2 +1;

                }
                if(target<nums[(start+end)/2])
                {
                    end=(start+end)/2 -1;
                    
                }
                if(target==nums[(start+end)/2])
                {
                    position=(start+end)/2;
                  
                }
                
            }
        }
        System.out.println(position);

    }
}
