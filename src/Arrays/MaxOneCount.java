package Arrays;

//leetcode 485
public class MaxOneCount {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int curr_count = 0;
            int max_count = 0;
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(nums[i] == 1){
                    curr_count++;
                    if(curr_count>max_count){
                        max_count = curr_count;
                    }
                }
                else{
                    curr_count=0;
                }
            }
            return max_count;
        }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,1,0,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
