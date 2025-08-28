package HashMaps.CountDistinctElements;
import java.util.*;
public class CountDistinctElementsBetter {
    public static int count(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {15,12,13,10,12,13,18};
        System.out.println(count(arr));

    }
}
