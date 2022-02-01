import java.util.ArrayList;
public class variable {
    public static void main(String args[])
    {
  
    
        ArrayList<Integer> list= new ArrayList<>(10);
       // list.get(index);
       int arr[]={1,2,3,4,5,6,7,8};
       for(int i=0;i<7;i++)
       {
        list.add(arr[i]);
       }
       list.remove(4);
       System.out.println(list);
       //int arr[]=lis
        //  arry("9","10","11","143456","1655635");
    }
//     static void arry(String ...ok)
//     {
//         int l=ok.length;
//         System.out.println("length : "+l);
//         for(int i=0;i<l;i++)
//         {
// System.out.println(ok[i]);
//         }
//         System.out.print(Arrays.toString(ok));
//     }
}
