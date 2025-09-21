package LeetcodePracticingRevising.Leetcode42;

class Optimised {
    public int trap(int[] arr) {
        int n = arr.length;
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = n-1;
        int res = 0;
        while(l < r){
            lmax = Math.max(lmax , arr[l]);
            rmax = Math.max(rmax , arr[r]);
            if(lmax < rmax){
                res = res + (lmax - arr[l]);
                l++;
            }
            else{
                res = res + (rmax - arr[r]);
                r--;
            }
        }

        return res;
    }
}
