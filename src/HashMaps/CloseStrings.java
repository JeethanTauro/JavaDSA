package HashMaps;

import java.util.*;

//leetcode 1657
public class CloseStrings {
    public static boolean close(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>(); // to get the char and frequency of string 1
        HashMap<Character,Integer> map2 = new HashMap<>(); // to get the char and frequency of string 2
        for(int i=0;i<s.length();i++){
            //populating map
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        //the hashmaps must have the same keys
        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }
        //list of frequencies
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);
        //the sets must be equal
        for(int i=0;i<freq1.size();i++){
            if(!freq1.equals(freq2) ){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(close("abc","bca"));
    }
}
