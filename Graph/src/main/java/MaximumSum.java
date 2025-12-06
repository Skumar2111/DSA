public class MaximumSum {

    static int findMaxSum(int[] arr, int k)
    {
        int currentSum = 0;

        for(int i = 0 ; i < k ; i++)
        {
            currentSum += arr[i];
        }

        int max_sum = currentSum;

        for(int i = k ; i < arr.length ; i++)
        {
            currentSum += (arr[i] - arr[i - k]);

            max_sum = Math.max(max_sum,currentSum);
        }
        return max_sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 8, 30, -5, 20, 7};
        int k = 3;

        System.out.println(findMaxSum(arr,k));

    }
}
