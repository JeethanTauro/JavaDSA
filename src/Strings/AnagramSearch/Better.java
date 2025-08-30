package Strings.AnagramSearch;

import java.util.Arrays;

public class Better {
    public static boolean anagramSearch(String text, String pattern){
        int[] characterCountText = new int[256];
        int[] characterCountPattern = new int[256];

        //initialised the count arrays
        for(int i=0;i<pattern.length();i++){
            characterCountText[text.charAt(i)]++;
            characterCountPattern[pattern.charAt(i)]++;
        }
        for(int i=pattern.length();i<text.length();i++){
            if(Arrays.equals(characterCountText,characterCountPattern)){
                return true;
            }
            characterCountText[text.charAt(i)]++;
            characterCountText[text.charAt(i-pattern.length())]--;
        }
        return false;
    }
    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "frog";
        System.out.println(anagramSearch(text,pattern));
    }
}
