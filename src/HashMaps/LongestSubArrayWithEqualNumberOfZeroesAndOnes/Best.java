package HashMaps.LongestSubArrayWithEqualNumberOfZeroesAndOnes;
import HashMaps.LongestSubArrayOfGivenSum.Better;

public class Best {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1};
        for(int i=0;i< arr.length;i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        System.out.println(Better.longestSubarray(arr,0));
    }
}
