class CountDistinctElementsNaive {
  public static int count(int[] arr){
    int length = arr.length;
    int result = 0;
    for(int i=0;i<length;i++){
      boolean flag = false;
      for(int j=0;j<i;j++){
        if(arr[i] == arr[j]){
          flag = true;
          break;
        }
      }
      if(flag == false){
        result++;
      }
    }
    return result;
  }
   public static void main(String[] args){
     int[] arr = {15,12,13,10,12,13,18};
     System.out.println(count(arr));
    
   } 
}