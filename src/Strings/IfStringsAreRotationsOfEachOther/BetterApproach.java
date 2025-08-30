package Strings.IfStringsAreRotationsOfEachOther;

public class BetterApproach {
    public static boolean rotationsCheck(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return ((s1+s1).contains(s2));
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(rotationsCheck(s1,s2));
    }
}
