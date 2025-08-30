package Strings.ReverseWords;

import java.util.Stack;

public class Naive {
    public static String reverse(String str){
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                s.append(str.charAt(i));  //append the characters to the s
            }

            else{ //if you see a ' ', push the s to the stack and then empty the s
                stack.push(new StringBuilder(s));
                s.setLength(0); //reset the string;
            }
        }
        // push last word
        if(s.length() > 0){
            stack.push(new StringBuilder(s));
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
            if(!stack.isEmpty()){ // add spaces between words
                result.append(" ");
            }
        }
        str = result.toString();
        return str;
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverse(str));
    }
}
