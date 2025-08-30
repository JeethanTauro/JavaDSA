package LeetcodePracticingRevising.Leetcocde217;

import java.util.HashSet;

public class Best {
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
