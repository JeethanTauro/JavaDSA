package Strings.LongestCommonPrefix;

//leetcode 14
public class Naive {
    public static String common(String[] str_list){
        String reference = str_list[0];

        for(int i=0;i<reference.length()-1;i++){
            //first we took the character from the reference string
            char ch = reference.charAt(i);
            for (int j=1;j<str_list.length;j++){
                // now we take character from the other strings
                if(str_list[j].charAt(i) != ch || i>=str_list[j].length()){
                    //now if there is a mismatch that means from the reference character 0 to i was the max common substring
                    //and i >= str_list[j].length() checks if we're out of bounds (in case strings are of different lengths).
                    return reference.substring(0,i);
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] list = {"Clumsy","Club","Cluster"};
        System.out.println(common(list));
    }
}
/*
🧠 Why i >= strs[j].length()?
This checks whether we're trying to access an index i that doesn't exist in strs[j].

🧾 Example:
Let’s say:

java
Copy
Edit
String[] strs = {"flow", "fl", "fly"};
strs[0] = "flow" → length = 4

strs[1] = "fl" → length = 2

strs[2] = "fly" → length = 3

Loop:

i = 0 → All strings have index 0 → Check 'f' ✅

i = 1 → All strings have index 1 → Check 'l' ✅

i = 2:

strs[0].charAt(2) = 'o'

strs[1].length() = 2 → there is no index 2 → so i >= strs[1].length() is true

Without this condition, you'd try to access strs[1].charAt(2) — which would cause a StringIndexOutOfBoundsException at runtime.

✅ So in summary:
The condition

if (i >= strs[j].length())
prevents runtime errors by checking whether the string strs[j] has a character at index i before trying to access it.

It also naturally terminates the prefix search — because no prefix can be longer than the shortest string in the array.
 */

