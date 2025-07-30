package BinarySearchQuestions;

//leetcode 153
public class FindMinimumInSortedRotatedArray {
        public static int minRotated(int[] arr){
            int low = 0;
            int high = arr.length-1;
            int ans = 9999; //max integer
            while(low<=high){
                int mid = (high+low)/2;
                if(arr[low] <= arr[high]){//if left and right both are sorted then arr[low] is min
                    ans = Math.min(arr[low],ans);
                    break;
                }
                if(arr[low]<=arr[mid]){ //if the left part of array is sorted
                    ans = Math.min(ans,low);
                    low = mid+1;
                }
                else{//if the right part of array is sorted
                    ans = Math.min(ans,mid);
                    high = mid-1;
                }
            }
            //now ans is the minimum value, we need to find the index of the minimum value
            return ans;
        }
        public static void main(String[] args) {
            int[] arr = {3,4,5,1,2};
            System.out.println(minRotated(arr));
        }

}


