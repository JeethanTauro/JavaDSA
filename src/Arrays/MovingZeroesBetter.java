package Arrays;

import java.util.Arrays;

//leetcode 283
public class MovingZeroesBetter {
    public static void moveZeroes(int[] arr){
        int index = 0; // to place the next non-zero number
        //move all non-zero forward
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        //filling the zeroes
        while(index < arr.length){
            arr[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,20,1,2,0,0,0,2,2,3,0,3};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}
