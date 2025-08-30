package Strings.PatternMatching.NaiveMethods;

public class ImprovedForDistinctPattern {
    public static void patternMatching(String text, String pattern){
        int len = text.length() - pattern.length();
        for(int i=0;i<=len;){
            int j=0;
            for(j=0;j<pattern.length();j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            if(j == pattern.length()){
                System.out.println(i);
            }
            if(j==0){
                i++;
            }
            else {
                i = i+j;
            }
        }
    }
    public static void main(String[] args) {

        String text2 = "ABCABCD";
        String pattern2 = "ABCD";

        patternMatching(text2,pattern2);
    }
}
