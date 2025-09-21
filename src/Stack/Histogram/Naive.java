package Stack.Histogram;

class Naive {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int i = 0;

        while(i < n){
            int left = i;
            int right = i;

            while(left>=0 && heights[left] >= heights[i]){
                left--;
            }


            while(right<n && heights[right]>=heights[i]){
                right++;
            }

            int width = right-left-1;
            maxArea = Math.max(maxArea , heights[i]*width);
            i++;
        }
        return maxArea;
    }
}
