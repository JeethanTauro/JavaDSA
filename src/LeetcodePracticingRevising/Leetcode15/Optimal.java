package LeetcodePracticingRevising.Leetcode15;

import java.util.Collections;
import java.util.HashSet;
import java.util.*;


public class Optimal {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int k = nums.length-1;
            int j = i+1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> triplets = Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(triplets);
                    result.add(triplets);
                    j++;
                    k--;

                    //skips duplicates
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
