package HashMaps.IntersectionOf2UnsortedArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Better {
    public static void intersection(int[] arr1, int[] arr2){
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        map.forEach((k,v)->{
            if(v==2){
                System.out.println(k);
            }
        });
    }
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,25,30,50};
        int[] arr2 = {30,5,15,80};
        intersection(arr1,arr2);

    }
}
