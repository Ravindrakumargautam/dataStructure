import java.util.*;
public class SelectionSort
{
    public static void main(String args[])
    {
        int i,j,temp,size;
        int pos;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the value of array: ");
            for(i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }

            for(i=0;i<size;i++)
            {
                int min=arr[i];
                pos=i;
                for(j=i+1;j<size;j++)
                {
                    if(min>arr[j])
                    {
                        min=arr[j];
                        pos=j;
                    }
                }
                temp=arr[i];
                arr[i]=min;
                arr[pos]=temp;
            }

            System.out.println("list of array is :");
            for(i=0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
        
    }
}