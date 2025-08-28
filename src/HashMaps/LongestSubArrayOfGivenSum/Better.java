package HashMaps.LongestSubArrayOfGivenSum;

import java.util.HashMap;

public class Better {
    public static int longestSubarray(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        int max_len = 0;
        for(int i=0;i<arr.length;i++){
            int len = 0;
            prefix = prefix + arr[i];
            map.putIfAbsent(prefix,i);
            if(prefix == target){
                max_len = i + 1;
            }
            if(map.containsKey(prefix-target)){
                len = i-map.get(prefix-target);
                max_len = Math.max(max_len,len);
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int[] arr = {9,4,20,3,10,5};
        System.out.println(longestSubarray(arr,33));
    }
}
