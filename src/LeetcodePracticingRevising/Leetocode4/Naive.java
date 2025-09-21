package LeetcodePracticingRevising.Leetocode4;

import java.util.*;
class Naive {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] median_array = new int[nums1.length+nums2.length];
        int n = median_array.length;
        double result = 0;
        for(int i=0; i <nums1.length ; i++){
            median_array[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            median_array[nums1.length + j] = nums2[j];
        }
        Arrays.sort(median_array);
        if(median_array.length%2 == 0){
            result = (median_array[(n/2) - 1] + median_array[n/2]) / 2.0;
            return result;
        }
        if(median_array.length%2 != 0){
            result = median_array[(n/2)] ;
            return result;
        }
        return 0;
    }
}
