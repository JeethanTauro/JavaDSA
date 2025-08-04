package HashMaps.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//Givn an integer of size n, find all elements that appear more than n/3(floor) times
public class Problem1 {
    public static  ArrayList<Integer> find(int[] arr, int n){
        //HashMap<Element, frequency> map
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//           if(!map.containsKey(arr[i])){// if the key/element is not present in the map then add it but with frquency 1
//                map.put(arr[i],1);
//           }
//           else {
//               map.put(arr[i],map.get(arr[i])+1); //if the element is already present then add it but then increment the value/frequncy
//           }
//        }
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        map.forEach((key,val)->{
            if(val > n/3){
                answer.add(key);
            }
        });
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,4,4,5,6,7,7};//n=14
        System.out.println(find(arr,arr.length));

    }
}
