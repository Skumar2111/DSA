public class RemoveDuplicateInSorted {

    public static void main(String[] args) {

        int[] array = {1,2,2,3,4,5,7,7};

        int result = 1;

        for(int i = 1 ; i < array.length - 1 ; i++)
        {
            if(array[result - 1] != array[i] )
            {
                array[result] = array[i];
                result ++;
            }
        }

        
    }

}
