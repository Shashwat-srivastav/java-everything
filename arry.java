public class arry {
    public static void main(String args[])
    {

        int nums1[]={1,2};
        int nums2[]={3,4};
        int l1=nums1.length;
        int l2=nums2.length;
        int mergel=l1+l2;
       // System.out.println(mergel);
        int merge[]=new int[mergel];
        for(int i=0;i<l1;i++)
        {
            
            // if(i<=l1)
            {merge[i]=nums1[i];
            }
            
        }
        // if(i>l1)
        for(int j=0;j<l2;j++)
        {
            {
            merge[j+l1]=nums2[j];
            }
        }
      //  System.out.println(merge);    
      for(int x=0;x<mergel;x++)
      {
          for(int y=0;y<mergel;y++)
          {
              if(merge[x]<merge[y])
              {
                  int temp;
                  temp=merge[x];
                  merge[x]=merge[y];
                  merge[y]=temp;
              }
          }
      }
      for(int x=0;x<mergel;x++)
      {
        System.out.print(merge[x]+","); 
      }
      System.out.println("");
      double median=0;
      if(mergel%2==1)
      {
      int med=mergel/2;
       median= merge[med]; 
    //   System.out.println(med); 
      }
      if(mergel%2==0)
      {
          int index1=mergel/2;
          median=(double)(merge[index1]+merge[index1-1])/2;
        //   System.out.println(median);
        //   System.out.println(index1);
        //   System.out.println(index1-1);
      }
      System.out.println(median);
    }
}
