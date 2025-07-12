package Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        int second = 0;
        int max = 0;
        int diff = 999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if((arr[max]-arr[i] < diff) && max!=i){
                diff = arr[max]-arr[i];
                second = i;
            }
        }


        return second;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int second = secondLargest(arr);
        System.out.println(arr[second]);
    }
}
