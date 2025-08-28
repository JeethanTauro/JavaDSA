package HashMaps.LongestConsecutiveSubsequence;

import java.util.HashSet;

public class Better {
    public static int longestSubsequence(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        int max_count = 1;
        for(int x : set){
            if(!set.contains(x-1)){
                int curr = 1;
                while(set.contains(x+curr)){
                    curr++;
                }
                max_count = Math.max(curr, max_count);
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,3,4,2,20};
        System.out.println(longestSubsequence(arr));
    }
}
