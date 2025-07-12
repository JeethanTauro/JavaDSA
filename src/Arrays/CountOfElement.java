package Arrays;

public class CountOfElement {
    public static int count(int[] arr, int target){
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4,4,5};
        int c = count(arr,4);
        System.out.println(c);

    }
}
