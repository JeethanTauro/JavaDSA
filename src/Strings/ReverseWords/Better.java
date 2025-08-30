package Strings.ReverseWords;

public class Better {
    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

    public static String reverse(String str, int start, int end) {
        StringBuilder sb = new StringBuilder(str);
        while (start < end) {
            swap(sb, start, end);
            start++;
            end--;
        }
        return sb.toString();
    }
    public static String reverseWords(String str){
        int start = 0;
        for(int end = 0;end<str.length();end++){
            if(str.charAt(end) == ' '){
                str = reverse(str,start,end-1 ); //reversing each word
                start = end+1;
            }
        }
        str = reverse(str,start,str.length()-1); //reversing the last word
        str = reverse(str,0,str.length()-1); //reverse the entire string
        return str;
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseWords(str));
    }
}
