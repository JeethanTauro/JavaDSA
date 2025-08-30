package Strings.IfStringsAreRotationsOfEachOther;

public class Naive {
    public static boolean rotationCheck(String s1, String s2){
        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);

        for(int k = 0; k< str1.length();k++){
            if(str1.toString().equals(str2.toString())){
                return true;
            }
            char temp = str1.charAt(0);
            for(int i=0;i<str1.length()-1;i++){
                str1.setCharAt(i , str1.charAt(i+1));
            }
            str1.setCharAt(str1.length()-1 , temp);
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(rotationCheck(s1,s2));
    }
}
