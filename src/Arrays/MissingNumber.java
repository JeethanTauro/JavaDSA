package Arrays;

//leetcode 268
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum  = (n*(n+1))/2;
        int sum_of_array = 0;
        for(int i=0;i<n;i++){
            sum_of_array += nums[i];
        }
        return sum-sum_of_array;
    }

    public static void main(String[] args) {
        int[] arr= {0,1,3};
        System.out.println(missingNumber(arr));
    }
}
