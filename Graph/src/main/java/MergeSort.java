public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[5];
        mergeSort(arr, 0 , arr.length-1);

    }

    private static void mergeSort(int[] arr, int left, int right) {

        if(right > left)
        {
            int mid = left + (left - right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid +1, right );
            merge(arr,left,mid,right);

        }

    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = (mid - left)+1;
        int n2 = right - mid;

        int [] left_arr = new int[n1];
        int[] right_arr = new int[n2];

        for(int i = 0 ; i < n1 ; i++)
        {

            left_arr[i] = arr[left + i];
        }

        for(int j = 0 ; j < n2 ; j++)
        {

            right_arr[j] = arr[mid + j + 1];
        }

        int i = 0 ; int j = 0;  int k = left;

        while( i  < n1 && j < n2)
        {
            if(left_arr[i] <= right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
                k++;
            }
            else
            {
                arr[k] =  right_arr[j];
                j++;
                k++;
            }
        }

        while(i < n1)
        {
            arr[k] = left_arr[i] ;
            i++;
            k++;
        }

        while(j < n2)
        {
            arr[k] = right_arr[j];
            j++;
            k++;
        }
    }

}
