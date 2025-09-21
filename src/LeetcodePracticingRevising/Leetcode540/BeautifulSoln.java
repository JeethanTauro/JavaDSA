package LeetcodePracticingRevising.Leetcode540;

public class BeautifulSoln {
        public int singleNonDuplicate(int[] nums) {
            int n = nums.length;
            int result=0;
            for(int i=0; i<n; i++){
                result^=nums[i];
            }
            return result;
        }

}
