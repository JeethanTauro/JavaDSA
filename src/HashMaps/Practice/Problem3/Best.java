package HashMaps.Practice.Problem3;

import java.util.ArrayList;
import java.util.HashMap;

public class Best {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr1){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        for(int num : arr2){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        map.forEach((key,val)->{
            if(val > 1){
                answer.add(key);
            }
        });
        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {4,2};
        System.out.println(intersection(arr1,arr2));
    }
}
