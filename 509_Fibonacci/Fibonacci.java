/**
 * Fibonacci
 */
public class Fibonacci {
    /* recursive */
    // public static int fib(int n) {
    // if (n == 0)
    // return 0;
    // if (n == 1 || n == 2)
    // return 1;

    // return fib(n - 1) + fib(n - 2);
    // }

    /* use an extra helper to do the task */
    // public static int fib(int n) {
    // if (n == 0)
    // return 0;
    // int[] memo = new int[n + 1];
    // return helper(memo, n);
    // }
    // public static int helper(int[] memo, int n) {
    // if (n == 1 || n == 2)
    // return 1;
    // if (memo[n] != 0)
    // return memo[n];
    // memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
    // return memo[n];
    // }

    /* simplify */
    // public static int fib(int n) {
    // if (n == 0)
    // return 0;
    // if (n == 1 || n == 2)
    // return 1;
    // int[] dp = new int[n + 1];
    // dp[1] = dp[2] = 1;

    // for (int i = 3; i < dp.length; i++) {
    // dp[i] = dp[i - 1] + dp[i - 2];
    // }
    // return dp[n];
    // }

    /* further */
    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 18;
        System.out.println(fib(n));
    }
}
