package Strings.AnagramSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Naive {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() == str2.length()){
            int[] characters = new int[256];
            for(int i=0;i<str1.length();i++){
                characters[str1.charAt(i)]++;
                characters[str2.charAt(i)]--;
            }
            for(int i=0;i<256;i++){
                if(characters[i] != 0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean anagramSearch(String text, String pattern){
        for(int i=0;i<=text.length()-pattern.length();i++){
            if(isAnagram(text.substring(i , i+pattern.length()) , pattern)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "frog";
        System.out.println(anagramSearch(text,pattern));
    }
}
