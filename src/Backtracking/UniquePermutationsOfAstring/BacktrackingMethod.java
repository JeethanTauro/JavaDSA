package Backtracking.UniquePermutationsOfAstring;

import java.util.ArrayList;
import java.util.HashSet;

public class BacktrackingMethod {
    public static void swap(StringBuilder s, int i, int j){
        char temp  = s.charAt(i);
        s.setCharAt(i,s.charAt(j));
        s.setCharAt(j,temp);
    }
    public static ArrayList<StringBuilder> findPermute(StringBuilder s){
        ArrayList<StringBuilder> list = new ArrayList<>();
        solve(s, 0,list);
        return list;
    }
    public static void solve(StringBuilder s, int start, ArrayList<StringBuilder> list){
        if(start == s.length()-1){
            list.add(new StringBuilder(s));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i=start;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                swap(s,i,start);
                solve(s,start+1,list);
                swap(s,i,start); //backtracking
            }
        }
    }

    public static void main(String[] args) {
        StringBuilder input = new StringBuilder("abc");
        System.out.println(findPermute(input));
    }
}
