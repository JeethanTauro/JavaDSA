package HashMaps.LongestSubstringUniqueCharacters;

import java.util.HashMap;

public class Optimal {
    public static int unique(String str){
        HashMap<Character , Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for(int right=0;right<str.length();right++){
            if(map.containsKey(str.charAt(right))){
                left = Math.max(left, map.get(str.charAt(right)) + 1);
            }
            res = Math.max(res, right-left+1);
            map.put(str.charAt(right) , right);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
