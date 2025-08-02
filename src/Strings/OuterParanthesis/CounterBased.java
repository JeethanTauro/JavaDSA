package Strings.OuterParanthesis;

//leetcode 1021
// we have to decompose the given paranthesis and remove the outer paranthesis.
// eg : (()()())(()()) => ()()()+()() => ()()()()()
public class CounterBased {
    public static String outer(String str){
        StringBuilder a = new StringBuilder();
        int counter = 0;
        for(int i=0;i<str.length();i++){

            //if the character is '(' we have to check first check the counter and then append if counter is not zero then increment
            if(str.charAt(i) == '('){
                if(counter > 0){
                    a.append(str.charAt(i));
                }
                counter++;

            }
            //if the character is ')' first decrement then check if counter is zero then append
            else if(str.charAt(i) == ')'){
                counter--;
                if(counter > 0){
                    a.append(str.charAt(i));
                }
            }

        }
        return a.toString();
    }
    public static void main(String[] args) {
        String str = "(()()())(())";
        System.out.println(outer(str));
    }
}
