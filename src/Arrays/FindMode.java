package Arrays;
// mode is the number that occurs maximum number of times in the array
public class FindMode {
    public static int findMode(int[] arr){
        int mode = 0 ; //index
        int count = 0 ; //count of each element
        int curr_count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    curr_count++; //increase the current count of mode i
                }
            }
            if(curr_count>count){ // if the current count of mode i is greater than other count
                count =curr_count; // make curr_count as the new count
                mode = i; //make this 'i' the new mode
            }
            curr_count=0;
        }
        return mode;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,2,1,2,3,3,3,3,3,1,3,2,2,2,2,7,7,7,7,7,7,7,7,5,5};
        int mode = findMode(arr);
        System.out.println(arr[mode]);

    }
}
