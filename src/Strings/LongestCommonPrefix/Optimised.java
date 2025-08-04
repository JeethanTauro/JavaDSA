package Strings.LongestCommonPrefix;


import java.util.Arrays;

//sort the array of strings and check the common in first and last
public class Optimised {
    public static String common(String[] list) {
        Arrays.sort(list);
        String first = list[0];
        String last = list[list.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
        public static void main (String[] args){
            String[] list = {"Clumsy","Club","Cluster"};
            System.out.println(common(list));
        }

}