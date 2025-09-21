package BinarySearchQuestions;

public class BinarySearch {
    public static int search(int[] sortedArray, int element){
        int low = 0;
        int high = sortedArray.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if(sortedArray[mid] == element){
                return mid;
            }
            else if(element < sortedArray[mid]){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5},2));
    }
}
