import java.util.*;
class intersection
 {
   public static void main(String [] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter no. of elements in 1st array : ");
      int n=s.nextInt();
      int[ ] arr=new int[n];
      System.out.println("Enter elements of first array : ");
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      System.out.println("Enter no. of elements of 2nd array : ");
      int m=s.nextInt();
      int[ ] arr2=new int[m];	  
      System.out.println("Enter elements of second array: ");
      for(int i=0;i<m;i++)
      {
        arr2[i]=s.nextInt();
      }
      
	  System.out.println("Intersection of the two arrays ::");
     
      for(int i = 0; i<n; i++ ) {
         for(int j = 0; j<m; j++) {
            if(arr[i]==arr2[j]) {
               System.out.println(arr2[j]);
            }
         }
      }
   }
}