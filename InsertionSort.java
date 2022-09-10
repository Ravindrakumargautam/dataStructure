import java.util.Scanner;
public class InsertionSort {
    public static void main(String args[])
    {
        int i,j,temp,size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value of array: ");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(i=1;i<size;i++)
        {
            j=i-1;
            while(j>=0 && arr[j]>arr[j+1])
            {
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
        }
        
        System.out.println("list of array is :");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
