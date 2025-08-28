package HashMaps.TwoSum;

import java.util.ArrayList;
import java.util.Set;

public class Naive {
    public static ArrayList<Integer> twoSum(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i!=j){
                    if((arr[i]+arr[j]) == target){
                        list.add(arr[i]);
                        list.add(arr[j]);
                        return list;
                    }
                }
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
