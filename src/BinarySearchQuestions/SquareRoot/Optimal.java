package BinarySearchQuestions.SquareRoot;

public class Optimal {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;
        int ans = 0;
        while(low <=  high){
            long mid = (low+high)/2;
            if((mid*mid) == x){
                return (int)mid;
            }
            else if((mid*mid) > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = (int)mid;
            }
        }
        return ans;
    }
}
