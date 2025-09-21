package LeetcodePracticingRevising.Leetcode122;

//so basically if the price is greater tomorrow buy the stock today and sell tomorrow.
//so then sum up all the profit.
// we are using a greedy approah where we take local profits and we finally get th global profit

public class Greedy {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
