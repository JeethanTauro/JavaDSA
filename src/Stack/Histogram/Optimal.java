package Stack.Histogram;

import java.util.*;

class Optimal {
    public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int maxArea = 0;


        //find the right boundaries of each of the bars
        int[] right = new int[height.length];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && height[stack.peek()]>=height[i]){
                stack.pop();
            }
            //if the right boundary doesnt exist then the boundary is the last index
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        //find the left boundaries of each of the bars
        while(!stack.isEmpty()){ //reusing the same stack
            stack.pop();
        }
        int[] left = new int[height.length];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && height[stack.peek()]>=height[i]){
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        //calculating the area
        for(int i=0;i<n;i++){
            int width = right[i]-left[i] -1;
            int currArea = height[i]*width;
            maxArea = Math.max(currArea , maxArea);
        }
        return maxArea;

    }
}

