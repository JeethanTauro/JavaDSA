package BinarySearchQuestions;

public class BinarySearchRecursive {
    public static int searchRecursive(int arr[],int element, int low, int high){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == element){
            return mid;
        }
        else if(element < arr[mid]){
            return searchRecursive(arr,element,low,mid-1);
        }
        else{
            return searchRecursive(arr,element,mid+1,high);
        }
    }
    public static void main(String[] args) {
        System.out.println(searchRecursive(new int[]{1,2,3,4,5},2,0,4));
    }
}
