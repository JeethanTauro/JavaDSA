package LeetcodePracticingRevising.LeetCode202;
import java.util.HashSet;
public class Naive {
    public static boolean happyNumber(int n){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while(!(sum == 1)){
            sum = 0;
            int d = 0;
            while(n > 0){
                d = n%10; //take the digit
                d = d*d; //square it
                sum = sum + d; //add it to the sum
                n = n/10;
            }
            n = sum;
            if(set.contains(sum)){
                return false;
            }
            else{
                set.add(sum);
            }

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(happyNumber(19));
    }
}
