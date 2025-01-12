public class SecondElementInArray {

    public static void main(String[] args) {
        int[] array = {32,5,7,4,3,674,74,734,63};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0 ; i < array.length ; i++)
        {
            if(array[i] > first)
            {
                second = first;
                first = array[i];
            }
            else if(array[i] > second && array[i] < first)
            {
                second = array[i];
            }

        }

        System.out.println(second);
    }
}
