package HashMaps.TwoSum;

import java.util.ArrayList;
import java.util.HashSet;

public class Better {
    public static ArrayList<Integer> twoSum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(target - arr[i])){
                set.add(arr[i]);
            }
            else {
                list.add(arr[i]);
                list.add(target-arr[i]);
                return list;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,-3,6};
        int target = 3;
        System.out.println(twoSum(arr,target));
    }
}
