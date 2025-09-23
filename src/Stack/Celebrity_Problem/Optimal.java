package Stack.Celebrity_Problem;

import java.util.Stack;

public class Optimal {
    public static int whoIsCeleb(int[][] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            stack.push(i);
        }

        while(stack.size() > 1){
            int i = stack.pop();
            int j = stack.pop();

            if(arr[i][j] == 1){
                stack.push(j);
            }
            else{
                stack.push(i);
            }
        }
        int celeb = stack.pop();
        for(int i=0;i<arr.length;i++){
            if((celeb != i) && (arr[celeb][i]==1 || arr[i][celeb]==0)){
                return -1;
            }
        }
        return celeb;
    }

    public static void main(String[] args) {
        int[][]arr = {{0,1,0} ,
                      {0,0,0} ,
                      {0,1,0}};
        System.out.println(whoIsCeleb(arr));
    }
}
/*
class CelebrityProblem {
    public static int findCelebrity(int[][] arr) {
        int n = arr.length;
        int a = 0, b = n - 1;

        // Step 1: Find the candidate
        while (a < b) {
            if (arr[a][b] == 1) {
                // a knows b → a cannot be celeb
                a++;
            } else {
                // a does not know b → b cannot be celeb
                b--;
            }
        }

        int candidate = a;

        // Step 2: Verify candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
                    return -1; // not a celebrity
                }
            }
        }

        return candidate; // celebrity found
    }

    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };
        System.out.println(findCelebrity(arr)); // Output: -1
    }
}
*/

