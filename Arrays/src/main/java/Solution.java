class Solution {

    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 2;
        num[1] = 0;
        num[2] = 2;
        num[3] = 1;
        num[4] = 0;
        sortColors(num);

        for(int i = 0 ; i < num.length ; i++)
        {
            System.out.println(num[i]);
        }

    }

    public static void sortColors(int[] nums) {

        int low = 0 ;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                int temp = nums[low];

                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high --;
            }
        }

    }
}