package Stack.Next_Greater_Element_2;

import java.util.Stack;

class Optimal {
    public int[] nextGreaterElements(int[] nums) {

        // //the intuition is instead of trying to iterate again in the array why not just double the array
        // int n = nums.length;
        // int[] nums_doubled = new int[2 * n];
        // int[] result = new int[n];
        // Stack<Integer> stack = new Stack<>();

        // // Fill the doubled array
        // for (int i = 0; i < 2 * n; i++) {
        //     nums_doubled[i] = nums[i % n];
        // }

        // // Process from right to left
        // for (int i = 2 * n - 1; i >= 0; i--) {
        //     while (!stack.isEmpty() && stack.peek() <= nums_doubled[i]) {
        //         stack.pop();
        //     }
        //     if (i < n) { // only fill for the first n elements
        //         result[i] = stack.isEmpty() ? -1 : stack.peek();
        //     }
        //     stack.push(nums_doubled[i]);
        // }

        //or we can preload the stack with revers of the nums array to simulate circularity
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Step 1: preload stack with nums in reverse order (to simulate circularity)
        for (int i = n - 1; i >= 0; i--) {
            st.push(nums[i]);
        }

        // Step 2: standard Next Greater Element logic
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }
}
