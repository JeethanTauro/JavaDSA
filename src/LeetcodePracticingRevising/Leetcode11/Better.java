package LeetcodePracticingRevising.Leetcode11;
//The area of the water depends on the height of the minimum bar, so we change that.
public class Better {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int minHeight = Math.min(height[left] , height[right]);
            int width = right - left;
            int curr_area = minHeight * width;
            max_area = Math.max(curr_area , max_area);

            //we shift the pointer of the minimum bar
            while(left < right && height[left] <= minHeight) left++;
            while(left < right && height[right] <= minHeight) right--;
        }
        return max_area;
    }
}
