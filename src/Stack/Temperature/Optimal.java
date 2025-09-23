package Stack.Temperature;

// array of integers contains daily temperatures
// return an array 'asnwers'
//basically from today or current index, find the next greater element index, then store the difference in the array 'asnwer'

//aproach
// create a stack :  done
// find the index of next greatest elements for each of the of the element in the temperature array and store in an array called index : done
// now in answer[j] = index[j] - j(iterating in temperature array)

import java.util.Stack;

class Optimal {
    public int[] dailyTemperatures(int[] temperature) {
        Stack<Integer> stack = new Stack<>();
        int n = temperature.length;
        int[] answer = new int[n];
        int[] index = new int[n];

        // building the index array
        for(int i=n-1 ; i>=0;i--){
            while(!stack.isEmpty() && temperature[i]>=temperature[stack.peek()]){
                stack.pop();
            }
            index[i] = stack.isEmpty()?-1 : stack.peek();
            stack.push(i);
        }

        //building the answer array
        for(int j=0;j<n;j++){
            if (index[j] == -1) {
                answer[j] = 0; // no warmer day
            } else {
                answer[j] = index[j] - j;
            }
        }

        return answer;




    }
}