import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = arr[i]+prefix[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(prefix[7]);
        System.out.println(prefix[7]-prefix[2]);

    }
}
