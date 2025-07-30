package BinarySearchQuestions.FirstAndLastOccurance;

import java.util.Arrays;

public class Naive {
    public static int[] occurences(int[] arr, int ele){
        int[] occurencesArr = {-1,-1};
        for(int i=0;i<arr.length;i++){
            //first occurence of the element
            if(ele == arr[i] && occurencesArr[0]==-1){
                occurencesArr[0] = i;
                occurencesArr[1] = i;
            }
            else if(ele == arr[i]){
                occurencesArr[1] = i;
            }
        }
        return occurencesArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,8,8,11};
        System.out.println(Arrays.toString(occurences(arr,3)));

    }
}
