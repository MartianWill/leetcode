import java.util.Arrays;

public class Coin {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0)
                    continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        if (dp[amount] == amount + 1)
            return -1;
        else
            return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
