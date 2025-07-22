package Arrays;

//leetcode560
//find the total number of subarrays whose sum is equal to 'k'
class FindSubarraySumBruteForce {
    public static int subArray(int[] arr, int k) {
        int subArrayCount = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == k) {
                    subArrayCount++;
                }
            }
        }
        return subArrayCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(subArray(arr,3));
    }

}


