public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int size = longestOnes(arr,k);
    }

    private static int longestOnes(int[] arr, int k) {

        int left = 0;
        int maxLen = 0;
        int zeros = 0;

        for(int right = 0 ; right < arr.length ; right++)
        {
            if(arr[right] == 0) zeros++;

            while(zeros > k)
            {
                if(arr[left] == 0) zeros--;
                left++;
            }

            maxLen = Math.max(maxLen,right - left + 1);
        }

        return maxLen;
    }
}
