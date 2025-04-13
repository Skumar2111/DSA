public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
 
        int start = 0;
        int end = arr.length - 1;
        int value = 2;
        binarySearch(arr,start,end,value);

    }

    private static void binarySearch(int[] arr, int start , int end ,int value) {

        int mid = (start + end) / 2;

        while(end >= start)
        {
            if(arr[mid] == value)
            {
                System.out.println("Found");
                return;
            }
            if(arr[mid] > value)
            {
                binarySearch(arr,start,mid-1,value);
                return;
            }
            else if(arr[mid] < value)
            {
                binarySearch(arr,mid+1,end,value);
                return;
            }
        }


    }
}
