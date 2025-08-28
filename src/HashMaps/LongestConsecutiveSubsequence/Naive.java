package HashMaps.LongestConsecutiveSubsequence;


import java.util.Arrays;

public class Naive {
    public static int longestSubsequence(int[] arr){
        Arrays.sort(arr); //nlogn
        int count = 1;
        int max_count = 1;
        for(int i=1;i<arr.length;i++){
            if((arr[i] - arr[i-1]) == 1){
                count++;
                max_count = Math.max(count,max_count);
            } else if ((arr[i] - arr[i-1]) == 0) {
                continue; //handling the duplicates
            } else {
                count = 1;
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,3,4,2,20};
        System.out.println(longestSubsequence(arr));
    }
}
