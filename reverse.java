import java.util.*;
class reverse {
static void rev(int arr[],int i, int j)
{
  int temp;        
  if(i < j)
  {
    temp = arr[i]; 
    arr[i] = arr[j];
    arr[j] = temp;
    rev(arr, ++i, --j);
  } 
}     
 public static void main(String []args) {
       Scanner s=new Scanner(System.in);
       int N=s.nextInt();
        int[] arr=new int[N];
       for(int i=0;i<N;i++)
        {
          arr[i]=s.nextInt();
        }  
        rev(arr, 0, N-1);
        System.out.print("Reversed array is :");
        System.out.println(Arrays.toString(arr)); 
        
    }
}