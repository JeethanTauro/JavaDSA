package LeetcodePracticingRevising.Leetcode11;

public class Naive {
    public int maxArea(int[] height) {
        int max_area = 0;
        for(int i=0;i<height.length;i++){
            int curr_area = 0;
            for(int j=i+1;j<height.length;j++){
                curr_area = Math.min(height[i],height[j])*(j-i);
                max_area = Math.max(curr_area , max_area);
            }
        }
        return max_area;
    }
}
