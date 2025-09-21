package LeetcodePracticingRevising.Leetcode15;

import java.util.*;

//3 sum
public class BruteForce {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> set = new HashSet<>();
            for(int i=0; i<nums.length ;i++){
                for(int j=i+1; j<nums.length;j++){
                    for(int k=j+1;j<nums.length;k++){
                        if((nums[i]+nums[j]+nums[k]) == 0){
                            List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(triplet);  // sort to handle duplicates
                            set.add(triplet);
                        }
                    }
                }
            }
            return new ArrayList<>(set);
        }
}
