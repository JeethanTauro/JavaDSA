package BinarySearchQuestions;


//
class SearchInRotatedArray {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            //if the left half is sorted we can check if the target is in the left side
            if(arr[low]<=arr[mid]){
                //if the target is in that range contiue going to the left side
                if(target >= arr[low] && target < arr[mid]){
                    high = mid-1;
                }
                //if not in that range then go to the right side
                else{
                    low = mid+1;
                }

            }
            //if the right half is sorted we can check if the target is in the right side
            else{
                //if the target is in that range continue goin to the right side
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }
                //if target is not in that range lets go to the left side
                else{
                    high = mid-1;
                }

            }
        }
        return -1;
    }
}
