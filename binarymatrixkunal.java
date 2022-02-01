public class binarymatrixkunal {
     public static void main(String args[])
     {
         int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{33,34,38,50, 55}};
         int length=arr.length;
         int r=0,c=length-1;
         int target=13;
         int n=1,k=0;
         while(c>=0&&r<length)
         {
            if(c<0||r>length-1)
            {
               // System.out.println("INVALID INPUT");
               k=1;
                break;
            }
             if(target>arr[r][c])
             {
                  r=r+1;
             }
             if(c<0||r>length-1)
             {
                k=1;
                // System.out.println("INVALID INPUT");
                 break;
             }
             if(target<arr[r][c])
             {
                 c=c-1;
             }
             if(c<0||r>length-1)
             {
                k=1;
                // System.out.println("INVALID INPUT");
                 break;
             }
             if(target==arr[r][c])
             {
                 break;
             }
           

         }
         if(k==1)
         {
             System.out.println("INVALID INPUT");
         }else{
         System.out.println(r+","+c);
         }
     }
}
