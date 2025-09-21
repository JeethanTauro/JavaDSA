package LeetcodePracticingRevising.Leetcode844;

class Naive {
    public String build(String s){
        //trying to simulate how typing works
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '#'){ //if the character is a backspace then just delete the last current character
                if(str.length()>0){
                    str.deleteCharAt(str.length()-1);
                }
            }
            else{//else append it to str
                str.append(c);
            }
        }
        return str.toString();

    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}
