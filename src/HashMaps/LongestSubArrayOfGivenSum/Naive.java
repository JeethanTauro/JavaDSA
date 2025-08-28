package HashMaps.LongestSubArrayOfGivenSum;

import java.util.Map;

//leetocde 325 (its premium)
public class Naive {
    public static int longestSubarray(int[] arr, int target){
        int max_len = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            int len = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum == target ){
                    len = j-i+1;
                    max_len = Math.max(max_len,len);
                }
            }
        }
        return max_len;
    }
    public static void main(String[] args) {

    }
}
