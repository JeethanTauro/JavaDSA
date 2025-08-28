package HashMaps.UnionOfTwoArrays;

import java.util.ArrayList;

public class Naive {
    public static int union(int[] arr1 , int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(!list.contains(arr1[i])){
                list.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(!list.contains(arr2[i])){
                list.add(arr2[i]);
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,25,30,50};
        int[] arr2 = {30,5,15,80};
        System.out.println(union(arr1,arr2));
    }
}
