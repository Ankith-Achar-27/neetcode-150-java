
package SlidingWindow;

public class BuySellStock121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {

        // Initialize two pointers: left represents buying day,
        // right represents selling day.
        int left = 0;
        int right = 1;

        // Stores the maximum profit found so far.
        int maxProfit = 0;

        // Traverse the array while the selling pointer is within bounds.
        while (right < prices.length) {

            // If the current selling price is greater than the buying price,
            // calculate the profit and update the maximum profit.
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }

            // If the current price is lower, consider it as a new buying day.
            else {
                left = right;
            }

            // Move the selling pointer to the next day.
            right++;
        }

        return maxProfit;
    }
}
