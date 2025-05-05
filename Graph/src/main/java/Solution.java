// A Java program to count the number of subsets with a
// sum equal to a target using recursion
import java.util.*;

class GfG {

    // Function to recursively count subsets with a given sum
    static int countSubsets(int i, int currentSum, int target, int[] arr) {
        int n = arr.length;

        // Base case: If we've processed all elements in the array
        if (i == n) {

            // Return 1 if the current subset's sum equals 
            // the target, else return 0
            return (currentSum == target) ? 1 : 0;
        }

        // Case 1: Exclude the current element
        System.out.println("Executing exclude for i + 1 "+i);

        int exclude = countSubsets(i + 1, currentSum, target, arr);

        // Case 2: Include the current element in the subset
        int include = 0;

        // Only include the current element if adding it 
        // does not exceed the target sum
        if (arr[i] + currentSum <= target) {
            System.out.println("Executing include for i + 1 "+i);

            include = countSubsets(i + 1, currentSum + arr[i], target, arr);
        }

        // Return the total count of subsets
        System.out.println("Returning");
        return include + exclude;
    }

    static int perfectSum(int[] arr, int target) {

        return countSubsets(0, 0, target, arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3};
        int target = 6;
        System.out.println(perfectSum(arr, target));
    }
}