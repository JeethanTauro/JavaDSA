package HashMaps.Practice.Problem2;

import java.util.ArrayList;

//union of 2 arrays
public class Naive1 {
    public static ArrayList<Integer> union(int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            answer.add(arr1[i]); //added values from arr1 to answer
        }
        for(int i=0;i<arr2.length;i++){
            boolean isPresent = false;
            for(int j=0;j<answer.size();j++){
                if(arr2[i] == answer.get(j)){
                    isPresent = true;
                   break;
                }
            }
            if(!isPresent){
                answer.add(arr2[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        //answer = {1,2,3,5};
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,4,5,2};
        System.out.println(union(arr1,arr2));
    }
}
