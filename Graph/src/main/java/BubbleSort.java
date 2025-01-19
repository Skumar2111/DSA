public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {3,1,5,2,6};

        int[] sorted = bubbleSort(arr);

        for(int i=0 ; i < arr.length ; i++)
        {
            System.out.println(sorted[i]);
        }

    }

    private static int[] bubbleSort(int[] arr) {

        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            for(int j = 0 ; j < arr.length-1 ; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }

    private static void swap(int i, int i1) {


    }
}
