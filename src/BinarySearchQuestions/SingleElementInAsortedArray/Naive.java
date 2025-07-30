package BinarySearchQuestions.SingleElementInAsortedArray;

public class Naive {
    public static int unique(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if((arr[i]!=arr[i-1]) && (arr[i]!=arr[i+1])){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(unique(arr));
    }
}
