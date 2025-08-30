package Strings.FirstUniqueCharacter;

//leetcode 387
public class Solution {
    public static int firstUnique(String s){
        int[] characterCount = new int[256];
        for(int i=0;i<s.length();i++){
            characterCount[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(characterCount[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String str2 = "apple";
        System.out.println(firstUnique(str2));
    }
}
