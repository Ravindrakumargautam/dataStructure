import java.util.Scanner;
public class BubbleSort {
    public static void main(String args[])
    {
        int size,i,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array list: ");
        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }

        System.out.println("Sorted array is: ");
        for(i=0;i<size;i++)
        System.out.println(arr[i]);
        sc.close();
    }
}
