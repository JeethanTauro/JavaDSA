package HashMaps.LongestSubstringUniqueCharacters;

public class Better {
    public static int unique(String str){
        int res = 0;
        for(int i=0;i<str.length();i++){
            boolean[] visited = new boolean[256];
            for(int j=i;j<str.length();j++){
                if(visited[str.charAt(j)]){
                   break;
                }
                else{
                    res = Math.max(res, j-i+1);
                    visited[str.charAt(j)] = true;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(unique("abcdabc"));
    }
}
