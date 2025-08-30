package Strings.CheckIfStringIsASubsequenceOfOther;

public class BetterRecursively {
    public static boolean isSubsequence(String s1, String s2, int n, int m){
        if(s2.length()>s1.length()){
            return false;
        }
        if(m == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(s1.charAt(n) == s2.charAt(m)){
            return isSubsequence(s1,s2,n-1,m-1);
        }
        return isSubsequence(s1,s2,n-1,m);
    }
    public static void main(String[] args) {
        String s1 = "Jeethan";
        String s2 = "tan";
        System.out.println(isSubsequence(s1,s2,s1.length()-1,s2.length()-1));

    }
}
