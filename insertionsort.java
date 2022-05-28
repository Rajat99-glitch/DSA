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
    
    public static boolean isGreater(int arr, int i, int j)
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
    
    public static boolean isSmaller(int arr, int i, int j)
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
    
    public static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i =0; i<n-1; i++)
        {
            for(int j =i+1; j<n;j++)
            {
               swap(arr, i, j);
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) {
        int arr[]={5,9,8,2,1};
      selectionSort(arr);
      //System.out.println("Sum of x+y = " + selectionSort(arr));
    }
}
