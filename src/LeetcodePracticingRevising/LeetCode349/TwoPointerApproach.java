package LeetcodePracticingRevising.LeetCode349;
import java.util.*;
public class TwoPointerApproach {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        HashSet<Integer> list = new HashSet<>();
        while(i<nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j] ){
                j++;
            }
            else{
                i++;
            }
        }
        int k= 0;
        int[] result = new int[list.size()];
        for(int num : list){
            result[k]=num;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
