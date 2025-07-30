package BinarySearchQuestions;

import java.util.Arrays;
import java.util.Map;

//An array will be given eg: [3,4,5,1,2]
//but we know the sorted orignal is [1,2,3,4,5]
// so how many times is th eoriginal array rotated
//so we just need to find the minimum in the array
// the minimum value index is the answer
public class FindNumberOfRotationsInAsortedArray {
    public static int rotated(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = 9999; //max integer
        int index = -1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[low] <= arr[high]){//if left and right both are sorted then arr[low] is min
                if(arr[low]<ans){
                    ans = arr[low];
                    index = low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){ //if the left part of array is sorted
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;

            }
            else{//if the right part of array is sorted
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                high = mid-1;
            }
        }
        //now ans is the minimum value, we need to find the index of the minimum value
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(rotated(arr));
    }

}
