package Strings.AnagramSearch;
import java.util.*;

//leetcode 438
public class leetcode {
        public static List<Integer> anagramSearch(String text, String pattern) {
            List<Integer> list = new ArrayList<>();
            int[] characterCountText = new int[256];
            int[] characterCountPattern = new int[256];
            if (pattern.length() > text.length()) {
                return list; // no anagrams possible
            }
            //initialised the count arrays
            for(int i=0;i<pattern.length();i++){
                characterCountText[text.charAt(i)]++;
                characterCountPattern[pattern.charAt(i)]++;
            }
            for(int i=pattern.length();i<text.length();i++){
                if(Arrays.equals(characterCountText,characterCountPattern)){
                    list.add(i-pattern.length());
                }
                characterCountText[text.charAt(i)]++;
                characterCountText[text.charAt(i-pattern.length())]--;
            }

            // check last window
            if (Arrays.equals(characterCountText, characterCountPattern)) {
                list.add(text.length() - pattern.length());
            }

            return list;
        }

        public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "frog";
        System.out.println(anagramSearch(text,pattern));
    }
}
