package LeetcodePracticingRevising.Leetcode3159;


class Naive {

    public int occurence(int[] arr, int x, int query){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
            if(count == query){
                return i;
            }
        }
        return -1;
    }


    public int[] occurrencesOfElement(int[] arr, int[] queries, int x) {
        int[] result = new int[queries.length];
        int i=0;
        for(int query : queries){
            result[i++] = occurence(arr,x,query);
        }
        return result;
    }
}
