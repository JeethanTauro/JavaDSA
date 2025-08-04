package Strings.Anagram;
import java.util.Arrays;
public class Naive {
    public static boolean anagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(anagram(s1,s2));
    }
}
