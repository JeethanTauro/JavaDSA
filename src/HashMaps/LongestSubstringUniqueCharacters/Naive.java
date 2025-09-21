package HashMaps.LongestSubstringUniqueCharacters;

//return max length of unique substring
public class Naive {
    public static boolean isDistinct(String str, int i, int j){
        boolean[] visited = new boolean[256];
        for(int k=i;k<=j;k++){

            if(visited[str.charAt(k)]){ //if any of the haracter is visited then return false
                return false;
            }
            visited[str.charAt(k)]=true;
        }
        return true;
    }
    public static int unique(String str){
        int res = 0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(isDistinct(str, i, j)){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(unique("abcdabc"));
    }
}
