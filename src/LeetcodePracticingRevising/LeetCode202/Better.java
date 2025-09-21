package LeetcodePracticingRevising.LeetCode202;

public class Better {
    public int getNext(int n){
        int sum = 0;
        int d = 0;
        while(n > 0){
            d = n%10; //take the digit
            d = d*d; //square it
            sum = sum + d; //add it to the sum
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while(slow!=fast && fast != 1){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
    public static void main(String[] args) {

    }
}
