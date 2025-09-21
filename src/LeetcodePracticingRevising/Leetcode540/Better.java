package LeetcodePracticingRevising.Leetcode540;

class Better {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int high = n-1;
        int low = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(( mid==0 || arr[mid]!=arr[mid-1]) && ( mid==n-1 || arr[mid]!=arr[mid+1])){
                return arr[mid];
            }
            if(mid%2 == 0){
                if(arr[mid] == arr[mid-1]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid] == arr[mid-1]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
