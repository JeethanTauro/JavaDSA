package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] arr){
        int j = arr.length - 1;
        int i=0;
        while(i<j){
            if((arr[i] == 0 && arr[j]==0)){
                //if ur current and the end number is zero then decrement j so that u dont swap 0 with 0
                j--;
            }
            else if(arr[i] == 0 && arr[j]!=0){
                //after swapping, decrement the j and increment the j
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
                i++;
            }
            else{
                // if its a non zero number increment i
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,0,2,1,2,3,0,4,4,0,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr)); // doesn't guarantee the order

    }
}
