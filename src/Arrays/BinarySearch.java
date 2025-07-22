package Arrays;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target>arr[mid]){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(search(arr,5));
    }
}
