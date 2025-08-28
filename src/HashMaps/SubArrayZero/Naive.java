package HashMaps.SubArrayZero;

public class Naive {
    public static int[] sumZero(int[] arr){
        for(int i=0; i<arr.length ; i++){
            int sum = 0;
            for(int j = i;j< arr.length;j++){
                sum = sum + arr[j];
                if(sum == 0){
                   return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {-3,4,-3,-1,1};
        int[] indexes = sumZero(arr);
        if(indexes != null){
            int start = indexes[0];
            int end = indexes[1];
            for(int i=start ; i<=end ; i++ ){
                System.out.println(arr[i]);
            }
        }
        else{
            System.out.println(indexes);
        }

    }
}
