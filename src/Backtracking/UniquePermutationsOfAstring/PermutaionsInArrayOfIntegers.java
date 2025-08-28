package Backtracking.UniquePermutationsOfAstring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutaionsInArrayOfIntegers {
    public static void swap(ArrayList<Integer> arr, int i, int start){
        int temp = arr.get(i);
        arr.set(i,arr.get(start));
        arr.set(start,temp);
    }
    public static ArrayList<ArrayList<Integer>> permutations(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int start = 0;
        solve(arr,start,list);
        return list;
    }
    public static void solve(ArrayList<Integer> arr, int start, ArrayList<ArrayList<Integer>> list){
        if(start == arr.size()-1){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=start ; i<arr.size();i++){
            swap(arr,i,start);
            solve(arr,start+1,list);
            swap(arr,i,start);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3));
        System.out.println(permutations(list));
    }
}
