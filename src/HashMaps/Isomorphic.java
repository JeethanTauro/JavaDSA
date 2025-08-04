package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

//leetcode 205
public class Isomorphic{
    public static boolean isomorphic(String str1, String str2){
        if(str2.length() != str1.length()){
            return false;
        }
        char[] chars1 = str1.toCharArray(); //paper
        char[] chars2 = str2.toCharArray(); //title
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i< str2.length();i++){
            if(map.containsKey(chars1[i])) { //if the map already contains the key
                if (map.get(chars1[i]) != chars2[i]) { //if key already mapped to one character
                    return false;
                }
            }
            else {
                if (set.contains(chars2[i])) {// if key already mapped by some character
                    return false;
                }
                map.put(chars1[i], chars2[i]);
                set.add(chars2[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isomorphic("egg","add"));
    }
}
