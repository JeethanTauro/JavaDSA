package LeetcodePracticingRevising.Leetcode2965;
import java.util.*;
public class Best {
    //What we can do is check if the number was seen befor or not, that will become our 'a'
    // now we know the number are from 1-> n*n, so we can find an expected sum
    // then we can calculate the actual sum of the grid
    // actual_sum =  expected_sum + a(which is the duplicate) - b (which is missing)
    // now we can find,  b = expected_sum + a - actual_sum;
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int rows = grid.length;
        int cols = grid.length;

        int a = 0;
        int b = 0;
        int expected_sum = ((n*n)*(n*n + 1))/2;
        int actual_sum = 0;
        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){
                actual_sum = actual_sum + grid[i][j];
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        b = expected_sum + a - actual_sum;

        return new int[]{a,b};
    }
}
