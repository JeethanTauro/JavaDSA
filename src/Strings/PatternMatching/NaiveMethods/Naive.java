package Strings.PatternMatching.NaiveMethods;

public class Naive {
    public static void patternMatching(String text , String pattern){
        int len = text.length() - pattern.length();
        for(int i=0;i<=len;i++){
            int count = 0;
            for(int j=0;j<pattern.length();j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
                else {
                    count++;
                }
            }
            if(count == pattern.length()){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        String text1 = "ABABABCD";
        String pattern1 = "ABAB";

        String text2 = "ABCABCD";
        String pattern2 = "ABCD";

        patternMatching(text2,pattern2);
    }
}
