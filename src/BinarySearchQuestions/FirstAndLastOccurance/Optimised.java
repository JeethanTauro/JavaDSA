package BinarySearchQuestions.FirstAndLastOccurance;

import java.util.Arrays;

public class Optimised {
    public static int[] occurences(int[] arr, int ele){
        int[] occurencesArr = {-1,-1};
        int low = 0;
        int high = arr.length-1;
        //first occurences
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == ele){
               occurencesArr[0] =mid;
               high = mid-1;
            }
            else if(arr[mid]<ele){
                low = mid+1;
            }
            else {
                high=mid-1;
            }
        }

         low = 0;
         high = arr.length-1;
        //last occurence
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == ele){
                occurencesArr[1] =mid;
               low = mid+1;
            }
            else if(arr[mid]<ele){
                low = mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return occurencesArr;

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        System.out.println(Arrays.toString(occurences(arr,8)));

    }
}
