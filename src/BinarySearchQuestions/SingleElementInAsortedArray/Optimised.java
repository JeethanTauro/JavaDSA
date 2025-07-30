package BinarySearchQuestions.SingleElementInAsortedArray;

public class Optimised {
    public static int unique(int[] arr){
        int low = 1;
        int high = arr.length-2;
        if(arr.length == 1){ //if only 1 element return that
            return arr[0];
        }
        // what if the unique element is at 0 or n-1, we are taking low and high at 1 and n-2
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[arr.length-1] != arr[arr.length-2]){
            return arr[arr.length-1];
        }

        while(low<=high){
            int mid = (low+high)/2;
            if((arr[mid] != arr[mid-1]) && (arr[mid]!=arr[mid+1])){
                return arr[mid];
            }
            //if i am at odd and the previous element is equal, so (even,odd) so element at right half
            //if i am at even and the next element is equal so (even odd)
            if((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])){
                low = mid+1;
            }
            //if i am at odd and the next element is equal, so (odd,even) so element at left half
            //if i am at even and the previous element is equal so (odd,evem)
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(unique(arr));
    }
}
