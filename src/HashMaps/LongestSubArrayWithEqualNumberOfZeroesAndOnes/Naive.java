package HashMaps.LongestSubArrayWithEqualNumberOfZeroesAndOnes;

public class Naive {
    public static int longestSubarray(int[] arr){

        int max_len = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int p = i;
                int count_1 = 0;
                int count_0 = 0;
                int len = 0;
                while(p<=j){

                    if(arr[p] == 1){
                        count_1++;
                    }
                    else if(arr[p] == 0){
                        count_0++;
                    }
                    if(count_0 == count_1){
                        len = j-i+1;
                        max_len = Math.max(max_len,len);
                    }
                    p++;
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
