package Strings.LeftMostRepeatingCharacter;

public class Naive {
    public static int leftmost(String str){
        int leftMostIndex = 9999;
        int[] characterCount = new int[256];
        for(int i=0;i<str.length();i++){
            characterCount[str.charAt(i)]++;
        }
        for(int i=0;i<characterCount.length;i++){
            if(characterCount[i]>1){
                leftMostIndex = Math.min(leftMostIndex , str.indexOf((char)i)); //converted the integer into a character
            }
        }
        return leftMostIndex;

    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String str2 = "abbcc";
        String str3 = "Joeethanttt";
        System.out.println(leftmost(str3));
    }
}
