package Strings;
// leetcode 125
public class ValidPalindrome {
    public static boolean palindrom(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrom("race    car"));
    }
}
