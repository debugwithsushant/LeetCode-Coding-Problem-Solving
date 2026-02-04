// 121. Best Time to Buy and Sell Stock

public class Day7 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int currentProfit = price - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Day7 day7 = new Day7();

        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = day7.maxProfit(prices);
        
        System.out.println(result);
    }
}
