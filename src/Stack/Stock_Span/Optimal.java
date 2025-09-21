package Stack.Stock_Span;

import java.util.Arrays;
import java.util.Stack;

public class Optimal {
    public static int[] span(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(stack.size()>0 && arr[(stack.peek())] <= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = i+1;
            }
            else {
                result[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60,70,60,75,85};
        System.out.println(Arrays.toString(span(arr)));


    }
}
