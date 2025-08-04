package HashMaps.Practice.Problem3;

import java.util.ArrayList;

public class Naive {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                answer.add(arr1[i]);
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
