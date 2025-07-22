package Arrays;

import java.util.HashMap;
import java.util.Map;

//we have to keep the ordering same and remove the duplicates and return the
// number of unique elements.
//leetcode 26
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] arr){
        int length = arr.length;
        int i=0;
        for(int j=0;j<length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,2,2,2,2,2,2,3,3,4,4,4,5,5};
        System.out.println(removeDuplicates(arr));

    }
}
