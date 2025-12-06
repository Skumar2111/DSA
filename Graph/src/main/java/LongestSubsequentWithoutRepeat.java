import java.util.HashSet;
import java.util.Set;

public class LongestSubsequentWithoutRepeat {

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(solve(str));
    }

    private static int solve(String str) {
        if(str.length() == 0)
        {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int max_ans = Integer.MIN_VALUE;
        int left_ptr = 0;

        for(int right_ptr = 0 ; right_ptr < str.length() ; right_ptr ++)
        {
            if(set.contains(str.charAt(right_ptr)))
            {
                while(left_ptr < right_ptr && set.contains(str.charAt(right_ptr)))
                {
                    set.remove(str.charAt(left_ptr));
                    left_ptr++;
                }
            }

            set.add(str.charAt(right_ptr));
            max_ans = Math.max(max_ans, right_ptr - left_ptr + 1);
        }

        return max_ans;
    }

}
