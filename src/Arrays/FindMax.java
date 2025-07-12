package Arrays;

public class FindMax {
    public static int findMax(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,7};
        int index = findMax(arr);
        System.out.println(index);

    }
}
