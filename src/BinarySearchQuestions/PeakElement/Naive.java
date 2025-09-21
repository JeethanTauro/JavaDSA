package BinarySearchQuestions.PeakElement;

class Naive {
    public int findPeakElement(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }

        for(int i=0;i<arr.length;i++){
            if(i == 0){
                if(arr[i] > arr[i+1]){
                    return i;
                }
            }
            else if(i == arr.length-1){
                if(arr[i] > arr[i-1]){
                    return i;
                }
            }
            else{
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    return i;
                }
            }
        }
        return -1; //dummy return;
    }
}
