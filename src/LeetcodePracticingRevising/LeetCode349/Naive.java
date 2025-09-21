package LeetcodePracticingRevising.LeetCode349;

import java.util.ArrayList;

public class Naive {
    public static int[] intersection(int[] nums1, int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    if(!list.contains(nums1[i])){
                        list.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
