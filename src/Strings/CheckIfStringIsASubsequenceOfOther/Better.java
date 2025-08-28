package Strings.CheckIfStringIsASubsequenceOfOther;

public class Better {
    public static boolean isSubsequence(String s1, String s2){
        if(s1.length() < s2.length()){
            return false;
        }
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            else {
                i++;
            }
        }
        if(j == s2.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "Jeethan";
        String s2 = "tan";
        System.out.println(isSubsequence(s1,s2));


    }
}
