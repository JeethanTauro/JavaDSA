package Stack.Evaluate_Postfix;

//if the element is an operand , then push it to the stack
// if the element is an operator then pop top 2 and perofrms the operation and then push it back into the stack
// final element in stack is the answer

import java.util.Stack;

class Solution {
    public int eval(int a , int b, String token){
        switch(token){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default: return -1;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") ){
                int b = stack.pop();
                int a = stack.pop();
                int c = eval(a,b,token);
                stack.push(c);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();

    }
}
