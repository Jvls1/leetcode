package easy;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] ints = new int[6];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 5;
        ints[3] = 3;
        ints[4] = 6;
        ints[5] = 4;
        System.out.println(maxProfit(ints));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            if(prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
