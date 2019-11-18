import java.util.HashMap;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-18 12:06
 **/

public class MakeChange {
    public static long makechange(int[] coins, int money, int index, HashMap<String, Long> memo) {
        if (money == 0) {
            return 1;
        }
        if (index >= coins.length) {
            return 0;
        }
        String key = money + "_" + index;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int amountWithCoin = 0;
        long ways = 0;
        while (amountWithCoin <= money) {
            int remaining = money - amountWithCoin;
            ways += makechange(coins, remaining, index + 1, memo);  // here I don't understand
            amountWithCoin += coins[index];
        }
        return ways;
    }
}

