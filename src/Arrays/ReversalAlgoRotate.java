package Arrays;

import java.util.Arrays;

public class ReversalAlgoRotate {
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k=k % n; //to handle k>n;
        //step 1 : reverse the entire array
        //step 2: reverse the first k elements
        //step 3: reverse the remaining n-1
        reverse(arr , 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
