package LeetcodePracticingRevising.Leetcode42;

class Naive {
    public int trap(int[] arr) {
        int n = arr.length;
        int res = 0;

        for(int i=1;i<n-1;i++){
            //left side of i
            int lmax = arr[i];
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax , arr[j]);
            }
            //right side of i
            int rmax = arr[i];
            for(int j=i+1;j<n;j++){
                rmax = Math.max(rmax,arr[j]);
            }
            res = res+(Math.min(lmax,rmax)-arr[i]);
        }

        return res;
    }
}
