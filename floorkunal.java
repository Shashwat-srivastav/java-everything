public class floorkunal {
     public static void main(String args[])
     {
         int arr[]={1,2,3,5,6,7,8,9};
         int length=arr.length;
         int target=4;
         int num=0;
         for(int i=0;i<length;i++)
         {
             if(arr[i]<=target)
             {
                   num=arr[i];
             }
         }
         System.out.println(num);
     }
}
