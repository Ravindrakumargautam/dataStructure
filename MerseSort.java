public class MerseSort {
    
    public static void conquer(int arr[], int si, int mid, int ei)
    {
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        int merge[] = new int[ei-si+1];
        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merge[x++]=arr[idx1++];
            }else{
                merge[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid)
            merge[x++]=arr[idx1++];
        while(idx2<=ei)
            merge[x++]=arr[idx2++];
        for(int i=0,j=si;i<merge.length;i++,j++)
            arr[j]=merge[i];
    }

    public static void devide(int arr[],int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid = (si+ei)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    public static void main(String args[])
    {
        int i, n;
        int arr[]={2,4,3,5,3};
        n=arr.length;
        devide(arr,0,n-1);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
