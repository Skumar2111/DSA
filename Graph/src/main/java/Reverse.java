public class Reverse {

    public static void main(String[] args) {

        reverse(5);

    }

    private static void reverse(int i) {

        if( i != 0)
        {
            System.out.println(""+i);
            reverse(i-1);

        }
    }
}
