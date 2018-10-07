import java.util.Scanner;
class maxval
{
static int maximumvalue(int array[],int size) 
{ 
         int i; 
         int max = array[0]; 
        
         for (i = 1; i < size; i++) 
             if (array[i] > max) 
                 max = array[i]; 
        
         return max; 
} 
public static void main(String[ ] args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter no. of elements:");
int N=s.nextInt();
int[ ] arr=new int[N];
System.out.println("Enter array elements:");
for(int i=0;i<N;i++)
{
  arr[i]=s.nextInt();
}
System.out.println(+ maximumvalue(arr,N));
}
}