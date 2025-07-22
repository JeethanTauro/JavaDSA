package Arrays;

//leetcode 35
//find the target, if not found , return the correct index of the target in the array
// it will finally be just i
public class SearchInsertPosition {
    public static int search(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return i;

    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7};
        System.out.println(search(arr,2));

    }
}
