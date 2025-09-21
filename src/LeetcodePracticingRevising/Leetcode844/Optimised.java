package LeetcodePracticingRevising.Leetcode844;

class Optimised {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int backspacesS = 0;
        int backspacesT = 0;

        while(i>=0 || j>=0){
            while(i>=0){
                if(s.charAt(i) == '#'){
                    backspacesS++;
                    i--;
                }
                else if(s.charAt(i)!='#' && backspacesS>0){
                    backspacesS--;
                    i--;
                }
                else{
                    break;
                }
            }
            while(j>=0){
                if(t.charAt(j) == '#'){
                    backspacesT++;
                    j--;
                }
                else if(t.charAt(j)!='#' && backspacesT>0){
                    backspacesT--;
                    j--;
                }
                else{
                    break;
                }
            }
            if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)){
                return false;
            }
            if((i>=0) != (j>=0)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
