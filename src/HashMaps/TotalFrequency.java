package HashMaps;

//leetcode 3005
import java.util.*;

class TotalFrequency {
    public static int maxFrequencyElements(int[] nums) {
        int max = 0;
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // find max frequency
        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }

        // sum up all occurrences with max frequency
        for (int freq : map.values()) {
            if (freq == max) {
                total += freq;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(arr));
    }
}
