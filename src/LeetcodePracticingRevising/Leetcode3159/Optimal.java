package LeetcodePracticingRevising.Leetcode3159;


class Optimal {
    public int[] occurrencesOfElement(int[] arr, int[] queries, int x) {
        int[] result = new int[queries.length];
        int k = 0;


        int count_of_x = 0;
        //first count x
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                count_of_x++;
            }
        }

        //populating the index array
        int[] indexes_of_x = new int[count_of_x];
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                indexes_of_x[j++] = i;
            }
        }


        //queries
        for(int query : queries){
            if(query > count_of_x){
                result[k++] = -1;
            }
            else{
                result[k++] = indexes_of_x[query-1];
            }
        }
        return result;
    }
}