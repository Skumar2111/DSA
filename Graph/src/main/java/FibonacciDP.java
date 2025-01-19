import java.util.Arrays;

public class FibonacciDP {

    public static void main(String[] args) {

        int fib_n = 5;

        int[] memo = new int[fib_n+1];

        Arrays.fill(memo,-1);

        System.out.println(fibonacci(memo , fib_n));


    }

    private static int fibonacci(int[] memo , int fib_n) {

        if(memo[fib_n] == -1)
        {
            int res;
            if(fib_n == 0 || fib_n == 1)
            {
                res = fib_n;
            }
            else
            {
                res = fibonacci(memo,fib_n -1) + fibonacci(memo,fib_n - 2);
            }
            memo[fib_n] = res;
        }
        return memo[fib_n];
    }
}
