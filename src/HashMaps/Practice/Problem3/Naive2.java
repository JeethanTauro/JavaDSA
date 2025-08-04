package HashMaps.Practice.Problem3;

import java.util.ArrayList;
import java.util.Arrays;

public class Naive2 {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> answer = new ArrayList<>();
        int i=0;
        int j=0;
        int val = 0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i] == arr2[j]) {
                if (answer.isEmpty() || answer.getLast() != arr1[i]) {
                    answer.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4};
        System.out.println(intersection(arr1,arr2));
    }
}
