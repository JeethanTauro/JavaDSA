package HashMaps.FirstUniqueCharacter;

import java.util.HashMap;

public class Best {
    public static int unique(String str){
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        //first put all the characters with its frequency in the hashmap
        for(int i=0;i<str.length();i++){
            map.put(chars[i], map.getOrDefault(chars[i], 0)+1);
        }
        //travers the string in order and check the first letter that has frequny only 1
        for(int i=0;i<str.length();i++){
            if(map.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String name = "jeethan";

    }
}
