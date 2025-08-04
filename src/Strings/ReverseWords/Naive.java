package Strings.ReverseWords;

public class Naive {
    public static void reverse(String str){
        StringBuilder answer = new StringBuilder();
        str = str.trim(); // removes the starting and ending spaces
        int len = str.length();
        int sub_start = len-1;
        int sub_end = len-1;
        for(int i = len-1 ; i>=0 ; i--){
            if(str.charAt(i) != ' '){
                sub_start--;
            }
            else {
                answer.append(str.substring(sub_start,sub_end));
                sub_start = len-answer.length()-1;
                sub_end = len-answer.length()-1;
            }
        }

    }
    public static void main(String[] args) {

    }
}
