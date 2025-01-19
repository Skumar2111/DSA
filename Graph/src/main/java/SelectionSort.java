public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};

        int[] op = selectionSort(arr);

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(op[i]);
        }

    }

    private static int[] selectionSort(int[] arr) {

        for(int i = 0 ; i < arr.length ; i++) {

            int min_ind = i;

            for(int j = i + 1 ; j < arr.length ; j++) {

                if(arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }

        return  arr;
        }
    }

