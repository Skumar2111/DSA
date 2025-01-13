public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int temp;

        int start = 0;
        int end = array.length - 1;

        while(start < end)
        {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start ++;
            end --;
        }


        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.println(array[i]);
        }

    }
}
