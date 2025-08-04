package Strings.OuterParanthesis;

import java.util.ArrayList;
import java.util.Stack;

public class StackBased {
    public static String outer(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                if(!stack.isEmpty()){
                    answer.append(str.charAt(i));
                }
                stack.push(str.charAt(i));

            }
            else if(str.charAt(i) == ')'){
                stack.pop();
                if(!stack.isEmpty()){
                    answer.append((str.charAt(i)));
                }
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        String str = "(()()())(())";
        System.out.println(outer(str));
    }
}
