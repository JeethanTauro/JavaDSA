package Strings;

//leetcode 1903
public class LargestOddNumberInAsubstring {
    public static int toInt(String str){
        return Integer.parseInt(str);
    }
    public static String maxOdd(String str){
        for(int i=str.length()-1; i>=0;i--){
            if(((str.charAt(i)-'0')%2) == 1){ //if the character is odd
                return str.substring(0,i+1);
            }
        }
        return " ";
    }
    public static void main(String[] args) {
        String str = "52";
        System.out.println(maxOdd(str));
    }
}
