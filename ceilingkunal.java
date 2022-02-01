import java.util.*;
import java.util.ArrayList;
public class ceilingkunal {
     public static void main(String args[])
     {
         Scanner sc= new Scanner(System.in);
       
        ArrayList<Integer> list=new ArrayList(2);
        int length=sc.nextInt();
        int arr[]= new int[length];
        for(int i=0;i<length;i++)
        {
            int a=sc.nextInt();
            list.add(a);
            arr[i]=a;
            
        }
        int target=sc.nextInt();
        int num=0;
        for(int i=0;i<length;i++)
        {
            if(arr[i]>=target)
            {
                num=arr[i];
                break;

            }
        }
        System.out.println(num);

     }
}
