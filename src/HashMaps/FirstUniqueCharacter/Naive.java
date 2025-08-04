package HashMaps.FirstUniqueCharacter;

//leetcode
public class Naive {
    public static int unique(String str){
        char[] chars = str.toCharArray();
        int count = -1;
        for(int i=0;i<str.length();i++){
            count = -1;
            for(int j=0;j<str.length();j++){
                if(chars[i] == chars[j]){
                    count++;
                }
            }
            if(count == 0 ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "HHello";
        System.out.println(unique(str));
    }
}
