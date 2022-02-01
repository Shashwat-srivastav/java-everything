
import java.util.ArrayList;
 class arrleet02 {
    public static void main(String args[])
    { int c=0;
        int[] nums={1,1,2,2,2,23,4,4,4,55,5,5,3,3,5,2,24,5};
              int arrlength=nums.length;
        ArrayList<Integer> list=new ArrayList<>(arrlength);
        for(int i = 0; i < nums.length; i++){
            
            list.add(nums[i]);
            //k++;
        
    }
   int  re =list.size();
    for(int i=0;i<re-1;i++)
    {
        for(int j=i+1;j<re;j++)
        {
            int h=list.get(i);
                int g=list.get(j);
            if(h==g)
            {
                list.remove(j);
                re=list.size();
                System.out.println(list);
            }
        }
    }
    for(int i=0;i<re-1;i++)
    {
        for(int j=i+1;j<re;j++)
        {
            int h=list.get(i);
                int g=list.get(j);
            if(h==g)
            {
                list.remove(j);
                re=list.size();
                System.out.println(list);
            }
        }
    }
      
        //     if(!unique.contains(nums[i])){
      
  
       // int arraylength=nums.length;
      // int x = 0;
        for(int x = 0 ; x < re ; x++);
        {
            
            
            //int h=nums[x];
            list.add(nums[x]);
            System.out.println(list);
        }
    //     for(int i=0;i<arraylength-1;i++)
    //     {
    //         for(int j=i+1;j<arraylength;j++)
    //         {
    //             if(list.get(i)==list.get(j))
    //             {
    //                 list.remove(j);
    //             }
    //         }
    //     }
    //     int re=list.size();
    //     for(z=0;z<arraylength;z++);
    //     {
    //         if(z<=re)
    //         {
    //         nums[z]=list.get(z);
    //         }else{
    //             nums[z]=9000;
    //         }
    //     }
    // //     for(int i=0;i<arrlength-1;i++)
    // //     {
    // //         for(int j=i+1;j<arrlength;j++)
    // //         {
    // //             int ar=nums[i];
    // //             if(nums[i]==nums[j])
    // //             {
    // //                 nums[j]='_';
    // //                 c++;
    // //                 System.out.println(c);
    // //             }
    // //         }
    // //     }
    // //     for(int i=0;i<arrlength;i++)
    // //     {
    // //         for(int j=0;j<arrlength;j++)
    // //         {
    // //             if(nums[i]<nums[j])
    // //             {
    // //                 int temp;
    // //                 temp=nums[i];
    // //                 nums[i]=nums[j];
    // //                 nums[j]=temp;
                    
    // //             }
    // //         }
    // //     }
       
    // //     // for(int x=0;x<arrlength;x++)
    // //     // {
    // //     //     if(nums[x]=='_')
    // //     //     {
    // //     //         c++;
    // //     //     }
            
    // //     // }
    // //     int re=arrlength-c;
    // //   System.out.println(re);
    // //     for(int x=0;x<arrlength;x++)
    // //     {
    // //         System.out.println(nums[x]);
    // //     }

    }
}
