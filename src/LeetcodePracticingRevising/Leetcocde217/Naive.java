package LeetcodePracticingRevising.Leetcocde217;

public class Naive {
    public static boolean containsDuplicates(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>1){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
