package HashMaps.LongestSubArrayWithEqualNumberOfZeroesAndOnes;

public class Better {
    public static int longestSubarray(int[] arr){
        int max_len = 0;
        for(int i=0;i<arr.length;i++){
            int count_0=0;
            int count_1=0;
            for(int j=i ; j<arr.length;j++){

                int len =0 ;
                if(arr[j] == 0){
                    count_0++;
                }
                else {
                    count_1++;
                }
                if(count_0 == count_1){
                    len = j-i+1;
                    max_len = Math.max(len,max_len);
                }
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,0,1,1,0,0};
        int[] arr2 = {1,1,1,1};
        int[] arr3 = {0,0,1,0,1,1};
        System.out.println(longestSubarray(arr3));

    }
}
