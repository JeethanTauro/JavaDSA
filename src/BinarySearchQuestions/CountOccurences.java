package BinarySearchQuestions;

public class CountOccurences {
    public static int findLastOccurence(int[] arr, int element){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(element < arr[mid]){
                high = mid -1;
            }
            else if(element>arr[mid]){
                low = mid+1;
            }
            else {
                if(mid== arr.length-1 || arr[mid+1] != arr[mid]){
                    return mid;
                }
                low = mid+1;
            }
        }
        return -1;
    }

    public static int findFirstOccurence(int[] arr, int element){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(element < arr[mid]){
                high = mid -1;
            }
            else if(element>arr[mid]){
                low = mid+1;
            }
            else {
                if(mid==0 || arr[mid-1] != arr[mid]){
                    return mid;
                }
                high = mid-1;
            }
        }
        return -1;
    }
    public static int occurences(int[] arr, int element){
        int first_occurrence = -1;
        int last_occurrence = -1;

        first_occurrence = findFirstOccurence(arr, element);
        last_occurrence = findLastOccurence(arr,element);


        return last_occurrence-first_occurrence+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        System.out.println(occurences(arr,15));
    }
}
