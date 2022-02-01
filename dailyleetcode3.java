public class dailyleetcode3 {
    
    public static void main(String args[])
    {
         int arr[]={3,5,5};
        int arraylength=arr.length;
    
    int start=0,end=arraylength-1;
    while(start < end)
    {
        int mid=(start+end)/2;
        
        if(arr[mid] > arr[mid+1])
        {
            end=mid;
        }
        if(arr[mid] < arr[mid+1])
        {
            start=mid+1;
        }
        // if(start==end)
        // {
        //     break;
        // }
      //  System.out.println("ok");
    }
    if(start==end)
    {
        System.out.println("TRUE");
    }else{
        System.out.println("FALSE");
    }
        
    }
}
