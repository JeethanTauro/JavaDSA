package HashMaps.Stones_Jewels;

//leetcode 771
public class Naive {
    public static int jewels_stones(String str1, String str2){
        char[] jewels = str1.toCharArray();
        char[] stones = str2.toCharArray();
        int count = 0;
        for(int i=0;i<str1.length();i++){
            for(int j = 0;j<str2.length();j++){
                if(jewels[i] == stones[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String jewels = "z";
       String stones = "ZZ";
        System.out.println(jewels_stones(jewels,stones));
    }
}
