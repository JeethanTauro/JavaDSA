package HashMaps.WordPattern;

import java.util.*;
//leetcode 290
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>(); // track words already mapped

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) { // mismatch
                    return false;
                }
            } else {
                if (used.contains(w)) { // word already mapped to another char
                    return false;
                }
                map.put(c, w);
                used.add(w);
            }
        }

        return true;
    }
}
