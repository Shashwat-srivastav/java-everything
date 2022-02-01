public class binarysearch01 {
    
    public static void main(String args[])
    {
        int position=-1;
        int nums[]={1,2,3,4,5,6,7,8,9,23};
        int length=nums.length;
        int target=7;
        int left=0;
        int right=length-1;

        while(left<=right)
        { 
            int mid=(left+right)/2;
            if(target>nums[mid])
            {
                left=mid + 1;
            }
            if(target<nums[mid])
            {
                right=mid- 1;
            }
            if(target==nums[mid])
            {
                position=mid;
                break;
                //System.out.println(position);
               // return position;
            }
            

        }
        System.out.println(position);

    }
}

// int position=-1;
// // int nums[]={5};
// // int target=5;
//  int length=nums.length;
//  if(target>nums[length-1])
//  {
//      return position;
//  }
//  if(target<nums[0])
//  {
//      return position;
//  }
//  if(target>=nums[length/2])
//  { int start=(length/2);
//     int end=length;
    
//      for(int i=start;i<end;i++)
//      {
//          if(target>nums[(start+end)/2])
//          {
//              start=(start+end)/2+1;

//          }
//          if(target<nums[(start+end)/2])
//          {
//              end=(start+end)/2-1;
             
//          }
//          if(target==nums[(start+end)/2])
//          {
//              position=(start+end)/2;
//             // System.out.println(position);
//            //  break;
             
//          }
         
//      }
//  }else{
//      int start=0;
//     int end=length/2;
    
//      for(int i=start;i<=end;i++)
//      {
//          if(target>nums[(start+end)/2])
//          {
//              start=(start+end)/2 +1;

//          }
//          if(target<nums[(start+end)/2])
//          {
//              end=(start+end)/2 -1;
             
//          }
//          if(target==nums[(start+end)/2])
//          {
//              position=(start+end)/2;
           
//          }
         
//      }
//  }

//  return position;