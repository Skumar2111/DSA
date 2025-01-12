public class PrefixSum {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        int[] prefix_sum = new int[array.length];
        int l = 0;
        int r = 4;
        int initial = 0;
        for(int i = 0 ; i < array.length ; i++)
        {
            prefix_sum[i] = initial + array[i];
            initial = prefix_sum[i];
        }
        System.out.println(prefixSum(array,prefix_sum,l,r));
    }

    private static int prefixSum(int[] array, int[] prefix_sum, int l, int r) {

        if(l == 0)
        {
            return prefix_sum[r];
        }
        else
        {
            return prefix_sum[r] - prefix_sum[l - 1];
        }
    }
}
