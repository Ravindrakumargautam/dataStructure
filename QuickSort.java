public class QuickSort {

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        int temp;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pividx = partition(arr, low, high);
            quickSort(arr, low, pividx-1);
            quickSort(arr, pividx+1, high);
        }
        
    }
    public static void main(String args[])
    {
        int arr[] = {3,2,6,4,7,2};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

    }
}
