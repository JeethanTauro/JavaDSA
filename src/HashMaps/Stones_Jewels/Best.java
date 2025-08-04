package HashMaps.Stones_Jewels;

import java.util.HashMap;

public class Best {
    public static int jewels_stones(String str1, String str2){
        char[] jewels = str1.toCharArray();
        char[] stones = str2.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0 ; i<jewels.length;i++){
            map.put(jewels[i],0);
        }
        for(int i=0;i<stones.length;i++){
            if(map.containsKey(stones[i])){
                map.put(stones[i],map.get(stones[i])+1);
            }
        }
        int count = 0;
        for(Integer val : map.values()){
            count = count+val;
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "zzZZ";
        System.out.println(jewels_stones(jewels,stones));
    }
}
