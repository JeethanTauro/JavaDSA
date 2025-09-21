package LeetcodePracticingRevising.Leetcode2965;

import java.util.HashMap;

public class Better {

    // what we are doing is basically we initialise our map first with all the possible values
    // and their count as 0,
    // then we loop the grid and if then number is there then increase its count
    // number which has occured 2 times and  0 times are returned
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = grid.length*grid.length;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i=1;i<=n;i++){
            map.put(i,0); //first initializing the map
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                map.put(grid[i][j] , map.get(grid[i][j])+1);
            }
        }


        int[] result = new int[2];
        int k = 0;


        // Traverse from 1 → n (ensures order)
        for (int i = 1; i <= n; i++) {
            if (map.get(i) == 2) {
                result[0] = i; // repeated
            }
            if (map.get(i) == 0) {
                result[1] = i; // missing
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
