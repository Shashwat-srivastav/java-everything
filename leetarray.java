import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class leetarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int nums[]={0,1,2,2,3,0,4,2};
       int  val=2;
       int length=nums.length;
        ArrayList<Integer> list=new ArrayList(length);
        
        for(int i=0;i<length;i++)
        {
            list.add(nums[i]);
        }
        int length2=list.size();
        
        for(int j=0;j<length2;j++)
        {
            for(int i=0;i<length2;i++)
        {
            if(val==list.get(i))
            {
            list.remove(i);
            System.out.println(list);
            length2=list.size();
            }
        }
    }
        //  length2=list.size();
        for(int i=0;i<length2;i++)
        {
            nums[i]=list.get(i);
        }
        System.out.println(length2);
        System.out.println(Arrays.toString(nums));
        //return length2;
    }
}
