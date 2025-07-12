package Arrays;

public class SecondLargestBetter {
    public static int FindsecondLargest(int[] arr){
        int largest = 0;
        int secondLargest = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = i;
            }
            else if(arr[i]>arr[secondLargest] && arr[i]!=arr[largest]){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int secondLargest = FindsecondLargest(arr);
        System.out.println(arr[secondLargest]);
    }
}
