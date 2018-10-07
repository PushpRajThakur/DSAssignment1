import java.util.*;
class sorting
{
    static void sort(int arr[],int n)
    {
        
        for (int i = 0; i <n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    static void print(int arr[],int n)
    {
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n=S.nextInt();
        int[ ] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
          arr[i]=S.nextInt();
        }
        sort(arr,n);
   
        print(arr,n);
    }
}