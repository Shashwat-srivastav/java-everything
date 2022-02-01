public class mountainsearch {
     public static void main(String args[])
     {
         int[] arr={0,1,5,3,0};
         int length=arr.length;
         int target=1;
        int start=0,end=length-1;
        int index=-1;
          
        if(arr[0]==target)
            {
                index=0;
              
            }else if(arr[length-1]==target)
            {
                index=length-1;
               
            }
        while(start<=end)
        { int mid=(start+end)/2;
            
            if(mid+1>length-1)
            {
                break;
            }
            if(arr[mid]<arr[mid+1]&&target<arr[mid+1])
            {
                  end=mid-1;
            }else if(arr[mid]<arr[mid+1]&&target>arr[mid+1])
            {
                 start=mid+1;
            }
            if(arr[mid]>arr[mid+1]&&target<arr[mid+1])
            {
                  start=mid+1;
            }else if(arr[mid]>arr[mid+1]&&target>arr[mid+1])
            {
                 end=mid-1;
            }
            if(target==arr[mid+1])
            {
                index=mid+1;
                break;
            }else if(target==arr[mid])
            {
                index=mid;
                break;
            }
            
        }
        System.out.println(index);
     }
}
