package Arrays;

import java.util.Arrays;

//leetcode 189
//rotating the array by k elements
public class RotateRightByK {
    public static void rotate(int[] arr,int k){
            for(int i=0;i<k;i++){
                int j = arr.length-1;
                int temp=arr[j];
                while(j>=1){
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[0] = temp;
            }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9};
        rotate(arr,1);
        System.out.println(Arrays.toString(arr));

    }
}
