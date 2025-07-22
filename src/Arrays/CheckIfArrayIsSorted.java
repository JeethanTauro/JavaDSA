package Arrays;

//have to check if array is sorted and rotated
public class CheckIfArrayIsSorted {
        public static boolean check(int[] nums) {
            int n = nums.length;
            int count = 0;
            if(nums[n-1]>nums[0]){
                count++;
            }
            for(int i=0;i<n-1;i++){
                if(nums[i] > nums[i+1]){
                    count++;
                }
            }
            if(count > 1){
                return false;
            }
            else{
                return true;
            }
        }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,1};
        System.out.println(check(nums));

    }
}

