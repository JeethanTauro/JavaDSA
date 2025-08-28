package HashMaps.IntersectionOf2UnsortedArrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Best {
    public static void intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if(set.contains(arr1[i])){
                System.out.println(arr1[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,25,30,50};
        int[] arr2 = {30,5,15,80};
        intersection(arr1,arr2);
    }
}
