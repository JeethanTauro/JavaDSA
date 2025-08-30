package Strings.Anagram;


public class Better {
    static final int CHAR_COUNT = 256 ;
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() == str2.length()){
            int[] characters = new int[CHAR_COUNT];
            for(int i=0;i<str1.length();i++){
                characters[str1.charAt(i)]++;
                characters[str2.charAt(i)]--;
            }
            for(int i=0;i<CHAR_COUNT;i++){
                if(characters[i] != 0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1,s2));
    }
}
