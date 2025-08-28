package HashMaps.BinarySubArraysWithSum;

public class Naive {
    public static int subarrays(int[] arr, int target){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        System.out.println(subarrays(arr,3));
    }
}
