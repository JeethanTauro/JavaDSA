package Strings.LeftMostRepeatingCharacter;

public class Better {
    public static int leftmost(String str){
        int[] characterCount = new int[256];
        for(int i=0;i<str.length();i++){
            characterCount[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(characterCount[str.charAt(i)]>1){
               return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String str2 = "abbcc";
        String str3 = "Joeethanttt";
        System.out.println(leftmost(str3));
    }
}
