public class rotatedsortedkunal {
     public static void main(String args[])
     {
         int arr[]={2,3,4,4,5,5,5,1,1};
         int length=arr.length;
         int max=0,minlocation=0;
         int start=0,end=length-1;
         for(int i=0;i<length;i++)
         {
             if(arr[i]>=max)
             {
                 max=arr[i];
                 minlocation=i;
             }
         }
         System.out.println(minlocation);
        //  while(start<end)
        //  { int mid=(start+end)/2;
        //      if(arr[start]>arr[mid])
        //      {
        //          end=mid-1;
        //      }
        //      if(arr[start]<arr[mid])
        //      {
        //          start=mid;
        //      }
        //      if(arr[end]<arr[mid])
        //      {
        //          end=mid;
        //      }

        //  }
        //  System.out.println(end);
     }
}
