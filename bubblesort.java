import java.util.Arrays;
public class bubblesort {
    
    public static void main(String args[])
    {
        int arr[]={1,6,4,34,78,45,2,98,75,45,39};
        int l=arr.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
