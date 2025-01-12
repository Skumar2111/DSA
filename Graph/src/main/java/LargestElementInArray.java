public class LargestElementInArray {

    public static void main(String[] args) {

        int[] array = {32,5,7,4,3,674,74,734,63};

        int max = 0;

        for(int i = 0 ; i < array.length ; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
