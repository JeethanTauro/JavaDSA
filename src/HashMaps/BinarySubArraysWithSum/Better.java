package HashMaps.BinarySubArraysWithSum;

import java.util.HashMap;
import java.util.HashSet;

public class Better {
    public static int subarray(int[] arr, int target){
        HashMap<Integer,Integer> map  = new HashMap<>();
        int prefix = 0;
        int count = 0;
        map.put(0,1);
        for(int num : arr){
            prefix += num;
            if(map.containsKey(prefix-target)){
                count = count + map.get(prefix-target);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
