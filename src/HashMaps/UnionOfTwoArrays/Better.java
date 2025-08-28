package HashMaps.UnionOfTwoArrays;

import jdk.jshell.JShell;

import java.util.ArrayList;
import java.util.HashSet;

public class Better {
    public static int union(int[] arr1 , int[] arr2){
        HashSet<Integer> set  = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,25,30,50};
        int[] arr2 = {30,5,15,80};
        System.out.println(union(arr1,arr2));
    }
}
