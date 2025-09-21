package LeetcodePracticingRevising.Leetcode540;

public class Naive {
    public static int singleElement(int[] arr){
        //handling the extreme ends
        if(arr.length == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[arr.length-1] != arr[arr.length-2]){
            return arr[arr.length-1];
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(singleElement(new int[]{1,1,2,3,3,4,4,8,8}));
    }
}
