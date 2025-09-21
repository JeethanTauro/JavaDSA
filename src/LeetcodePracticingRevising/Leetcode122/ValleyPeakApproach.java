package LeetcodePracticingRevising.Leetcode122;

public class ValleyPeakApproach {
    public static int maxProfits(int[] prices){
        int i = 0;
        int n = prices.length;
        int profit = 0;
        while(i<n-1){
            //to sell i have to buy first
            while(i<n-1 && (prices[i]>=prices[i+1]) ){
                i++;
                //so todays prices is greater than tomorrow
                //i will not buy today so go to next day; till I find a valley
            }

            //now that i found a valley
            int valley = prices[i];

            while(i<n-1 && (prices[i]<=prices[i+1]) ){
                i++;
                //so todays prices is less than tomorrow
                //so i will not sell today go to next day, till i find a peak
            }
            int peak = prices[i];

            profit = profit + peak-valley;

        }
        return profit;

    }
    public static void main(String[] args) {
        System.out.println(maxProfits(new int[]{1,2,3,4,5}));

    }
}
