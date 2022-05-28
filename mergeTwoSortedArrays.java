public class MyClass {
    public static void swap(int arr[],int i,int j)
    {
        if(arr[i]>arr[j])
        {
            System.out.println("Swaping " +arr[i]+ " to " +arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static boolean isGreater(int arr[], int i, int j)
    {
        if(arr[i] > arr[j])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isSmaller(int arr[], int i, int j)
    {
        if(arr[i] < arr[j])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void mergeSortedArray(int a[], int b[])
    {
        int res[] = new int[a.length + b.length];
        int i =0;
        int j = 0;
        int k =0;
        
        while(i < a.length && j < b.length)
        {
            if(a[i] < b[j])
            {
                res[k] = a[i];
                i++;
                k++;
            }
            else
            {
                res[k] = b[j];
                k++;
                j++;
            }
        }
        while(i < a.length)
        {
            res[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length)
        {
            res[k] = b[j];
            k++;
            j++;
        }
         for(int x = 0; x< a.length + b.length; x++)
        {
            System.out.println(res[x]);
        }
    }
    public static void main(String args[]) {
      int a[]={1,5,9,12,23};
      int b[]={11,16,18,45,56};
      mergeSortedArray(a,b);
    }
}
