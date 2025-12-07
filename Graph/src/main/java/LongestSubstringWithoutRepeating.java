import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

        String str = "abcdacabd";
        System.out.println(lengthOfLongestSubstring(str));


    }

    private static int lengthOfLongestSubstring(String str) {

        Set<Character> window = new HashSet<>();
        int left = 0 , maxLen = 0;

        for(int right = 0 ; right < str.length() ; right++)
        {
            while (window.contains(str.charAt(right)))
            {
                window.remove(str.charAt(left));
                left++;
            }

            window.add(str.charAt(right));

            maxLen = Math.max(maxLen,right - left+1);
        }

        return maxLen;
    }

}
