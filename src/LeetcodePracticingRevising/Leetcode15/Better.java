package LeetcodePracticingRevising.Leetcode15;

import java.util.*;

public class Better {
    public static List<List<Integer>> Sum3(int[] nums){
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>(); // ✅ reset for each i

            for (int j = i + 1; j < nums.length; j++) {
                int complement = - (nums[i] + nums[j]);

                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
                seen.add(nums[j]); // ✅ add only nums[j], not nums[i]
            }
        }
        return new ArrayList<>(result);
    }
}
