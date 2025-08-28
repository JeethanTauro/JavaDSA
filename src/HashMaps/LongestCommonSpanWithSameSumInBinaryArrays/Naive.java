package HashMaps.LongestCommonSpanWithSameSumInBinaryArrays;

public class Naive {
    public static int longestBinarySubarray(int[] arr1, int[] arr2){
        int max_len = 0;
        for(int i=0;i<arr1.length;i++){
            int sum_arr1= 0;
            int sum_arr2 = 0;
            int len = 0;
            for(int j=i;j<arr1.length;j++){
                sum_arr1 = sum_arr1 + arr1[j];
                sum_arr2 = sum_arr2 + arr2[j];

                if(sum_arr2 == sum_arr1){
                    len = j-i+1;
                    max_len = Math.max(max_len,len);
                }
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,1,1};
        int[] arr2 = {0,0,0,0,0};
        System.out.println(longestBinarySubarray(arr1,arr2));
    }
}
