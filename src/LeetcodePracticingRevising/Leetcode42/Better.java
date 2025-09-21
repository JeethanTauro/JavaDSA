package LeetcodePracticingRevising.Leetcode42;

class Better {
    public int trap(int[] arr) {
        int res = 0 ;
        int n = arr.length;

        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];

        // compute left max for each index
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }

        // compute right max for each index
        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }


        for(int i=0;i<n;i++){
            res = res + (Math.min(lmax[i],rmax[i]) - arr[i]);
        }

        return res;
    }
}
