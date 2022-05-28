public class Findswapnumbers {
    public static void swap(int arr[],int i,int j)
    {
            System.out.println("Swaping " +arr[i]+ " to " +arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    public static boolean isGreater(int arr[], int i, int j)
    {
        if(arr[i] > arr[j])
            return true;
        else
            return false;
    }
    public static boolean isSmaller(int arr[], int i, int j)
    {
        if(arr[i] < arr[j])
            return true;
        else
            return false;
    }
    public static void insertionSort(int arr[])
    {
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            for(int j = i-1; j>=0; j--)
            {
                if(isGreater(arr, j, j+1))
                {
                    swap(arr, j+1 , j);
                }
            }
        }
    }
    public static void main(String args[]) {
        int arr[]={5,9,8,2,1};
      insertionSort(arr);
      for(int i =0; i<arr.length; i++)
      {
         System.out.println(arr[i]);
      }
      //System.out.println("Sum of x+y = " + selectionSort(arr));
    }
}
