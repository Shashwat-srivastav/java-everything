public class floorkunal01 {
    public static void main(String args[] )
    {
       int arr[]={2,3,5,9,14,16,18};
       int length=arr.length;
       int start=0,end=length-1;
       int target=10;
       int num=0;
       while (start<=end) {
           int mid=(start+end)/2;
           if(target>arr[mid])
           {
              start=mid+1;
           }
          else if(target<arr[mid])
           {
               end=mid-1;
           }
          else if(target==arr[mid])
           {
               num=arr[mid];
               break;
           }
             num=arr[end];
           
           
       }
       System.out.println(num);
    }
}
