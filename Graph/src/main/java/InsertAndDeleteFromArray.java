import java.util.ArrayList;
import java.util.List;

public class InsertAndDeleteFromArray {

    public static void main(String[] args) {

       int[] array = new int[10];
       array[0] = 1;
       array[1] = 2;
       array[2] = 3;
       array[3] = 4;
       array[4] = 6;
       array[5] = 7;
       array[6] = 8;

       int number = 5;
       int index = 4;
       int temp = array[index];
        addElement(array, number, index);

        for(int i = 0 ; i < array.length ; i++)
       {
           System.out.println(array[i]);
       }

        removeElement(array,3);

        System.out.println("Array after removal");

        for(int i = 0 ;i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }

    private static void addElement(int[] array, int number, int index) {
        int temp;

        for(; index < array.length; index++)
        {
            temp = array[index];
            array[index] = number;
            number = temp;
        }
    }


    public static void removeElement(int[] array, int removeIndex)
    {
        int temp = array[removeIndex];
        for(; removeIndex < array.length - 1; removeIndex++)
        {
            temp = array[removeIndex + 1];
            array[removeIndex] = temp;
        }
    }

}
