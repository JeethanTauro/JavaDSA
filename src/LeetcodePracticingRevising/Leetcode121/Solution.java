package LeetcodePracticingRevising.Leetcode121;

//let me imagine every day is a selling day
// now when i am selling , i must see in the prevoious day which day it was minimum,
// keep the track of minimum using as best_buy
// profit  = curr_price - min_price_previous_days
//then from all the profits we need the maximum

public class Solution {
    public static int maxProfit(int[] prices) {
        int best_buy = 9999;
        int max_profit = 0;
        for(int i=0;i<prices.length;i++){
            best_buy = Math.min(best_buy,prices[i]); //keeping track of the minimum price as the best price
            max_profit = Math.max(max_profit , prices[i]-best_buy); // now we are selling on the ith day , so we do prices[i]-best_buy and we get the profit

        }
        return max_profit;

    }

    public static void main(String[] args) {

    }

}
