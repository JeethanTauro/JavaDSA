package LeetcodePracticingRevising.Leetcocde217;
import java.util.Arrays;
public class Better {
    public static boolean containsDuplicates(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
