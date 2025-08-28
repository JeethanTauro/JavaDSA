package HashMaps.SubArrayZero;


import java.util.HashMap;
import java.util.HashSet;

//if the prefix sum already exists then thre is a subarray with sum 0
public class Better {
    public static int[] sumZero(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefix = prefix + arr[i];
            if(!map.containsKey(prefix)){
                map.put(prefix,i);
            }
            else {
                return new int[]{map.get(prefix)+1, i};
            }
        }
        return null;

    }
    public static void main(String[] args) {
        int[] arr = {-3, 4, -3, -1, 1};
        int[] indexes = sumZero(arr);

        if(indexes != null){
            int start = indexes[0];
            int end = indexes[1];
            System.out.println("Subarray with sum 0 found between: " + start + " and " + end);
            for(int i = start; i <= end; i++){
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("No subarray with sum 0");
        }
    }
}
