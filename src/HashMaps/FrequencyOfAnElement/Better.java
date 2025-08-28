package HashMaps.FrequencyOfAnElement;

import java.util.HashMap;

public class Better {
    public static void frequencies(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        map.forEach((k,v)-> System.out.println(k + " - "+v));
    }
    public static void main(String[] args) {
        int[] arr = {10,12,10,15,10,20,12,12};
        frequencies(arr);
    }
}
